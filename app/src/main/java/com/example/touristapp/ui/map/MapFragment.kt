package com.example.touristapp.ui.map

import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.touristapp.R
import com.example.touristapp.data.TempDataSourceObj
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import java.io.IOException


class MapFragment : Fragment(), OnMapReadyCallback {

    private lateinit var map: GoogleMap
    private val siteList = TempDataSourceObj.sites

    companion object {
        var mapFragment : SupportMapFragment?=null
        val TAG: String = MapFragment::class.java.simpleName
        fun newInstance() = MapFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)

        val mapFragment =
            childFragmentManager.findFragmentById(R.id.mapfrg) as SupportMapFragment
        mapFragment?.getMapAsync(this)

        return rootView
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        var latitude: Double
        var longitude: Double
        var point: LatLng

        for (site in siteList) {
            latitude = site.latitude
            longitude = site.longitude
            point = LatLng(latitude, longitude)

            map.addMarker(MarkerOptions().position(point))
        }

    }
}