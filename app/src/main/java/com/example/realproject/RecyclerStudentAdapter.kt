package com.example.realproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerStudentAdapter(var context:Context, var layout:Int, var imgList:MutableList<Int>, var titleList:MutableList<String>):
            RecyclerView.Adapter<RecyclerViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewholder {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(layout,parent,false)
        return RecyclerViewholder(view)
    }

    override fun getItemCount(): Int {
        return imgList.count()
    }

    override fun onBindViewHolder(holder: RecyclerViewholder, position: Int) {
    holder.img_student.setImageResource(imgList[position])
    holder.title_student.text = titleList[position]
        holder.itemView.setOnClickListener {
            var  intent = Intent(context, DetailProfileActivity::class.java)
            context.startActivity(intent)
        }
    }
}