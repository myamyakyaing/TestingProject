package com.example.realproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realproject.R
import kotlinx.android.synthetic.main.activity_detail_profile.*
import kotlinx.android.synthetic.main.activity_student_profile.*
import kotlinx.android.synthetic.main.rv_student.*

class StudentProfileActivity : AppCompatActivity() {
    companion object{
        const val STUDENT_NAME = "student_name"
        const val STUDENT_TRACK = "track"
        const val STUDENT_PROFILE = "profile"
        const val STUDENT_PROFESSION = "profession"
        const val STUDENT_COMPANY = "companyName"
        const val STUDENT_ADDRESS ="address"
        const val STUDENT_DOB = "dob"
        const val STUDENT_PHONE = "phorne"
        const val STUDENT_EMAIL = "email"
        fun newIntent(context: Context,
                      studentName:String, studentTrack: String, studentProfile: Int,
                      studentProfession:String,studentCompany:String,studentAddess:String,
                      studentDob:String,studentPhone:String,studentEmail:String
        ): Intent {
            var intent = Intent(context, StudentProfileActivity::class.java)
            intent.putExtra(STUDENT_NAME,studentName)
            intent.putExtra(STUDENT_TRACK, studentTrack)
            intent.putExtra(STUDENT_PROFILE, studentProfile)
            intent.putExtra(STUDENT_PROFESSION,studentProfession)
            intent.putExtra(STUDENT_COMPANY,studentCompany)
            intent.putExtra(STUDENT_ADDRESS,studentAddess)
            intent.putExtra(STUDENT_DOB,studentDob)
            intent.putExtra(STUDENT_PHONE,studentPhone)
            intent.putExtra(STUDENT_EMAIL,studentEmail)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_profile)
        var studentName = intent.getStringExtra(STUDENT_NAME)
        var studentTrack = intent.getStringExtra(STUDENT_TRACK)
        var studentProfile = intent.getIntExtra(STUDENT_PROFILE, 0)
        var studentProfession = intent.getStringExtra(STUDENT_PROFESSION)
        var studentCompany = intent.getStringExtra(STUDENT_COMPANY)
        var studentAddress = intent.getStringExtra(STUDENT_ADDRESS)
        var studentDob = intent.getStringExtra(STUDENT_DOB)
        var studentPhone = intent.getStringExtra(STUDENT_PHONE)
        var studentEmail = intent.getStringExtra(STUDENT_EMAIL)
        txtStdName.text = studentName
        txtStdTrack.text = studentTrack
        profileStudent.setImageResource(studentProfile)
        txtStdProfession.text = studentProfession
        txtStdCompany.text = studentCompany
        txtStdAddress.text = studentAddress
        txtStdDob.text = studentDob
        txtStdPhone.text = studentPhone
        txtStdEmail.text = studentEmail

        std_btn_back.setOnClickListener {
            onBackPressed()
            true
        }
    }
}
