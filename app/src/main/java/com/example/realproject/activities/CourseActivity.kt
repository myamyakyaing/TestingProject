package com.example.realproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.realproject.R
import com.example.realproject.adapters.RecyclerCourseAdapter
import kotlinx.android.synthetic.main.activity_course.*

class CourseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        var title:MutableList<String> = mutableListOf<String>("Android Development", "Web Development","Java Development","Design Implementation","Computer Basic")
        var image = mutableListOf<Int>(
            R.drawable.android,
            R.drawable.php,
            R.drawable.java,
            R.drawable.design,
            R.drawable.basic
        )
        var rvCourseAdapter: RecyclerCourseAdapter =
            RecyclerCourseAdapter(
                this,
                R.layout.rv_course,
                image,
                title
            )
        rvCourse.layoutManager = LinearLayoutManager(this)
        rvCourse.adapter = rvCourseAdapter
    }
}
