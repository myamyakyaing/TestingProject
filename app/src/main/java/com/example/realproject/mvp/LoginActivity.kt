package com.example.realproject.mvp

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import android.util.Log
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import com.example.realproject.R
import com.example.realproject.activities.MainActivity


class LoginActivity : AppCompatActivity(),LoginContract.LoginView {

    companion object {
        private val REQUEST_SIGNUP = 0
    }
    private var doLogin:LoginContract.LoginPresenter = LoginPresenterImpl()

    override fun goToNextActivity() {
        btnLogin.isEnabled  = true
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    override fun showError(error: String) {
        Toast.makeText(this,error,Toast.LENGTH_SHORT).show()
        btnLogin.isEnabled = true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_login)

        doLogin.attachView(this)
        btnLogin.setOnClickListener {
            fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
                if (requestCode != REQUEST_SIGNUP) return
                if (resultCode == Activity.RESULT_OK) {
                    // By default we just finish the Activity and log them in automatically
                    this.finish()
                }
            }
            var username = edtEmail.text.toString()
            var password = edtPass.text.toString()
            doLogin.clickButton(this,username,password)

        }
    }

}
