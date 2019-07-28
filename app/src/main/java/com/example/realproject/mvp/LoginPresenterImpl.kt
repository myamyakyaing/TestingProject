package com.example.realproject.mvp

import android.app.ProgressDialog
import android.content.Context
import com.example.realproject.R

class LoginPresenterImpl: LoginContract.LoginPresenter {
    private var loginView:LoginContract.LoginView? = null
    override fun attachView(view: LoginContract.LoginView) {
        this.loginView = view
    }

    override fun clickButton(context: Context, username: String, password: String): Boolean {
        var valid = true

        val progressDialog = ProgressDialog(
            context,
            R.style.AppTheme_Dark_Dialog
        )
        progressDialog.isIndeterminate = true
        progressDialog.setMessage("Login...")
        progressDialog.show()

        android.os.Handler().postDelayed(
            {
                // On complete call either onLoginSuccess
                loginView?.goToNextActivity()
                // onLoginFailed();
                progressDialog.dismiss()
            }, 1000)


        if (username.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(username).matches()) {
            loginView?.showError("Enter a valid email address")
            valid = false
        }

        if (password.isEmpty() || password.length < 8 || password.length > 16) {
            loginView?.showError("Between 8 and 16 alphanumeric characters")
            valid = false
        }
        return valid

    }


}