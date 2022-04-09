package com.example.touristapp.ui.itinerary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.touristapp.BaseApplication
import com.example.touristapp.R
import com.example.touristapp.adapter.ItineraryListAdapter
import com.example.touristapp.databinding.ActivityMainBinding
import com.example.touristapp.databinding.FragmentItineraryBinding
import com.example.touristapp.ui.itinerary.viewmodel.ItineraryViewModel
import com.example.touristapp.ui.itinerary.viewmodel.ItineraryViewModelFactory

class ItineraryFragment : Fragment() {

    private val viewModel: ItineraryViewModel by activityViewModels {
        ItineraryViewModelFactory(
            (activity?.application as BaseApplication).database.itineraryDao()
        )
    }

    private var _binding: FragmentItineraryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentItineraryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ItineraryListAdapter { itinerary ->
            val action = ItineraryFragmentDirections
                .actionNavigationItineraryToFragmentItineraryDetails(itinerary.id)
            findNavController().navigate(action)
        }

        // TODO: observe the list of forageables from the view model and submit it the adapter
        viewModel.allItineraries.observe(viewLifecycleOwner) { itineraries ->
            itineraries.let {adapter.submitList(it)}
        }

        binding.apply {
            recyclerView.adapter = adapter
            addItineraryFab.setOnClickListener {
                findNavController().navigate(
                    R.id.action_navigation_itinerary_to_fragmentAddItinerary
                )
            }
        }
    }
}