package com.example.touristapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [Site::class], version = 1, exportSchema = false)
public abstract class SiteRoomDatabase : RoomDatabase() {

}