package com.example.realproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course.*
import kotlinx.android.synthetic.main.activity_teacher_list.*

class TeacherListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_list)

        var title:MutableList<String> = mutableListOf<String>("Ma Thaw Zin Aung", "Mg Myo Set Paing","Mg Phone Lin","Mg Kyaw Kyaw Khine")
        var image = mutableListOf<Int>(R.drawable.tza,R.drawable.propic,R.drawable.msp,R.drawable.kkk)
        var rvTeacherAdapter:RecyclerTeacherAdapter = RecyclerTeacherAdapter(this,R.layout.rv_teacher,image,title)
        rvTeacher.layoutManager = GridLayoutManager(this,2)
        rvTeacher.adapter = rvTeacherAdapter
    }
}
