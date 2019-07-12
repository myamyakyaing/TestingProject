package com.example.realproject

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivitiesAdapter(var context: Context, var layout:Int, var imgList: MutableList<Int>, var titleList: MutableList<String>):
            RecyclerView.Adapter<RecyclerViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewholder {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(layout,parent,false)
        return RecyclerViewholder(view)
    }

    override fun getItemCount(): Int {
        return imgList.count()
    }

    override fun onBindViewHolder(holder: RecyclerViewholder, position: Int) {
    holder.img_event.setImageResource(imgList[position])
    holder.title_event.text = titleList[position]
    }
}