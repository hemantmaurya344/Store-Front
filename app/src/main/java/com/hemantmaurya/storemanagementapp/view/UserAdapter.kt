package com.hemantmaurya.storemanagementapp.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hemantmaurya.storemanagementapp.R
import com.hemantmaurya.storemanagementapp.model.DataStructure

class UserAdapter(val context: Context, val arrProd: ArrayList<DataStructure>): RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val name = v.findViewById<TextView>(R.id.itemName)
        val quantity = v.findViewById<TextView>(R.id.itemQuantity)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view,parent,false))
    }

    override fun getItemCount(): Int {
        return arrProd.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = arrProd[position].itemName
        holder.quantity.text = arrProd[position].itemQuantity
    }
}