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
        ),
        City(
            R.drawable.singapore,
            "Singapore"
        ),
        City(
            R.drawable.san_francisco,
            "San Francisco"
        ),
        City(
            R.drawable.seoul,
            "Seoul"
        ),
        City(
            R.drawable.agra,
            "Agra"
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
            R.drawable.congress_ave_bridge,
            "Congress Avenue Bridge",
            "Austin",
            "Historical Landmark"
        ),
        Site(
            R.drawable.ut_austin,
            "University of Texas at Austin",
            "Austin",
            "Historical Landmark"
        ),
        Site(
            R.drawable.lbj_library,
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
            R.drawable.tal_mahal,
            "Taj Mahal",
            "Agra",
            "Historical Landmark"
        ),
        Site(
            R.drawable.great_wall_china,
            "Great Wall of China",
            "Beijing",
            "Historical Landmark"
        ),
        Site(
            R.drawable.palace_museum,
            "Palace Museum",
            "Beijing",
            "Museum"
        ),
        Site(
            R.drawable.polynesian_cultural_center,
            "Polynesian Cultural Center",
            "Honolulu",
            "Museum"
        ),
        Site(
            R.drawable.paris_las_vegas,
            "Paris Las Vegas",
            "Las Vegas",
            "Resort"
        ),
        Site(
            R.drawable.museum_modern_art,
            "Museum of Modern Art",
            "London",
            "Museum"
        ),
        Site(
            R.drawable.national_museum_anthropology,
            "National Museum of Anthropology",
            "Mexico City",
            "Museum"
        ),
        Site(
            R.drawable.gateway_india,
            "Gateway of India",
            "Mumbai",
            "Historical Landmark"
        ),
        Site(
            R.drawable.empire_state_building,
            "Empire State Building",
            "Manhattan",
            "Historical Landmark"
        ),
        Site(
            R.drawable.eiffel_tower,
            "Eiffel Tower",
            "Paris",
            "Historical Landmark"
        ),
        Site(
            R.drawable.fisherman_wharf,
            "Fisherman's Wharf",
            "San Francisco",
            "Historical Landmark"
        ),
        Site(
            R.drawable.golden_gate_bridge,
            "Golden Gate Bridge",
            "San Francisco",
            "Historical Landmark"
        ),
        Site(
            R.drawable.legion_honor_museum,
            "Legion of Honor Museum",
            "San Francisco",
            "Museum"
        ),
        Site(
            R.drawable.n_seoul_tower,
            "N Seoul Tower",
            "Seoul",
            "Historical Landmark"
        ),
        Site(
            R.drawable.sensoji_temple,
            "Sensoji Temple",
            "Tokyo",
            "Historical Landmark"
        ),
        Site(
            R.drawable.bayeast_garden,
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