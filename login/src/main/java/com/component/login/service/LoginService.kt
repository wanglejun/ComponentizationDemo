package com.component.login.service

import com.component.base.service.ILoginService

class LoginService:ILoginService {
    override fun isLogin(): Boolean {
        return true
    }

    override fun getToken(): String {
        return "Token Bare 1234567890"
    }

}