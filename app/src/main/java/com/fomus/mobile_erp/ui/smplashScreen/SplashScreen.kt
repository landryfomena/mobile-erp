package com.fomus.mobile_erp.ui.smplashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fomus.mobile_erp.R
import com.fomus.mobile_erp.ui.authentication.login.LoginActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }, 5000)
    }
}