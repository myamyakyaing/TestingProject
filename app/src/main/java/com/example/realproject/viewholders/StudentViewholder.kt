package com.example.realproject.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.model.Student
import kotlinx.android.synthetic.main.rv_student.view.*

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