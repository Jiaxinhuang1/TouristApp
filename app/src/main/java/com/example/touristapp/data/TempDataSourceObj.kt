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
        ),
        City(
            R.drawable.paris,
            "Paris"
        )
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
            R.drawable.zilker_park,
            "Zilker Park",
            "Austin",
            "Park"
        ),
        Site(
            R.drawable.texas_state_capitol,
            "Texas State Capitol",
            "Austin",
            "Historical Landmark"
        ),
        Site(
            R.drawable.louvre,
            "The Louvre",
            "Paris",
            "Museum"
        )
//        Site(
//            "Tokyo Tower",
//            "Tokyo",
//            "Modern Landmark"
//        )
    )
}