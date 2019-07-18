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

    var img_bg = view.imgBackground
    var img_favourite = view.imgLove
    var img_comment = view.imgComment
    var img_seen = view.imgShare
    var txt_top = view.txtHead
    var txt_below = view.txtBelow
    var txt_favourite = view.txtLove
    var txt_comment = view.txtComment
    var txt_seen = view.txtShare

    var title_course_detail = view.txtDetailCourse
}