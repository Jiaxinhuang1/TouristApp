package com.example.touristapp.model

import androidx.annotation.DrawableRes
import java.util.*

class Site (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val city: String,
    val category: String //ie. park, museum, historical landmark
)