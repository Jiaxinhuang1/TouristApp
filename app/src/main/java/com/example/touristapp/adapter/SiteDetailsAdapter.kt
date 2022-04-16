package com.example.touristapp.adapter

import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.touristapp.R
import com.example.touristapp.data.TempDataSourceObj
import com.example.touristapp.model.Site
import com.example.touristapp.ui.site.SiteListFragmentDirections

class SiteDetailsAdapter (private val siteID: String) {
    private val filteredSite: List<Site>
    init {
        val sites = TempDataSourceObj.sites
        filteredSite = sites.filter { it.name.equals(siteID) }
    }
    val site = filteredSite[0]
    val wishlist = TempDataSourceObj.wishlist

    fun onCreateView(inflater: LayoutInflater,
                                container: ViewGroup?,
                                savedInstanceState: Bundle?
                            ): View? {
        return inflater.inflate(R.layout.fragment_site_details, container, false)
    }
}