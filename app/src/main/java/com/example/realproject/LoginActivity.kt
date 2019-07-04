package com.example.realproject

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.EditText
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.Toast


class LoginActivity : AppCompatActivity() {

    private lateinit var email: String
    private lateinit var password: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            login()
        }
    }

    fun login() {
        Log.d(TAG, "Login")

        if (!validate()) {
            onLoginFailed()
            return
        }

        btnLogin!!.isEnabled = false

        val progressDialog = ProgressDialog(this@LoginActivity,
            com.example.realproject.R.style.AppTheme_Dark_Dialog)
        progressDialog.isIndeterminate = true
        progressDialog.setMessage("Login...")
        progressDialog.show()

        email = edtEmail.text.toString()
        password = edtPass!!.text.toString()

        android.os.Handler().postDelayed(
            {
                // On complete call either onLoginSuccess or onLoginFailed
                onLoginSuccess()
                // onLoginFailed();
                progressDialog.dismiss()
            }, 3000)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != REQUEST_SIGNUP) return
        if (resultCode == Activity.RESULT_OK) {
            // By default we just finish the Activity and log them in automatically
            this.finish()
        }
    }

    override fun onBackPressed() {
        // Disable going back to the MainActivity
        moveTaskToBack(true)
    }

    fun onLoginSuccess() {
        btnLogin!!.isEnabled = true
//        finish()
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun onLoginFailed() {
        Toast.makeText(baseContext, "Login failed", Toast.LENGTH_LONG).show()

        btnLogin!!.isEnabled = true
    }

    fun validate(): Boolean {
        var valid = true

        email = edtEmail!!.text.toString()
        password = edtPass!!.text.toString()
        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            edtEmail!!.error = "Enter a valid email address"
            valid = false
        } else {
            edtEmail!!.error = null
        }

        if (password.isEmpty() || password.length < 8 || password.length > 16) {
            edtPass!!.error = "Between 8 and 16 alphanumeric characters"
            valid = false
        } else {
            edtPass!!.error = null
        }

        return valid
    }

    companion object {
        private val TAG = "LoginActivity"
        private val REQUEST_SIGNUP = 0
    }
}
