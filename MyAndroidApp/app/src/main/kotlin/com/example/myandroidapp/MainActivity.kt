package com.example.myandroidapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {

    private lateinit var timeTextView: TextView
    private lateinit var handler: Handler
    private lateinit var updateTimeRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timeTextView = findViewById(R.id.timeTextView)

        handler = Handler(Looper.getMainLooper())

        updateTimeRunnable = object : Runnable {
            override fun run() {
                val currentTime = Calendar.getInstance().time
                val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
                val formattedTime = timeFormat.format(currentTime)
                timeTextView.text = "Current Time: $formattedTime"

                handler.postDelayed(this, 1000)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        // Resume updates when the activity becomes visible
        handler.post(updateTimeRunnable)
    }

    override fun onStop() {
        super.onStop()
        // Pause updates when the activity is no longer visible
        handler.removeCallbacks(updateTimeRunnable)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Ensure callbacks are removed if the activity is destroyed
        handler.removeCallbacks(updateTimeRunnable)
    }
}