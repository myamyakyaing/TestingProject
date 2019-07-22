package com.example.realproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.R
import com.example.realproject.viewholders.TeacherViewholder
import com.example.realproject.model.Teacher

class RecyclerTeacherAdapter(var list: List<Teacher>, private val onClickItem : (teacher:Teacher) -> Unit):
    RecyclerView.Adapter<TeacherViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rv_teacher, parent,false)
        return TeacherViewholder(view, onClickItem)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: TeacherViewholder, position: Int) {
        holder.setData(list[position])
    }

}