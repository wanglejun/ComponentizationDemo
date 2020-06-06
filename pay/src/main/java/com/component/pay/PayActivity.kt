package com.component.pay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.component.base.ServiceFactory
import kotlinx.android.synthetic.main.activity_pay.*
@Route(path = "/pay/payactivity")
class PayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)
        var content = ""
        if(ServiceFactory.getInstance().getLoginService().isLogin()){
            content = "已登陆，TOKEN ==》${ServiceFactory.getInstance().getLoginService().getToken()}"
        }else{
            content = "未登陆"
        }
        this.content.setText(content)
    }
}
