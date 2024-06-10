package com.example.weatherapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var inputMonday: EditText
    private lateinit var inputTuesday: EditText
    private lateinit var inputWednesday: EditText
    private lateinit var inputThursday: EditText
    private lateinit var inputFriday: EditText
    private lateinit var inputSaturday: EditText
    private lateinit var inputSunday: EditText
    private lateinit var addDataButton: Button
    private lateinit var clearDataButton: Button
    private lateinit var viewDetailsButton: Button

    private val screenTimes = IntArray(7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        inputMonday = findViewById(R.id.inputMonday)
        inputTuesday = findViewById(R.id.inputTuesday)
        inputWednesday = findViewById(R.id.inputWednesday)
        inputThursday = findViewById(R.id.inputThursday)
        inputFriday = findViewById(R.id.inputFriday)
        inputSaturday = findViewById(R.id.inputSaturday)
        inputSunday= findViewById(R.id.inputSunday)
        addDataButton = findViewById(R.id.addDataButton)
        clearDataButton = findViewById(R.id.clearDataButton)
        viewDetailsButton = findViewById(R.id.viewDetailsButton)

        addDataButton.setOnClickListener {
            try {
                screenTimes[0] = inputMonday.text.toString().toInt()
                screenTimes[1] = inputTuesday.text.toString().toInt()
                screenTimes[2] = inputWednesday.text.toString().toInt()
                screenTimes[3] = inputThursday.text.toString().toInt()
                screenTimes[4] = inputFriday.text.toString().toInt()
                screenTimes[5] = inputSaturday.text.toString().toInt()
                screenTimes[6] = inputSunday.text.toString().toInt()

                Toast.makeText(this, "Weather times added successfully", Toast.LENGTH_SHORT).show()
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        clearDataButton.setOnClickListener {
            inputMonday.text.clear()
            inputTuesday.text.clear()
            inputWednesday.text.clear()
            inputThursday.text.clear()
            inputFriday.text.clear()
            inputSaturday.text.clear()
            inputSunday.text.clear()
        }

        viewDetailsButton.setOnClickListener {
            val intent = Intent(this, DetailedViewScreen::class.java)
            intent.putExtra("screenTimes", screenTimes)
            startActivity(intent)
        }
    }
}









