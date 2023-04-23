package com.hemantmaurya.storemanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val backBtn = findViewById<ImageView>(R.id.backbtn2).setOnClickListener{
            this.finish()
        }
        val i = Intent(this@Register,Login::class.java)
        val signBtn = findViewById<Button>(R.id.loginBtn3).setOnClickListener {
            startActivity(i)
        }
    }
}