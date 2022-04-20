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
            R.drawable.texas_state_capitol,
            "Congress Avenue Bridge",
            "Austin",
            "Historical Landmark"
        ),
        Site(
            R.drawable.texas_state_capitol,
            "University of Texas at Austin",
            "Austin",
            "Historical Landmark"
        ),
        Site(
            R.drawable.texas_state_capitol,
            "Lyndon Baines Johnson Library",
            "Austin",
            "Museum"
        ),
        Site(
            R.drawable.louvre,
            "The Louvre",
            "Paris",
            "Museum"
        ),
        Site(
            R.drawable.louvre,
            "Taj Mahal",
            "Agra",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Great Wall of China",
            "Beijing",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Palace Museum",
            "Beijing",
            "Museum"
        ),
        Site(
            R.drawable.london,
            "Polynesian Cultural Center",
            "Honolulu",
            "Museum"
        ),
        Site(
            R.drawable.london,
            "Paris Las Vegas",
            "Las Vegas",
            "Resort"
        ),
        Site(
            R.drawable.london,
            "Museum of Modern Art",
            "London",
            "Museum"
        ),
        Site(
            R.drawable.london,
            "National Museum of Anthropology",
            "Mexico City",
            "Museum"
        ),
        Site(
            R.drawable.london,
            "Gateway of India",
            "Mumbai",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Empire State Building",
            "Manhattan",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Eiffel Tower",
            "Paris",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Fisherman's Wharf",
            "San Francisco",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Golden Gate Bridge",
            "San Francisco",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Legion of Honor Museum",
            "San Francisco",
            "Museum"
        ),
        Site(
            R.drawable.london,
            "N Seoul Tower",
            "Seoul",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Sensoji Temple",
            "Tokyo",
            "Historical Landmark"
        ),
        Site(
            R.drawable.london,
            "Bay East Garden",
            "Singapore",
            "Historical Landmark"
        )


    )

    fun searchSites(searchTerm: String): List<Site> {
        val s = searchTerm.lowercase(Locale.ROOT)
        val match = sites.filter { it.name.lowercase(Locale.ROOT).contains(s) }
        return match
    }
}