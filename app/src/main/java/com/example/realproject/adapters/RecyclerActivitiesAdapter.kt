package com.example.realproject.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.RecyclerViewholder

class RecyclerActivitiesAdapter(
    var context: Context, var layout: Int, var titleList: MutableList<String>, var subTitleList: MutableList<String>,
    var bgList: MutableList<Int>, var favouriteList: MutableList<Int>, var favouriteTitleList: MutableList<String>,
    var commentList: MutableList<Int>, var commentTitleList: MutableList<String>,
    var seenList: MutableList<Int>, var seenTitleList: MutableList<String>
) :
    RecyclerView.Adapter<RecyclerViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewholder {
        var inflater = LayoutInflater.from(context)
        var view = inflater.inflate(layout, parent, false)
        return RecyclerViewholder(view)
    }

    override fun getItemCount(): Int {
        return titleList.count()
    }

    override fun onBindViewHolder(holder: RecyclerViewholder, position: Int) {
        holder.img_bg.setImageResource(bgList[position])
        holder.txt_top.text = titleList[position]
        holder.txt_below.text = subTitleList[position]
        holder.img_favourite.setImageResource(favouriteList[position])
        holder.txt_favourite.text = favouriteTitleList[position]
        holder.img_comment.setImageResource(commentList[position])
        holder.txt_comment.text = commentTitleList[position]
        holder.img_seen.setImageResource(seenList[position])
        holder.txt_seen.text = seenTitleList[position]
    }
}