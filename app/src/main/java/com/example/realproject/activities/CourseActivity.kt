package com.example.realproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.realproject.R
import com.example.realproject.adapters.RecyclerCourseAdapter
import com.example.realproject.model.Course
import kotlinx.android.synthetic.main.activity_course.*
import kotlinx.android.synthetic.main.course_bar.*

class CourseActivity : AppCompatActivity() {
    lateinit var courseArray: List<Course>

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_course)
        setSupportActionBar(courseBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

       var android = Course(R.drawable.android,"Android Development","1. Version Control Anf Git",
                            "2. Klotlin Programming","3. Installation Frist App","4. Activity And Activity Lifecycle",
                            "5. Intent", "6. Fragment And Fragment Lifecycle")
        var php = Course(R.drawable.php,"Web Development","1. Build websites and webapps",
            "2. Build HTML-based mobile apps","3. Get a job as a junior web developer","4. Bid for projects on freelance websites",
            "5. Start their own online business", "6. Be a comfortable front-end developer")
        var java = Course(R.drawable.java,"Java Development","1. Version Control Anf Git",
            "2. Klotlin Programming","3. Installation Frist App","4. Activity And Activity Lifecycle",
            "5. Intent", "6. Fragment And Fragment Lifecycle")
        var design = Course(R.drawable.design,"Design Implementation","1. Version Control Anf Git",
            "2. Klotlin Programming","3. Installation Frist App","4. Activity And Activity Lifecycle",
            "5. Intent", "6. Fragment And Fragment Lifecycle")
        var basic = Course(R.drawable.basic,"Computer Basic","1. Version Control Anf Git",
            "2. Klotlin Programming","3. Installation Frist App","4. Activity And Activity Lifecycle",
            "5. Intent", "6. Fragment And Fragment Lifecycle")
        courseArray = mutableListOf<Course>(android,php,java,design,basic)
        var rvCourseAdapter = RecyclerCourseAdapter(courseArray,this::onClickItem)
        rvCourse.layoutManager = LinearLayoutManager(this)
        rvCourse.adapter = rvCourseAdapter
    }
    private fun onClickItem(course:Course){
        startActivity(CourseDetailActivity.newIntent(
                this,course.number1,course.number2,course.number3,course.number4,course.number5,course.number6))
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
