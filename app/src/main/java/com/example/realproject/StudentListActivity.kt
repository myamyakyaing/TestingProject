package com.example.realproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_student_list.*
import kotlinx.android.synthetic.main.activity_teacher_list.*
import kotlinx.android.synthetic.main.top_bar.*

class StudentListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        var title:MutableList<String> = mutableListOf<String>("Mg Ye Lin Aung", "Mg Chit Myo Ko","Ma Mya Mya Kyaing","Ma Pyae Pyae Win")
        var image = mutableListOf<Int>(R.drawable.propic,R.drawable.msp,R.drawable.kkk,R.drawable.tza)
        var rvStudentAdapter:RecyclerStudentAdapter = RecyclerStudentAdapter(this,R.layout.rv_student,image,title)
        rvStudent.layoutManager = GridLayoutManager(this,2)
        rvStudent.adapter = rvStudentAdapter


    }
}
