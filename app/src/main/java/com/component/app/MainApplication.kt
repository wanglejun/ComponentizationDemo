package com.component.app

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.component.base.AppConfig
import com.component.base.BaseApp

class MainApplication:BaseApp() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
        initModuleApp(this)
        initModuleData(this)
    }
    override fun initModuleApp(application: Application) {
        for (moduleApp in AppConfig.moduleApps){
            val clazz = Class.forName(moduleApp)
            val baseApp = clazz.newInstance() as BaseApp
            baseApp.initModuleApp(this)
        }
    }

    override fun initModuleData(application: Application) {
        for (moduleApp in AppConfig.moduleApps){
            val clazz = Class.forName(moduleApp)
            val baseApp = clazz.newInstance() as BaseApp
            baseApp.initModuleData(this)
        }
    }
}