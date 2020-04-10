package com.aldi.librarycatalog.authentication

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aldi.librarycatalog.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        buttonLogin.setOnClickListener {
            progressBar.visibility = View.VISIBLE

        }
        buttonBantuan.setOnClickListener {

        }
    }



}
