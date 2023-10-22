package com.example.pchub

import com.example.pchub.data.AppDatabase
import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize your Room database here
        AppDatabase.getInstance(this)
    }
}