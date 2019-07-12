package com.example.realproject

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_course.view.*
import kotlinx.android.synthetic.main.rv_detail_course.view.*
import kotlinx.android.synthetic.main.rv_event.view.*
import kotlinx.android.synthetic.main.rv_student.view.*
import kotlinx.android.synthetic.main.rv_teacher.view.*

class RecyclerViewholder(view: View):RecyclerView.ViewHolder(view) {
    var img_course = view.imgRvCourse
    var title_course = view.txtCourse

    var img_teacher = view.imgRvTeacher
    var title_teacher = view.txtTeacher1

    var img_student = view.imgRvStudent
    var title_student = view.txtStudent1

    var img_event = view.imgRvEvent
    var title_event = view.txtEvent

    var title_course_detail = view.txtDetailCourse
}