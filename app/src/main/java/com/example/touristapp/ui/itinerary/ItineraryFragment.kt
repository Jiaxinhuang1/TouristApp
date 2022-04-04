package com.example.touristapp.ui.itinerary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.touristapp.R
import com.example.touristapp.databinding.ActivityMainBinding

class ItineraryFragment:Fragment() {

    lateinit var DetailsBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_itinerary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DetailsBtn = view.findViewById(R.id.DetailsBtn)
        DetailsBtn.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_itinerary_to_fragmentItineraryDetails)
        }
    }
}