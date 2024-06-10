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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputMonday: EditText = findViewById(R.id.inputMonday)
        val inputTuesday: EditText = findViewById(R.id.inputTuesday)
        val inputWednesday: EditText = findViewById(R.id.inputWednesday)
        val inputThursday: EditText = findViewById(R.id.inputThursday)
        val inputFriday: EditText = findViewById(R.id.inputFriday)
        val inputSaturday: EditText = findViewById(R.id.inputSaturday)
        val inputSunday: EditText = findViewById(R.id.inputSunday)
        val screenTimes = mutableListOf<Int?>()


        // Repeat for other days

        val addDataButton: Button = findViewById(R.id.addDataButton)
        val clearDataButton: Button = findViewById(R.id.clearDataButton)
        val viewDetailsButton: Button = findViewById(R.id.viewDetailsButton)

        addDataButton.setOnClickListener {
            if (inputMonday.text.isEmpty()) {
                Toast.makeText(this, "Please enter screen time for Monday", Toast.LENGTH_SHORT)
                    .show()
            } else {
                screenTimes.clear()
                screenTimes.add(inputMonday.text.toString().toInt())
                // Add other days similarly
                if (inputTuesday.text.isEmpty()) {
                    Toast.makeText(
                        this,
                        "Please enter screen time for Monday",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                } else {
                    screenTimes.clear()
                    screenTimes.add(inputTuesday.text.toString().toInt())
                    Toast.makeText(this, "Screen time added", Toast.LENGTH_SHORT).show()

                    if (inputWednesday.text.isEmpty()) {
                        Toast.makeText(
                            this,
                            "Please enter screen time for Monday",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    } else {
                        screenTimes.clear()
                        screenTimes.add(inputWednesday.text.toString().toInt())
                        Toast.makeText(this, "Screen time added", Toast.LENGTH_SHORT).show()

                        if (inputThursday.text.isEmpty()) {
                            Toast.makeText(
                                this,
                                "Please enter screen time for Monday",
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        } else {
                            screenTimes.clear()
                            screenTimes.add(inputThursday.text.toString().toInt())
                            Toast.makeText(this, "Screen time added", Toast.LENGTH_SHORT).show()

                            if (inputFriday.text.isEmpty()) {
                                Toast.makeText(
                                    this,
                                    "Please enter screen time for Monday",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                            } else {
                                screenTimes.clear()
                                screenTimes.add(inputFriday.text.toString().toInt())
                                Toast.makeText(this, "Screen time added", Toast.LENGTH_SHORT)
                                    .show()

                                if (inputSaturday.text.isEmpty()) {
                                    Toast.makeText(
                                        this,
                                        "Please enter screen time for Monday",
                                        Toast.LENGTH_SHORT
                                    )
                                        .show()
                                } else {
                                    screenTimes.clear()
                                    screenTimes.add(inputSaturday.text.toString().toInt())
                                    Toast.makeText(
                                        this,
                                        "Screen time added",
                                        Toast.LENGTH_SHORT
                                    )

                                        .show()
                                    if (inputSunday.text.isEmpty()) {
                                        Toast.makeText(
                                            this,
                                            "Please enter screen time for Monday",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    } else {
                                        screenTimes.clear()
                                        screenTimes.add(inputSunday.text.toString().toInt())
                                        Toast.makeText(
                                            this,
                                            "Screen time added",
                                            Toast.LENGTH_SHORT
                                        ).show()

                                    }
                                }

                                clearDataButton.setOnClickListener {
                                    inputMonday.text.clear()
                                    inputTuesday.text.clear()
                                    // Clear other days similarly
                                    screenTimes.clear()
                                    Toast.makeText(
                                        this,
                                        "Screen times cleared",
                                        Toast.LENGTH_SHORT
                                    )
                                        .show()
                                }

                                viewDetailsButton.setOnClickListener {
                                    if (screenTimes.isEmpty()) {
                                        Toast.makeText(
                                            this,
                                            "No screen time data to show",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    } else {
                                        val intent = Intent(this, DetailedViewScreen::class.java)
                                        intent.putIntegerArrayListExtra(
                                            "screenTimes",
                                            ArrayList(screenTimes)
                                        )
                                        startActivity(intent)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}









