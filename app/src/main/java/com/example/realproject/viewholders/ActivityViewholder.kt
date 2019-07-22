package com.example.realproject.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.model.Addressed
import kotlinx.android.synthetic.main.rv_event.view.*

class ActivityViewholder (val view: View, private val onClick: (addressed: Addressed) -> Unit): RecyclerView.ViewHolder(view) {
    fun setData(addressed: Addressed) {
        view.apply {
            imgBackground .setImageResource(addressed.mainImg)
            imgLove.setImageResource(addressed.likeImg)
            imgComment.setImageResource(addressed.comImg)
            imgShare.setImageResource(addressed.seeImg)
            txtHead.text = addressed.name
            txtBelow.text = addressed.strengths
            txtLove.text = addressed.likeMsg
            txtComment.text = addressed.comMsg
            txtShare.text = addressed.seeMsg
        }
        view.setOnClickListener { onClick(addressed) }
    }
}