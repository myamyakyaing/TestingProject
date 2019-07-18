package com.example.realproject.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.RecyclerViewholder
import com.example.realproject.activities.CourseDetailActivity

class RecyclerCourseAdapter(
    var context: Context,
    var layout: Int,
    var imgList: MutableList<Int>,
    var titlelist: MutableList<String>
) :
    RecyclerView.Adapter<RecyclerViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewholder {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(layout, parent, false)
        return RecyclerViewholder(view)
    }

    override fun getItemCount(): Int {
        return imgList.count()
    }

    override fun onBindViewHolder(holder: RecyclerViewholder, position: Int) {
        holder.img_course.setImageResource(imgList[position])
        holder.title_course.text = titlelist[position]
        holder.itemView.setOnClickListener {
            var intent = Intent(context, CourseDetailActivity::class.java)
            context.startActivity(intent)


        }
    }

}
