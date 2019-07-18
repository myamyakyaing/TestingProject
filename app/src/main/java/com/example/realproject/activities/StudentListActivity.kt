package com.example.realproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.realproject.R
import com.example.realproject.adapters.RecyclerStudentAdapter
import com.example.realproject.adapters.RecyclerTeacherAdapter
import com.example.realproject.model.Student
import com.example.realproject.model.Teacher
import kotlinx.android.synthetic.main.activity_student_list.*
import kotlinx.android.synthetic.main.activity_teacher_list.*
import kotlinx.android.synthetic.main.top_bar.toolbar1

class StudentListActivity : AppCompatActivity() {
    lateinit var studentArray: List<Student>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
        setSupportActionBar(toolbar1)
        var student_yla = Student("Mg Ye Lin Aung", "Android", R.drawable.kkk, "Android Developer",
                        "Ace plus Solution Co.ltd","Hlaing Thar Yar","17/12/1998","+95974700486","yla@gmail.com")
        var student_cmk = Student("Mg Chit Myo Ko", "Android", R.drawable.propic,"Android Developer",
                        "Ace plus Solution Co.ltd","Hlaing Township","17/1/1996","+95974700486","cmk@gmail.com")
        var student_ppw = Student("Ma Pyae Pyae Win", "Android", R.drawable.tza, "Android Developer",
                        "Ace plus Solution Co.ltd","Kamar Yout","17/5/1996","+95974700486","ppw@gmail.com")
        var student_mmk = Student("Ma Mya Mya Kyaing", "Android", R.drawable.tza, "Android Developer",
                        "Ace plus Solution Co.ltd","Hlaing Thar Yar","17/12/1996","+95974700486","mmk@gmail.com")
        studentArray = mutableListOf<Student>(student_yla, student_cmk, student_ppw, student_mmk)
        val rvStudentAdapter: RecyclerStudentAdapter = RecyclerStudentAdapter(studentArray, this::onClickItem)
        rvStudent.layoutManager = GridLayoutManager(this, 2)
        rvStudent.adapter = rvStudentAdapter
    }

    private fun onClickItem(student: Student) {
        startActivity(StudentProfileActivity.newIntent(
            this,
            student.name, student.track,
            student.image,student.profession,
            student.company,student.address,
            student.dob,student.phone,student.email))
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.action_settings) {
            Toast.makeText(this,"Show check box form", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
