package com.example.realproject.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.R
import com.example.realproject.RecyclerViewholder
import com.example.realproject.StudentViewholder
import com.example.realproject.TeacherViewholder
import com.example.realproject.activities.DetailProfileActivity
import com.example.realproject.model.Student
import com.example.realproject.model.Teacher

class RecyclerStudentAdapter(var list: List<Student>, private val onClickItem : (student : Student) -> Unit):
    RecyclerView.Adapter<StudentViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rv_student, parent,false)
        return StudentViewholder(view, onClickItem)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: StudentViewholder, position: Int) {
        holder.setData(list[position])
    }

}