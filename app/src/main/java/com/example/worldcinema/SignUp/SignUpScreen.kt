package com.example.worldcinema.SignUp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import com.example.worldcinema.R
import com.example.worldcinema.SignIn.SignInScreen
import kotlinx.android.synthetic.main.activity_sign_up_screen.*


class SignUpScreen : AppCompatActivity() {

    var isCanEmail = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)


        var isCanEmail = false
        var isCanEmailVer = false
        var isCanPass = false
        var isCanName = false
        var isCanFam = false
        var isCanpassAgg = false

        isCanEmailVer = isEmailValid(et1.text)

        if (etn.getText().toString().equals("")) {
            isCanName = false
            etn.error = "Заполните поле"
        } else {
            isCanName = true }

        if (ets.getText().toString().equals("")) {
            isCanFam = false
            ets.error = "Заполните поле"
        } else {
            isCanFam = true }

        if (et1.getText().toString().equals("")) {
            et1.error = "Заполните поле"
        } else {
            isCanEmail = true }

        if (et2.getText().toString().equals("")) {
            isCanPass = false
            et2.error = "Заполните поле"
        } else {
            isCanPass = true }

        if (et2.getText().toString().equals("")) {
            isCanpassAgg = false
            et3.error = "Заполните поле"
        } else {
            isCanpassAgg = true }

        if (et2.text != et3.text) {
            isCanpassAgg = false
            et3.error = "Пароли не совпадают"
        } else {
            isCanpassAgg = true }

        frameLayout1.setOnClickListener {
            startActivity(Intent(this, SignInScreen::class.java))
        }
        frameLayout2.setOnClickListener {
            startActivity(Intent(this, SignInScreen::class.java))
        }

    }

    fun isEmailValid(email: CharSequence?): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

}