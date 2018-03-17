package io.devhub

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

/**
 * Application class for DevHub
 */
class DevApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}