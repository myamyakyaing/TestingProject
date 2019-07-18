package com.example.realproject

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.activities.StudentListActivity
import com.example.realproject.model.Student
import com.example.realproject.model.Teacher
import kotlinx.android.synthetic.main.rv_student.view.*
import kotlinx.android.synthetic.main.rv_teacher.view.*

class StudentViewholder(val view: View, private val onClick: (student: Student) -> Unit): RecyclerView.ViewHolder(view) {
    fun setData(student: Student) {
        view.apply {
            imgStudentProfile.setImageResource(student.image)
            txtStudentName.text = student.name
            txtStudentTrack.text = student.track
        }
        view.setOnClickListener { onClick(student) }
    }
}