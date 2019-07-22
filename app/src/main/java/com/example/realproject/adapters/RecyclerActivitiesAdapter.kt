package com.example.realproject.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.viewholders.ActivityViewholder
import com.example.realproject.R
import com.example.realproject.model.Addressed

class RecyclerActivitiesAdapter(var list: List<Addressed>, private val onClickItem : (addressed:Addressed) -> Unit):
    RecyclerView.Adapter<ActivityViewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rv_event,parent,false)
        return ActivityViewholder(view, onClickItem)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ActivityViewholder, position: Int) {
        holder.setData(list[position])
    }

}