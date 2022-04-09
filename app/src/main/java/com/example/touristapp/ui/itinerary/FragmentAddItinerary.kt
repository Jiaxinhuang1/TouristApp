package com.example.touristapp.ui.itinerary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.touristapp.BaseApplication
import com.example.touristapp.R
import com.example.touristapp.databinding.FragmentAddItineraryBinding
import com.example.touristapp.model.Itinerary
import com.example.touristapp.ui.itinerary.viewmodel.ItineraryViewModel
import com.example.touristapp.ui.itinerary.viewmodel.ItineraryViewModelFactory

class FragmentAddItinerary : Fragment() {

    private val navigationArgs: FragmentAddItineraryArgs by navArgs()

    private var _binding: FragmentAddItineraryBinding? = null

    private lateinit var itinerary : Itinerary

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val viewModel: ItineraryViewModel by activityViewModels {
        ItineraryViewModelFactory(
            (activity?.application as BaseApplication).database.itineraryDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAddItineraryBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = navigationArgs.id
        if (id > 0) {

            viewModel.getItinerary(id).observe(viewLifecycleOwner) { myitnerary ->
                myitnerary.let {
                    itinerary = myitnerary
                    bindItinerary(itinerary)
                }
            }

            binding.deleteBtn.visibility = View.VISIBLE
            binding.deleteBtn.setOnClickListener {
                deleteItinerary(itinerary)
            }
        } else {
            binding.saveBtn.setOnClickListener {
                addItinerary()
            }
        }
    }

    private fun deleteItinerary(itinerary : Itinerary) {
        viewModel.deleteItinerary(itinerary)
        findNavController().navigate(
            R.id.action_fragmentAddItinerary_to_navigation_itinerary
        )
    }

    private fun addItinerary() {
        if (isValidEntry()) {
            viewModel.addItinerary(
                binding.nameInput.text.toString(),
                binding.locationAddressInput.text.toString(),
                binding.hasVisitedCheckbox.isChecked,
                binding.dateInput.text.toString(),
                binding.notesInput.text.toString()
            )
            findNavController().navigate(
                R.id.action_fragmentAddItinerary_to_navigation_itinerary
            )
        }
    }

    private fun updateItinerary() {
        if (isValidEntry()) {
            viewModel.updateItinerary(
                id = navigationArgs.id,
                name = binding.nameInput.text.toString(),
                address = binding.locationAddressInput.text.toString(),
                hasVisited = binding.hasVisitedCheckbox.isChecked,
                date = binding.dateInput.text.toString(),
                notes = binding.notesInput.text.toString()
            )
            findNavController().navigate(
                R.id.action_fragmentAddItinerary_to_navigation_itinerary
            )
        }
    }

    private fun bindItinerary(itinerary: Itinerary) {
        binding.apply{
            nameInput.setText(itinerary.name, TextView.BufferType.SPANNABLE)
            locationAddressInput.setText(itinerary.address, TextView.BufferType.SPANNABLE)
            hasVisitedCheckbox.isChecked = itinerary.hasVisited
            dateInput.setText(itinerary.date, TextView.BufferType.SPANNABLE)
            notesInput.setText(itinerary.notes, TextView.BufferType.SPANNABLE)
            saveBtn.setOnClickListener {
                updateItinerary()
            }
        }

    }

    private fun isValidEntry() = viewModel.isValidEntry(
        binding.nameInput.text.toString(),
        binding.locationAddressInput.text.toString()
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}