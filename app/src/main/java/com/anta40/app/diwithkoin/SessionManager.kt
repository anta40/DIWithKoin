package com.anta40.app.diwithkoin

import android.content.Context
import android.content.SharedPreferences
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val sessionModule = module {
    single { SessionManager(androidContext()) }
}

class SessionManager (context: Context) {

    private val preferences: SharedPreferences = context.getSharedPreferences("app_pref", Context.MODE_PRIVATE)
    private val MY_CUSTOM_STR = "test"

    init {
        saveStringValue("Hello world 12345")
    }

    private fun saveStringValue(content: String) {
        preferences.edit().putString(MY_CUSTOM_STR, content).apply()
    }

    fun getStringValue(): String? {
        return preferences.getString(MY_CUSTOM_STR, "")
    }
}