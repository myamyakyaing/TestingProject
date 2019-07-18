package com.example.realproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.RecyclerViewholder

class RecyclerCourseDetailAdapter(var context: Context, var layout:Int,var titleList:MutableList<String>):
    RecyclerView.Adapter<RecyclerViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewholder {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(layout, parent, false)
        return RecyclerViewholder(view)
    }
    override fun getItemCount(): Int {
        return titleList.count()
    }

    override fun onBindViewHolder(holder: RecyclerViewholder, position: Int) {
        holder.title_course_detail.text = titleList[position]
    }
}