package com.example.realproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.R
import com.example.realproject.model.Course
import com.example.realproject.viewholders.CourseViewholder

class RecyclerCourseAdapter(var list: List<Course>, private val onClickItem : (course: Course) -> Unit):
    RecyclerView.Adapter<CourseViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rv_course,parent,false)
        return CourseViewholder(view, onClickItem)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: CourseViewholder, position: Int) {
        holder.setData(list[position])
    }
}
