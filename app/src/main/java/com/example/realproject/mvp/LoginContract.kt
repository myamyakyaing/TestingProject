package com.example.realproject.mvp

import android.content.Context

class LoginContract {
    interface LoginView{
        fun goToNextActivity()
        fun showError(error:String)
    }

    interface LoginPresenter{
        fun attachView(view: LoginView)
        fun clickButton(context: Context, username:String, password:String):Boolean
    }
}