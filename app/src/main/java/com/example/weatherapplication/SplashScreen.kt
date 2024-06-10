package com.example.weatherapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)


        val mainScreenButton: Button = findViewById(R.id.mainScreenButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        mainScreenButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))//to start a new activity from a current activity
        }

        exitButton.setOnClickListener {
            finish()

            window.setFlags(//to set window flags on an Android Window object
                WindowManager.LayoutParams.FLAG_FULLSCREEN,//a constant flag value to indicate that a window should not be displayed in full-screen mode.
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )

            Handler().postDelayed({//is used to not schedule a task to be executed after a certain delay on the main (UI) thread
                val intent = Intent(this, MainActivity::class.java)//to start a new activity from a current activity
                startActivity(intent)// to start a new activity based on the provided Intent
                finish()//used to close the current activity.
            }, 3000)//this is the delay in milliseconds before the task is executed


        }
    }
}



