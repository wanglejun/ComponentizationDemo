package com.component.base

import android.app.Application

abstract class BaseApp:Application() {
    abstract fun initModuleApp(application: Application)
    abstract fun initModuleData(application: Application)
}