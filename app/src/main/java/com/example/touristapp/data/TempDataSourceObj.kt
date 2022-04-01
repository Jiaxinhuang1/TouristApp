package com.example.touristapp.data

import com.example.touristapp.R
import com.example.touristapp.model.City
import com.example.touristapp.model.Site


object TempDataSourceObj {
    val wishlist: MutableList<Site> = mutableListOf()
    val cities: List<City> = listOf(
        City(
            R.drawable.austin,
            "Austin"
        )
//        City(
//            "Paris"
//        ),
//        City(
//            "London"
//        ),
//        City(
//            "Beijing"
//        ),
//        City(
//            "Tokyo"
//        ),
    )

    val sites: List<Site> = listOf(
        Site(
            "Zilker Park",
            "Austin",
            "Park"
        ),
        Site(
            "Texas State Capitol",
            "Austin",
            "Historical Landmark"
        ),
        Site(
            "The Louvre",
            "Paris",
            "Museum"
        ),
        Site(
            "Tokyo Tower",
            "Tokyo",
            "Modern Landmark"
        )
    )
}