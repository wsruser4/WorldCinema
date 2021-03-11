package com.example.worldcinema.SignIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.worldcinema.MainScreen.MainScreen
import com.example.worldcinema.R
import com.example.worldcinema.SignUp.SignUpScreen
import kotlinx.android.synthetic.main.activity_sign_in_screen.*


class SignInScreen : AppCompatActivity() {

        var isCanEmail = false
        var isCanEmailVeri = false
        var isCanPass = false
        var isCanName = false
        var isCanFam = false
        var isCanpassAgg = false
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_sign_in_screen)

            if (et1.getText().toString().equals("")) {
                et1.error = "Заполните поле"
            } else {
                isCanEmail = true
            }

            if (android.util.Patterns.EMAIL_ADDRESS.matcher(et1.text.toString()).matches()) {
                isCanEmailVeri = true
            } else {
                et1.error = "Неверно введена почта"
                isCanEmailVeri = false
            }

            if (et2.getText().toString().equals("")) {
                isCanPass = false
                et2.error = "Заполните поле"
            } else {
                isCanPass = true
            }

            //frameLayout1.isEnabled = isCanEmailVeri
            frameLayout1.setOnClickListener {
                startActivity(Intent(this, MainScreen::class.java))
            }
            frameLayout2.setOnClickListener {
                val intent = Intent(this, SignUpScreen::class.java)
                startActivity(intent)
            }
        }
    }
