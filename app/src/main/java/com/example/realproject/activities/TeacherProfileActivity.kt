package com.example.realproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realproject.R
import kotlinx.android.synthetic.main.activity_detail_profile.*
import kotlinx.android.synthetic.main.activity_student_profile.*
import kotlinx.android.synthetic.main.activity_teacher_profile.*

class TeacherProfileActivity : AppCompatActivity() {
    companion object{
        const val TEACHER_NAME = "teacher_name"
        const val TEACHER_PROFESSION = "profession"
        const val TEACHER_PROFILE = "profile"
        const val TEACHER_ADDRESS = "address"
        const val TEACHER_DOB = "dob"
        const val TEACHER_PHONE = "phone"
        const val TEACHER_EMAIL = "email"
        fun newIntent(context: Context,
                      teacherName:String,
                      teacherProfile: Int,
                      teacherProfession: String,
                      teacherAddress : String,
                      teacherDob: String,
                      teacherPhone : String,
                      teacherEmail:String

        ): Intent {
            var intent = Intent(context, TeacherProfileActivity::class.java)
            intent.putExtra(TEACHER_NAME,teacherName)
            intent.putExtra(TEACHER_PROFESSION, teacherProfession)
            intent.putExtra(TEACHER_PROFILE, teacherProfile)
            intent.putExtra(TEACHER_ADDRESS,teacherAddress)
            intent.putExtra(TEACHER_DOB,teacherDob)
            intent.putExtra(TEACHER_PHONE,teacherPhone)
            intent.putExtra(TEACHER_EMAIL,teacherEmail)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_profile)

        var teacherName = intent.getStringExtra(TEACHER_NAME)
        var teacherProfession = intent.getStringExtra(TEACHER_PROFESSION)
        var teacherProfile = intent.getIntExtra(TEACHER_PROFILE, 0)
        var teacherAddress = intent.getStringExtra(TEACHER_ADDRESS)
        var teacherDob = intent.getStringExtra(TEACHER_DOB)
        var teacherPhone = intent.getStringExtra(TEACHER_PHONE)
        var teacherEmail = intent.getStringExtra(TEACHER_EMAIL)
        txtTeacherName.text = teacherName
        txtTechAddress.text = teacherAddress
        imgTeacherProfile.setImageResource(teacherProfile)
        txtTechProfession.text = teacherProfession
        txtTechDob.text = teacherDob
        txtTechPhone.text = teacherPhone
        txtTechEmail.text = teacherEmail

        imageView2.setOnClickListener {
            onBackPressed()
            true
        }
    }
}
