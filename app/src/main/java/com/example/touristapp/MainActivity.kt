package com.example.touristapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.touristapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

//example commit by grace
//example commit micah
//example commit angela

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)
//        val navController = findNavController(R.id.nav_host_fragment)
//        bottomNavigationView.setupWithNavController(navController)
        val navView: BottomNavigationView = binding.navView

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.cityListFragment,
                R.id.navigation_search,
                R.id.navigation_wishlist,
                R.id.navigation_itinerary
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}