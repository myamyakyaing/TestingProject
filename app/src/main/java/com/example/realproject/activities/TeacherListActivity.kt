package com.example.realproject.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.realproject.R
import com.example.realproject.adapters.RecyclerTeacherAdapter
import com.example.realproject.model.Teacher
import kotlinx.android.synthetic.main.activity_teacher_list.*
import kotlinx.android.synthetic.main.content_main.*

class TeacherListActivity : AppCompatActivity() {
    lateinit var teacherArray: List<Teacher>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_list)
        var teacher_tza = Teacher("Ma Thaw Zin Aung","Android", R.drawable.tza,
                        "Android Developer","Hlaing Township","12/17/1992","09 796879659","tza@gmail.com")
        var teacher_msp = Teacher("Ko Myo Set Paing", "Android", R.drawable.propic,
                        "Android Developer","Sauth Dogan","12/17/1992","09 796879659","msp@gmail.com")
        var teacher_pla = Teacher("Ko Phone Lin Aung", "Android", R.drawable.pla,
                        "Android Developer", "North Dagon","12/17/1992","09 796879659","pla@gmail.com")
        var teacher_kkk = Teacher("Ko Kyaw Kyaw Khaing", "Android", R.drawable.kkk,
                        "Android Developer", "Sangaung Township","12/17/1992","09 796879659","kkk@gmail.com")
        teacherArray = mutableListOf<Teacher>(teacher_tza, teacher_msp, teacher_pla, teacher_kkk)
        val rvTeacherAdapter: RecyclerTeacherAdapter = RecyclerTeacherAdapter(teacherArray, this::onClickItem)
        rvTeacher.layoutManager = GridLayoutManager(this, 2)
        rvTeacher.adapter = rvTeacherAdapter
    }

    private fun onClickItem(teacher: Teacher) {
        startActivity(TeacherProfileActivity.newIntent(this, teacher.name, teacher.image, teacher.profession,
            teacher.address,teacher.dob,teacher.phone,teacher.email))
    }
}
