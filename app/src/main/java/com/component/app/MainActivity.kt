package com.component.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.launcher.ARouter
import com.apt.apt_annotation.BindView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login_btn.setOnClickListener {
            ARouter.getInstance().build("/login/loginactivity").navigation()
        }

        pay_btn.setOnClickListener {
            ARouter.getInstance().build("/pay/payactivity").navigation()
        }
    }
}
