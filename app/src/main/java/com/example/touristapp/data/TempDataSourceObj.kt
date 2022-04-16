package com.example.touristapp.data

import com.example.touristapp.R
import com.example.touristapp.model.City
import com.example.touristapp.model.Site
import java.util.*


object TempDataSourceObj {
    val wishlist: MutableList<Site> = mutableListOf()
    val cities: List<City> = listOf(
        City(
            R.drawable.austin,
            "Austin"
        ),

        City(
            R.drawable.beijing,
            "Beijing"
        ),
        City(
            R.drawable.paris,
            "Paris"
        ),
        City(
            R.drawable.honolulu,
            "Honolulu"
        ),
        City(
            R.drawable.lasvegas,
            "Las Vegas"
        ),
        City(
            R.drawable.london,
            "London"
        ),
        City(
            R.drawable.manhattan,
            "Manhattan"
        ),
        City(
            R.drawable.mumbai,
            "Mumbai"
        ),
        City(
                R.drawable.tokyo,
        "Tokyo"
        )
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

    fun searchSites(searchTerm: String): List<Site> {
        val s = searchTerm.lowercase(Locale.ROOT)
        val match = sites.filter { it.name.lowercase(Locale.ROOT).contains(s) }
        return match
    }
}