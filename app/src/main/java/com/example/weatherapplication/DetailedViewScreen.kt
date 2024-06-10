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

        private lateinit var mondayScreenTime: TextView
        private lateinit var tuesdayScreenTime: TextView
        private lateinit var wednesdayScreenTime: TextView
        private lateinit var thursdayScreenTime: TextView
        private lateinit var fridayScreenTime: TextView
        private lateinit var saturdayScreenTime: TextView
        private lateinit var sundayScreenTime: TextView
        private lateinit var averageScreenTime: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_detailed_view_screen2)


            mondayScreenTime  = findViewById(R.id.mondayScreenTime)
            tuesdayScreenTime = findViewById(R.id.tuesdayScreenTime)
            wednesdayScreenTime = findViewById(R.id.wednesdayScreenTime)
            thursdayScreenTime = findViewById(R.id.thursdayScreenTime)
            fridayScreenTime = findViewById(R.id.fridayScreenTime)
            saturdayScreenTime = findViewById(R.id.saturdayScreenTime)
            sundayScreenTime = findViewById(R.id.sundayScreenTime)
            averageScreenTime = findViewById(R.id.averageScreenTime)
            val backToMainButton: Button = findViewById(R.id.backToMainButton)

            val screenTimes = intent.getIntegerArrayListExtra("screenTimes")
            if (screenTimes != null) {
                mondayScreenTime.text = "Monday: ${screenTimes[0]} hours"
                tuesdayScreenTime.text = "Tuesday: ${screenTimes[0]} hours"
                wednesdayScreenTime.text = "Wednesday: ${screenTimes[0]} hours"
                thursdayScreenTime.text = "Thursday: ${screenTimes[0]} hours"
                fridayScreenTime.text = "Friday: ${screenTimes[0]} hours"
                saturdayScreenTime.text = "Saturday: ${screenTimes[0]} hours"
                sundayScreenTime.text = "Sunday: ${screenTimes[0]} hours"




                val average = screenTimes.sum() / screenTimes.size.toDouble()
                averageScreenTime.text = "Average Screen Time: $average hours"
            }


            backToMainButton.setOnClickListener {
                finish()
            }
        }
    }


}
    }
