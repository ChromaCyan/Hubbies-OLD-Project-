package com.example.pchub.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pchub.R
import com.example.pchub.ValidationUtils
import com.example.pchub.databinding.ActivityRegisterBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Register : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var db:DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = DatabaseHelper(this)

        val BackButton: FloatingActionButton = findViewById(R.id.bt_back)

        BackButton.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)

        }
        binding.RegisterBT.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        val username = binding.uNameET.text.toString()
        val email = binding.EmailET.text.toString()
        val password = binding.PassET.text.toString()
        val confirm = binding.Pass2ET.text.toString()

        if(ValidationUtils.isTextNotEmpty(username) && ValidationUtils.isTextNotEmpty(email)
            && ValidationUtils.isTextNotEmpty(password) && ValidationUtils.isTextNotEmpty(confirm)){
            if(ValidationUtils.isValidEmail(email)){
                if(password == confirm){
                    val user = User(username = username, email = email, password = password, confirm = confirm)
                    db.registerUser(user)
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)
                    Toast.makeText(this, "Account registered!", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "Password Not Matched!", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this, "Invalid email format!", Toast.LENGTH_SHORT).show()
            }

        }else{
            Toast.makeText(this, "Please enter fields!", Toast.LENGTH_SHORT).show()
        }
    }
}