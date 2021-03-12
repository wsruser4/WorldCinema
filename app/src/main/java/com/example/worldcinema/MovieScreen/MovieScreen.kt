package com.example.worldcinema.MovieScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcinema.MainScreen.MainScreen
import com.example.worldcinema.R
import kotlinx.android.synthetic.main.activity_movie_screen.*

class MovieScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_screen)

        imageView5.setOnClickListener{
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}