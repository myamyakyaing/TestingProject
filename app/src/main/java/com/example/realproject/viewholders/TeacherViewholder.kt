package com.example.realproject.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.model.Teacher
import kotlinx.android.synthetic.main.rv_teacher.view.*

class TeacherViewholder(val view: View, private val onClick: (teacher: Teacher) -> Unit): RecyclerView.ViewHolder(view) {
    fun setData(teacher: Teacher) {
        view.apply {
            imgRvTeacher.setImageResource(teacher.image)
            txtTeacherName.text = teacher.name
            txtTeacherPos.text = teacher.track
        }
        view.setOnClickListener { onClick(teacher) }
    }
}