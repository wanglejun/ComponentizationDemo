package com.component.base

import com.component.base.default.DefaultLoginService
import com.component.base.service.ILoginService

class ServiceFactory private constructor() {

    private var loginService:ILoginService?=null


    companion object{
        fun getInstance():ServiceFactory{
            return Inner.serviceFactory
        }
    }


    class Inner{
        companion object{
            val serviceFactory = ServiceFactory()
        }
    }

    fun setLoginService(loginService: ILoginService){
        this.loginService = loginService
    }

    fun getLoginService():ILoginService{
        if(this.loginService == null){
            loginService = DefaultLoginService()
        }
        return loginService as ILoginService
    }
}