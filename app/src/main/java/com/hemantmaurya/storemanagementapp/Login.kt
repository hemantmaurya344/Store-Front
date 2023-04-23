package com.hemantmaurya.storemanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val backbtn = findViewById<ImageView>(R.id.backbtn1).setOnClickListener {
            this.finish()
        }
        val i = Intent(this@Login,Register::class.java)
        val signUpBtn = findViewById<Button>(R.id.signUpbtn2).setOnClickListener {
            startActivity(i)
        }

        findViewById<Button>(R.id.signInbtn2).setOnClickListener {
            login()
        }
    }
    private fun login(){
        val uaN = "noah_king"
        val paW = "NoahIsGreat"
        var user_name = findViewById<EditText>(R.id.userName).getText().toString()
        var passWord = findViewById<EditText>(R.id.password).getText().toString()
        val ueN = "daisy_rocks"
        val peW = "daisyWhatIsThis"
        if(user_name.equals(uaN) && passWord.equals(paW)){
            val admin = Intent(this@Login,AdminDashboard::class.java)
            startActivity(admin)
        } else if(user_name.equals(ueN) && passWord.equals(peW)){
            val emp = Intent(this@Login,EmpDashboard::class.java)
            startActivity(emp)
        }
    }
}