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

        val screenTimes = intent.getIntArrayExtra("screenTimes") ?: IntArray(7)// (IIE,2024)
        val detailsTextView: TextView = findViewById(R.id.detailsTextView)// (IIE,2024)
        val averageTextView: TextView = findViewById(R.id.averageTextView)// (IIE,2024)
        val backButton: Button = findViewById(R.id.backButton)// (IIE,2024)

        val detailsText = StringBuilder()// (IIE,2024)
        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        var total = 0// (IIE,2024)

        for (i in screenTimes.indices) {
            detailsText.append("${days[i]}: ${screenTimes[i]} Temperature\n")// (IIE,2024)
            total += screenTimes[i]// (IIE,2024)
        }

        val average = total / 7.0// (IIE,2024)
        detailsTextView.text = detailsText.toString()// (IIE,2024)
        averageTextView.text = "Average Weather : $average Temperature"// (IIE,2024)

        backButton.setOnClickListener {
            finish()// (IIE,2024)
        }
    }
}
// REFERENCE LIST

// The IIE, 2024. Introduction to Mobile Application Development [IMAD5112/d/p/w]. The Independent Institution of Education: Unpublished [Accessed 3 may 2024].
// Pixabay (2024). Pixabay. [online] Pixabay.com. Available at: https://pixabay.com/.
// iStockPhoto.com. (2024). Stockfoto’s, royalty free beelden en video’s - iStock. [online] Available at: https://www.istockphoto.com/nl [Accessed 6 May 2024].
// Kotlin Help. (2024). Get started with Kotlin | Kotlin. [online] Available at: https://kotlinlang.org/docs/getting-started.html [Accessed 3 Jun. 2024].
// GitHub (2024). GitHub. [online] GitHub. Available at: https://github.com/.





