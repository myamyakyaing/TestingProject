package com.example.realproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.realproject.R
import com.example.realproject.adapters.RecyclerActivitiesAdapter
import kotlinx.android.synthetic.main.activity_activities_list.*

class ActivitiesListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_list)

        var title:MutableList<String> = mutableListOf<String>("What is communnication skill?", "Whai is Kotlin?","What is Activity?")
        var subtitle:MutableList<String> = mutableListOf<String>("Soft Skill", "Language","How many page")
        var bg_image = mutableListOf<Int>(
            R.drawable.chairman,
            R.drawable.gift,
            R.drawable.chairman
        )
        var fav_image = mutableListOf<Int>(
            R.drawable.favorite,
            R.drawable.favorite,
            R.drawable.favorite
        )
        var fav_title:MutableList<String> = mutableListOf<String>("Favourite","Favourite","Favourite")
        var com_image = mutableListOf<Int>(
            R.drawable.comment,
            R.drawable.comment,
            R.drawable.comment
        )
        var com_title:MutableList<String> = mutableListOf<String>("Comment","Comment","Comment")
        var seen_image = mutableListOf<Int>(
            R.drawable.seen,
            R.drawable.seen,
            R.drawable.seen
        )
        var seen_title:MutableList<String> = mutableListOf<String>("Seen","Seen","Seen")
        var rvActivitiesAdapter: RecyclerActivitiesAdapter =
            RecyclerActivitiesAdapter(
                this, R.layout.rv_event,
                title, subtitle, bg_image, fav_image, fav_title,
                com_image, com_title, seen_image, seen_title
            )
        rvActivity.layoutManager = LinearLayoutManager(this)
        rvActivity.adapter = rvActivitiesAdapter
    }
}
