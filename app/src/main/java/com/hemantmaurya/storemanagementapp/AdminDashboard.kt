package com.hemantmaurya.storemanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AdminDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard)

        findViewById<ImageView>(R.id.backbtn3).setOnClickListener{
            this.finish()
        }
        val generateBill = Intent(this@AdminDashboard,GenerateBill::class.java)
        findViewById<Button>(R.id.generateBillBtn1).setOnClickListener { startActivity(generateBill) }

    }
}