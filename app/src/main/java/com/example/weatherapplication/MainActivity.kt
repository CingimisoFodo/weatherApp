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

    private lateinit var inputMonday: EditText// (IIE,2024)
    private lateinit var inputTuesday: EditText// (IIE,2024)
    private lateinit var inputWednesday: EditText// (IIE,2024)
    private lateinit var inputThursday: EditText// (IIE,2024)
    private lateinit var inputFriday: EditText// (IIE,2024)
    private lateinit var inputSaturday: EditText// (IIE,2024)
    private lateinit var inputSunday: EditText// (IIE,2024)
    private lateinit var addDataButton: Button// (IIE,2024)
    private lateinit var clearDataButton: Button// (IIE,2024)
    private lateinit var viewDetailsButton: Button// (IIE,2024)
    //(Kotlin Help, 2024)
    private val screenTimes = IntArray(7)// (IIE,2024)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //(Kotlin Help, 2024)
        inputMonday = findViewById(R.id.inputMonday)// (IIE,2024)
        inputTuesday = findViewById(R.id.inputTuesday)// (IIE,2024)
        inputWednesday = findViewById(R.id.inputWednesday)// (IIE,2024)
        inputThursday = findViewById(R.id.inputThursday)// (IIE,2024)
        inputFriday = findViewById(R.id.inputFriday)// (IIE,2024)
        inputSaturday = findViewById(R.id.inputSaturday)// (IIE,2024)
        inputSunday= findViewById(R.id.inputSunday)// (IIE,2024)
        addDataButton = findViewById(R.id.addDataButton)// (IIE,2024)
        clearDataButton = findViewById(R.id.clearDataButton)// (IIE,2024)
        viewDetailsButton = findViewById(R.id.viewDetailsButton)// (IIE,2024)
        //(Kotlin Help, 2024)
        addDataButton.setOnClickListener {
            try {
                screenTimes[0] = inputMonday.text.toString().toInt()// (IIE,2024)
                screenTimes[1] = inputTuesday.text.toString().toInt()// (IIE,2024)
                screenTimes[2] = inputWednesday.text.toString().toInt()// (IIE,2024)
                screenTimes[3] = inputThursday.text.toString().toInt()// (IIE,2024)
                screenTimes[4] = inputFriday.text.toString().toInt()// (IIE,2024)
                screenTimes[5] = inputSaturday.text.toString().toInt()// (IIE,2024)
                screenTimes[6] = inputSunday.text.toString().toInt()// (IIE,2024)

                Toast.makeText(this, "Temperature times added successfully", Toast.LENGTH_SHORT).show()// (IIE,2024)
            } catch (e: NumberFormatException) {// (IIE,2024)
                Toast.makeText(this, "Please enter valid temperature numbers", Toast.LENGTH_SHORT).show()// (IIE,2024)
            }
        }

        clearDataButton.setOnClickListener {// (IIE,2024)
            inputMonday.text.clear()// (IIE,2024)
            inputTuesday.text.clear()// (IIE,2024)
            inputWednesday.text.clear()// (IIE,2024)
            inputThursday.text.clear()// (IIE,2024)
            inputFriday.text.clear()// (IIE,2024)
            inputSaturday.text.clear()// (IIE,2024)
            inputSunday.text.clear()// (IIE,2024)
        }

        viewDetailsButton.setOnClickListener {// (IIE,2024)
            val intent = Intent(this, DetailedViewScreen::class.java)// (IIE,2024)
            intent.putExtra("screenTimes", screenTimes)// (IIE,2024)
            startActivity(intent)// (IIE,2024)
        }
    }
}
// REFERENCE LIST

// The IIE, 2024. Introduction to Mobile Application Development [IMAD5112/d/p/w]. The Independent Institution of Education: Unpublished [Accessed 3 may 2024].
// Pixabay (2024). Pixabay. [online] Pixabay.com. Available at: https://pixabay.com/.
// iStockPhoto.com. (2024). Stockfoto’s, royalty free beelden en video’s - iStock. [online] Available at: https://www.istockphoto.com/nl [Accessed 6 May 2024].
// Kotlin Help. (2024). Get started with Kotlin | Kotlin. [online] Available at: https://kotlinlang.org/docs/getting-started.html [Accessed 3 Jun. 2024].
// GitHub (2024). GitHub. [online] GitHub. Available at: https://github.com/.








