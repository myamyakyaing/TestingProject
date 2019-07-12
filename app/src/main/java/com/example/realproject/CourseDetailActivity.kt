package com.example.realproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_course_detail.*
import kotlinx.android.synthetic.main.activity_student_list.*

class CourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)

        var title:MutableList<String> = mutableListOf<String>("1. Version Control And Git",
                                                            "2. Kotlin Programming","3. Installation First App",
                                                            "4. Activiry And Activity Lifecycle","5. Intent","6. Fragment And Fragment Lifecycle")
        var rvCourseDetailAdapter:RecyclerCourseDetailAdapter = RecyclerCourseDetailAdapter(this,R.layout.rv_detail_course,title)
        rvDetailCourse.layoutManager = LinearLayoutManager(this)
        rvDetailCourse.adapter = rvCourseDetailAdapter
    }
}
