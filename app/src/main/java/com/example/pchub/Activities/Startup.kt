package com.example.pchub.Activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pchub.R

class Startup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup)
        val EnterButton: Button = findViewById(R.id.et_button)

        EnterButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }

    }
}