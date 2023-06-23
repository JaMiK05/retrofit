package uz.gita.retrofit.app

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        intance = this
    }

    companion object {
    @SuppressLint("StaticFieldLeak")
        lateinit var intance: Context
            private set
    }

}