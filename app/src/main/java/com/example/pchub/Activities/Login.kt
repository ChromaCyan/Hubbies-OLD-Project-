package com.example.pchub.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pchub.R
import com.example.pchub.ValidationUtils
import com.example.pchub.databinding.ActivityLoginBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var db: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DatabaseHelper(this)
        val BackButton: FloatingActionButton = findViewById(R.id.bt_back)

        BackButton.setOnClickListener {
            val intent = Intent(this, Startup::class.java)
            startActivity(intent)

        }
        binding.btSignup.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)

             }
        binding.SignIn.setOnClickListener{
            val email = binding.EmailET.text.toString().trim()
            val password = binding.Pass.text.toString().trim()

            if(ValidationUtils.isTextNotEmpty(email) && ValidationUtils.isTextNotEmpty(password)){
                if(ValidationUtils.isValidEmail(email)){
                    val isSuccess = db.loginUser(email, password)
                    if(isSuccess){
                        val intent = Intent(this, FrontPage::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, "Invalid email or password!", Toast.LENGTH_SHORT).show()
                    }

                }else{
                    Toast.makeText(this, "Invalid format!", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this, "Please enter fields!", Toast.LENGTH_SHORT).show()
            }

        }
    }
}

