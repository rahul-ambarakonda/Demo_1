package com.example.myandroidapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // Changed from ComponentActivity
import android.widget.TextView // Import TextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the XML layout

        val timeTextView: TextView = findViewById(R.id.timeTextView)

        // Get current system time
        val currentTime = Calendar.getInstance().time

        // Format the time (e.g., HH:mm:ss)
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        val formattedTime = timeFormat.format(currentTime)

        // Set the formatted time to the TextView
        timeTextView.text = "Current Time: $formattedTime"
    }
}
