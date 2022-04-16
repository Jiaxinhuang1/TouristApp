package com.example.touristapp.ui.site

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.touristapp.R
import com.example.touristapp.databinding.FragmentItineraryDetailsBinding
import com.example.touristapp.databinding.FragmentSiteDetailsBinding
import com.example.touristapp.databinding.FragmentSiteListBinding
import com.example.touristapp.ui.itinerary.FragmentItineraryDetailsDirections

//class SiteDetailsFragment: Fragment(R.layout.fragment_site_details) {
//}

class SiteDetailsFragment : Fragment() {

    companion object {
        val SITE = "site"
    }

    private var _binding: FragmentSiteDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var siteID: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        arguments?.let {
            siteID = it.getString(SITE).toString()
        }
    }
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentSiteDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}