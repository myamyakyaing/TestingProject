package com.example.realproject.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.model.Course
import com.example.realproject.model.Student
import kotlinx.android.synthetic.main.rv_course.view.*
import kotlinx.android.synthetic.main.rv_student.view.*

class CourseViewholder(val view: View, private val onClick: (course: Course) -> Unit): RecyclerView.ViewHolder(view) {
    fun setData(course: Course) {
        view.apply {
            imgRvCourse.setImageResource(course.image)
            txtCourse.text = course.title
        }
        view.setOnClickListener { onClick(course) }
    }
}