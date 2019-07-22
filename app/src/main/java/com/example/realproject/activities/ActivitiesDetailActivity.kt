package com.example.realproject.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.realproject.R
import kotlinx.android.synthetic.main.activity_activities_detail.*

class ActivitiesDetailActivity : AppCompatActivity() {
    companion object{
        const val ADDRESSED_NAME = "name"
        const val ADDRESSED_PROFILE = "profile"
        const val ADDRESSED_BODY = "address"
        fun newIntent(context: Context,
                      addresedName:String,
                      addressedProfile: Int,
                      addressedBody : String

        ): Intent {
            var intent = Intent(context, ActivitiesDetailActivity::class.java)
            intent.putExtra(ADDRESSED_NAME,addresedName)
            intent.putExtra(ADDRESSED_PROFILE, addressedProfile)
            intent.putExtra(ADDRESSED_BODY, addressedBody)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activities_detail)
        var addressedName = intent.getStringExtra(ADDRESSED_NAME)
        var addressedProfile = intent.getIntExtra(ADDRESSED_PROFILE, 0)
        var addressedBody = intent.getStringExtra(ADDRESSED_BODY)
        imgPresentation.setImageResource(addressedProfile)
        txtPresentationName.text = addressedName
        txtPresentationBody.text = addressedBody
        btnPresentation.setOnClickListener {
            onBackPressed()
            true
        }
    }
}
