package com.example.realproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realproject.R
import kotlinx.android.synthetic.main.activity_detail_profile.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.nav_header_main.*

class DetailProfileActivity : AppCompatActivity() {
    companion object{
        const val TEACHER_NAME = "teacher_name"
        const val TEACHER_PROFESSION = "profession"
        const val TEACHER_PROFILE = "profile"
        const val TEACHER_TRACK = "track"
        fun newIntent(context: Context,
                      teacherName:String,
                      teacherProfession: String,
                      teacherProfile: Int,
                      teacherTrack : String
                      ): Intent {
            var intent = Intent(context, DetailProfileActivity::class.java)
            intent.putExtra(TEACHER_NAME,teacherName)
            intent.putExtra(TEACHER_PROFESSION, teacherProfession)
            intent.putExtra(TEACHER_PROFILE, teacherProfile)
            intent.putExtra(TEACHER_TRACK,teacherTrack)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        var teacherName = intent.getStringExtra(TEACHER_NAME)
        var teacherProfession = intent.getStringExtra(TEACHER_PROFESSION)
        var teacherProfile = intent.getIntExtra(TEACHER_PROFILE, 0)
        var teacherTrack = intent.getStringExtra(TEACHER_TRACK)
        txtTeacherName.text = teacherName
        txtTeacherTrack.text = teacherProfession
        imgTeacherProfile.setImageResource(teacherProfile)
        txtTechProfession.text = teacherTrack

        img_btn_back.setOnClickListener {
            onBackPressed()
            true
        }
    }
}
