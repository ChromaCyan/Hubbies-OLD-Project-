package com.example.pchub.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pchub.R

class FrontPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_page)
        val shop : Button = findViewById(R.id.first_choice)
        val guide : Button = findViewById(R.id.second_choice)


        shop.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("fragmentToLoad", 0) // 0 corresponds to the Shop Fragment
            startActivity(intent)
        }

        guide.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("fragmentToLoad", 1)
            startActivity(intent)
        }
    }
}