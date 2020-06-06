package com.component.base.default

import com.component.base.service.ILoginService
// login 组件接口默认实现
class DefaultLoginService:ILoginService{
    override fun isLogin(): Boolean {
        return false
    }

    override fun getToken(): String {
        return ""
    }

}