package com.component.login

import android.app.Application
import android.util.Log
import com.component.base.BaseApp
import com.component.base.ServiceFactory
import com.component.login.service.LoginService

class LoginApplication:BaseApp() {


    override fun onCreate() {
        super.onCreate()
        initModuleApp(this)
        initModuleData(this)
    }

    override fun initModuleApp(application: Application) {
        Log.d("LoginApplication","initModuleApp=========")
        ServiceFactory.getInstance().setLoginService(LoginService())
    }

    override fun initModuleData(application: Application) {
        Log.d("LoginApplication","initModuleData=========")

    }
}