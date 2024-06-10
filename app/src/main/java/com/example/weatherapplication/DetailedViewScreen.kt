package com.example.weatherapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)

        val screenTimes = intent.getIntArrayExtra("screenTimes") ?: IntArray(7)
        val detailsTextView: TextView = findViewById(R.id.detailsTextView)
        val averageTextView: TextView = findViewById(R.id.averageTextView)
        val backButton: Button = findViewById(R.id.backButton)

        val detailsText = StringBuilder()
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        var total = 0

        for (i in screenTimes.indices) {
            detailsText.append("${days[i]}: ${screenTimes[i]} Degrees Celcius\n")
            total += screenTimes[i]
        }

        val average = total / 7.0
        detailsTextView.text = detailsText.toString()
        averageTextView.text = "Average Weather : $average Degrees Celcius"

        backButton.setOnClickListener {
            finish()
        }
    }
}





