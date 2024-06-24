package com.example.testapplication

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdaptor(private val myList: List<Int>) : RecyclerView.Adapter<MyAdaptor.MyViewHolder>() {
    val TAG: String = "Nikhil"
    private val list = myList

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var numbers: TextView = view.findViewById(R.id.numbers)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerlayout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val items = myList[position]
        for (item in 1..100) {
            holder.numbers.text = items.toString()
            if (position % 2 == 0) {
                Log.d(TAG, "onBindViewHolder: " + position)
                holder.itemView.setBackgroundColor(Color.parseColor("#A020F0"))
            } else {
                holder.itemView.setBackgroundColor(Color.parseColor("#008000"))

            }
        }

    }
}