package com.example.pchub

import com.example.pchub.data.AppDatabase
import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppDatabase.getInstance(this)
    }
}