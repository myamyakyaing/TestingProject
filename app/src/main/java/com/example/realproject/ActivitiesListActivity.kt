package com.example.realproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_activities_list.*
import kotlinx.android.synthetic.main.activity_course.*

class ActivitiesListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_list)

        var title:MutableList<String> = mutableListOf<String>("Profile", "About As","Log Out")
        var image = mutableListOf<Int>(R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery,R.drawable.ic_menu_manage)
        var rvActivitiesAdapter:RecyclerActivitiesAdapter = RecyclerActivitiesAdapter(this,R.layout.rv_event,image,title)
        rvActivity.layoutManager = LinearLayoutManager(this)
        rvActivity.adapter = rvActivitiesAdapter
    }
}
