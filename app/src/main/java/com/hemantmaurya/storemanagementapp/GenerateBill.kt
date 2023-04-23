package com.hemantmaurya.storemanagementapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GenerateBill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate_bill)

        val backBtn = findViewById<ImageView>(R.id.backbtn5).setOnClickListener{ this.finish() }

    }
}