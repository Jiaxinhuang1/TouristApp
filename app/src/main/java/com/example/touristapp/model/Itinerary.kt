package com.example.touristapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "itinerary_database")
data class Itinerary(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val address: String,
    @ColumnInfo(name="has_visited") val hasVisited: Boolean,
    val date: String,
    val notes: String?
)