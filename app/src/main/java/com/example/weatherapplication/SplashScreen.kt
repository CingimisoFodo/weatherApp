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


        val mainScreenButton: Button = findViewById(R.id.mainScreenButton)// (IIE,2024)
        val exitButton: Button = findViewById(R.id.exitButton)// (IIE,2024)

        // (IIE,2024)
        //(Kotlin Help, 2024)
        mainScreenButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))//to start a new activity from a current activity
        }
        // (IIE,2024)
        //(Kotlin Help, 2024)
        exitButton.setOnClickListener {
            finish()
            // (IIE,2024)
            window.setFlags(//to set window flags on an Android Window object
                WindowManager.LayoutParams.FLAG_FULLSCREEN,//a constant flag value to indicate that a window should not be displayed in full-screen mode.
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
            // (IIE,2024)
            Handler().postDelayed({//is used to not schedule a task to be executed after a certain delay on the main (UI) thread
                val intent = Intent(this, MainActivity::class.java)//to start a new activity from a current activity
                startActivity(intent)// to start a new activity based on the provided Intent
                finish()//used to close the current activity.
            }, 3000)//this is the delay in milliseconds before the task is executed


        }
    }
}

// REFERENCE LIST

// The IIE, 2024. Introduction to Mobile Application Development [IMAD5112/d/p/w]. The Independent Institution of Education: Unpublished [Accessed 3 may 2024].
// Pixabay (2024). Pixabay. [online] Pixabay.com. Available at: https://pixabay.com/.
// iStockPhoto.com. (2024). Stockfoto’s, royalty free beelden en video’s - iStock. [online] Available at: https://www.istockphoto.com/nl [Accessed 6 May 2024].
// Kotlin Help. (2024). Get started with Kotlin | Kotlin. [online] Available at: https://kotlinlang.org/docs/getting-started.html [Accessed 3 Jun. 2024].
// GitHub (2024). GitHub. [online] GitHub. Available at: https://github.com/.

