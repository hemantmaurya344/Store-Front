package com.hemantmaurya.storemanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.hemantmaurya.storemanagementapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var signInbtn = binding.signinBtn1.setOnClickListener {
            val signin = Intent(this@MainActivity,Login::class.java)
            startActivity(signin)
        }
        var signUpbtn = binding.registerBtn1.setOnClickListener {
            val signUp = Intent(this@MainActivity,Register::class.java)
            startActivity(signUp)
        }
    }
}
