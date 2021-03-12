package com.example.worldcinema.MainScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcinema.MovieScreen.MovieScreen
import com.example.worldcinema.R
import kotlinx.android.synthetic.main.activity_main_screen.*


class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        frameLayout3.setOnClickListener{
            val intent = Intent(this, MovieScreen::class.java)
            startActivity(intent)
        }
    }
}