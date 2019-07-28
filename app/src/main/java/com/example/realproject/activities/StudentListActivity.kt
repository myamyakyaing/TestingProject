package com.example.realproject.activities

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.util.Util
import com.example.realproject.R
import com.example.realproject.adapters.RecyclerStudentAdapter
import com.example.realproject.adapters.RecyclerTeacherAdapter
import com.example.realproject.model.Student
import com.example.realproject.model.Teacher
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_student_list.*
import kotlinx.android.synthetic.main.activity_teacher_list.*
import kotlinx.android.synthetic.main.student_buttom_sheet.*
import kotlinx.android.synthetic.main.student_buttom_sheet.view.*
import kotlinx.android.synthetic.main.top_bar.*

class StudentListActivity : AppCompatActivity(){
    lateinit var studentArray: List<Student>
    private lateinit var sheetBehavior: BottomSheetBehavior<LinearLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_student_list)

        setSupportActionBar(stdBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val cordinate:CoordinatorLayout = coor_sheet
        val bottom:LinearLayout = cordinate.bottom_sheet
        sheetBehavior = BottomSheetBehavior.from(bottom)
        sheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN

        bottom.button.setOnClickListener {
            sheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
        }

//        sheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
//            override fun onStateChanged(bottomSheet: View, newState: Int) {
//                when (newState) {
//                    BottomSheetBehavior.STATE_HIDDEN -> {
//                    }
//                    BottomSheetBehavior.STATE_EXPANDED ->
//                       Toast.makeText(this@StudentListActivity,"Hide",Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_COLLAPSED ->
//                        Toast.makeText(this@StudentListActivity,"Show",Toast.LENGTH_SHORT).show()
//                    BottomSheetBehavior.STATE_DRAGGING -> {
//                    }
//                    BottomSheetBehavior.STATE_SETTLING -> {
//                    }
//                }
//            }
//
//            override fun onSlide(bottomSheet: View, slideOffset: Float) {
//            }
//        })


        var student_yla = Student(
            "Mg Ye Lin Aung", "Android", R.drawable.yla, "Android Developer",
            "Ace plus Solution Co.ltd", "Hlaing Thar Yar", "17/12/1998", "+95974700486", "yla@gmail.com"
        )
        var student_cmk = Student(
            "Mg Chit Myo Ko", "Android", R.drawable.cmk, "Android Developer",
            "Ace plus Solution Co.ltd", "Hlaing Township", "17/1/1996", "+95974700486", "cmk@gmail.com"
        )
        var student_ppw = Student(
            "Ma Pyae Pyae Win", "Android", R.drawable.ppw, "Android Developer",
            "Ace plus Solution Co.ltd", "Kamar Yout", "17/5/1996", "+95974700486", "ppw@gmail.com"
        )
        var student_mmk = Student(
            "Ma Mya Mya Kyaing", "Android", R.drawable.mmk, "Android Developer",
            "Ace plus Solution Co.ltd", "Hlaing Thar Yar", "17/12/1996", "+95974700486", "mmk@gmail.com"
        )
        studentArray = mutableListOf<Student>(student_yla, student_cmk, student_ppw, student_mmk)
        val rvStudentAdapter: RecyclerStudentAdapter = RecyclerStudentAdapter(studentArray, this::onClickItem)
        rvStudent.layoutManager = GridLayoutManager(this, 2)
        rvStudent.adapter = rvStudentAdapter
    }

    private fun onClickItem(student: Student) {
        startActivity(
            StudentProfileActivity.newIntent(
                this,
                student.name, student.track,
                student.image, student.profession,
                student.company, student.address,
                student.dob, student.phone, student.email
            )
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.action_settings) {
            expandCloseSheet()

        }

        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun expandCloseSheet() {
        if (sheetBehavior!!.state != BottomSheetBehavior.STATE_EXPANDED) {
            sheetBehavior!!.state = BottomSheetBehavior.STATE_EXPANDED
           //Toast.makeText(this@StudentListActivity,"Close Buttom Sheet",Toast.LENGTH_SHORT).show()
        } else {
            sheetBehavior!!.state = BottomSheetBehavior.STATE_HIDDEN
            //Toast.makeText(this@StudentListActivity,"Show Bottom Sheet",Toast.LENGTH_SHORT).show()
        }
    }
}
