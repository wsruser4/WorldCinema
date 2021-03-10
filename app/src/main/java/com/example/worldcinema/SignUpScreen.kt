package com.example.worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_sign_in_screen.frameLayout2
import kotlinx.android.synthetic.main.activity_sign_up_screen.et1
import kotlinx.android.synthetic.main.activity_sign_up_screen.frameLayout1


class SignUpScreen : AppCompatActivity() {

    var isCanEmail = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)


        et1.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(et1.text.toString()).matches()) {
                    isCanEmail = true
                } else {
                    isCanEmail = false
                    et1.setError("Неверный e-mail")
                }
            }
        })

        frameLayout1.isEnabled = isCanEmail



        frameLayout2.setOnClickListener{
        val intent = Intent(this, SignInScreen::class.java)
        startActivity(intent)
        }

        frameLayout1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}