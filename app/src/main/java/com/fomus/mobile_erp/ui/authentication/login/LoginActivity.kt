package com.fomus.mobile_erp.ui.authentication.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible
import com.fomus.mobile_erp.MainActivity
import com.fomus.mobile_erp.R
import com.fomus.mobile_erp.ui.drawer.DrawerActivity
import kotlinx.android.synthetic.main.activity_main2.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        onClickListeners()
    }



    private fun onClickListeners() {
        btn_connexion!!.setOnClickListener {
            SigninAction()

        }

        sign_up_btn.setOnClickListener {
            signupAction()
        }
    }

    /**
     * Signin action
     *
     */
    private fun SigninAction() {
        var password = login_password.text.toString()
        var login = login_email.text.toString()
        if (password.isNotEmpty() and login.isNotEmpty()) {
            progress_Bar.isVisible = true
            signIn(login, password)
        } else {
            Toast.makeText(
                this,
                "are you foul ? put the email and the password there !!!",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun signIn(login: String, password: String) {
        var intent = Intent(applicationContext, DrawerActivity::class.java)
        startActivity(intent)
    }
    private fun signupAction() {
        Toast.makeText(
            this,
            resources.getText(R.string.feature_to_be_implemented),
            Toast.LENGTH_LONG
        ).show()
    }

}