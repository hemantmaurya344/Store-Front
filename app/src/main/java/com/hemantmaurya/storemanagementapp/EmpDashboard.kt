package com.hemantmaurya.storemanagementapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hemantmaurya.storemanagementapp.model.DataStructure
import com.hemantmaurya.storemanagementapp.view.UserAdapter

class EmpDashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emp_dashboard)

        findViewById<ImageView>(R.id.backbtn4).setOnClickListener{
            this.finish()
        }

        findViewById<ImageButton>(R.id.addItemIdbtn).setOnClickListener {
            addItem()
        }

         findViewById<Button>(R.id.generate_billBtn).setOnClickListener {
            val billgeneratePage = Intent(this@EmpDashboard,GenerateBill::class.java)
            startActivity(billgeneratePage)
        }
    }

    private fun getQuantity(): Int {
        var num:NumberPicker = findViewById(R.id.numberPicker)
        if(num !=  null ){
            num.minValue = 0
            num.maxValue = 10
            num.wrapSelectorWheel = true
        }
        return num.value
    }

    // fetch the item name and quantity with the help of itemId

    private fun addItem() {
        var arrprod = ArrayList<DataStructure>()
        val recyclerView = findViewById<RecyclerView>(R.id.itemrecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val recyclerAdapter = UserAdapter(this,arrprod)
        recyclerView.adapter = recyclerAdapter
        val name = findViewById<AutoCompleteTextView>(R.id.add_prod_text).text.toString()
        val quantity = getQuantity().toString()
        arrprod.add(DataStructure(name,quantity))
        recyclerAdapter.notifyDataSetChanged()
    }
}