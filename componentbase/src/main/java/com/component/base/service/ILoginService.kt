package com.component.base.service

interface ILoginService {
    //是否登陆
    fun isLogin():Boolean

    //获取Token
    fun getToken():String
}