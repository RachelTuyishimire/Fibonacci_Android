package com.example.fibonacci_series

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NumbersRvAdapter (var numList:List<Int>): RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.nums_list_items,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return numList.size
    }
    }
}
        class NamesViewHolder(itemView:view):ViewHolder(itemView)
var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)