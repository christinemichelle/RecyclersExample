package com.example.recyclersexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Adapter (private val mList: List<Info>):RecyclerView.Adapter<Adapter.ViewHolder>(){
    //create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_look, parent, false)
        return ViewHolder(view)
    }

    //binds the list items to a view
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]

        holder.imageview.setImageResource(ItemsViewModel.image)
        holder.textview.text = ItemsViewModel.name

    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){

        val imageview:ImageView = ItemView.findViewById(R.id.imageView2)
        val textview:TextView = ItemView.findViewById(R.id.textView)
    }

}