package com.example.worldcinema.LaunchScreen

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.worldcinema.MovieScreen
import com.example.worldcinema.R
import com.example.worldcinema.SignUp.SignUpScreen

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)

        Handler().postDelayed({
                val intent = Intent(this, SignUpScreen::class.java)
                startActivity(intent)
                finish()

        }, 3000)
    }
}