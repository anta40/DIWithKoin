package com.anta40.app.diwithkoin

import android.app.Application
import org.koin.core.context.GlobalContext.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            this@App
            listOf(sessionModule)
        }
    }

}