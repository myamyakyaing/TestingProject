package com.example.realproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realproject.R
import kotlinx.android.synthetic.main.activity_course_detail.*

class CourseDetailActivity : AppCompatActivity() {
    companion object{
        const val COURSE_ONE = "one"
        const val COURSE_TWO = "two"
        const val COURSE_THREE = "three"
        const val COURSE_FOUR = "four"
        const val COURSE_FIVE = "five"
        const val COURSE_SIX = "six"
        fun newIntent(context: Context,
                      one:String,
                      two: String,
                      three: String,
                      four: String,
                      five: String,
                      six: String

        ): Intent {
            var intent = Intent(context, CourseDetailActivity::class.java)
            intent.putExtra(COURSE_ONE,one)
            intent.putExtra(COURSE_TWO, two)
            intent.putExtra(COURSE_THREE, three)
            intent.putExtra(COURSE_FOUR,four)
            intent.putExtra(COURSE_FIVE, five)
            intent.putExtra(COURSE_SIX,six)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_detail)
        var no_one = intent.getStringExtra(COURSE_ONE)
        var no_two = intent.getStringExtra(COURSE_TWO)
        var no_three = intent.getStringExtra(COURSE_THREE)
        var no_four = intent.getStringExtra(COURSE_FOUR)
        var no_five = intent.getStringExtra(COURSE_FIVE)
        var no_six = intent.getStringExtra(COURSE_SIX)
        txtOne.text= no_one
        txtTwo.text = no_two
        txtThree.text = no_three
        txtFour.text = no_four
        txtFive.text = no_five
        txtSix.text = no_six

    }
}
