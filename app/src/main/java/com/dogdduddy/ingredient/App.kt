package com.dogdduddy.ingredient

import android.app.Application
import android.content.Context
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger

class App: Application() {
    companion object {
        var instance: App? = null
        var appContext : Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        appContext = this
        instance = this

        AppEventsLogger.activateApp(this)

    }
    override fun onTerminate() {
        super.onTerminate()
        instance = null
    }

    fun getAppContext() : App {
        checkNotNull(instance){
            "This Application does not inherit com.example.App"
        }
        return instance!!
    }
}