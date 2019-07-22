package com.example.realproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.R
import com.example.realproject.viewholders.StudentViewholder
import com.example.realproject.model.Student

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