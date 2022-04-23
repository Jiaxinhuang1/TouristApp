package com.example.touristapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.touristapp.databinding.ActivityMainBinding
import com.example.touristapp.databinding.ActivitySplashScreenBinding
import java.util.*
import kotlin.concurrent.timerTask

class SplashScreenActivity : AppCompatActivity() {
    //private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
//
//        binding.splashscreenLayout.alpha = 0f
//        binding.splashscreenLayout.animate().setDuration(1500).alpha(1f).withEndAction {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
//            finish()
//        }
        MovetoMain()
    }
    fun MovetoMain() {
        if (!isDestroyed) {
            val intent = Intent(this, MainActivity::class.java)
            val myTimerTask = timerTask {
                if (!isDestroyed) {
                    startActivity(intent)
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                    finish()
                }
            }
            val timer = Timer()
            timer.schedule(myTimerTask, 1500)
        }
    }
}