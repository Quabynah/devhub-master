package io.devhub.feature.ui

import android.app.Activity
import android.os.Bundle
import io.devhub.feature.R

/**
 * Splash screen
 */
class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}
