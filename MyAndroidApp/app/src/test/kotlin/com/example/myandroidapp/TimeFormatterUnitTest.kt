package com.example.myandroidapp

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

/**
 * Unit tests for the time formatting logic used in MainActivity.
 * This test focuses on the correctness of SimpleDateFormat given specific Calendar instances.
 */
class TimeFormatterUnitTest {

    @Test
    fun `test time formatting with standard time`() {
        // Given
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 14) // 2 PM
            set(Calendar.MINUTE, 35) // 35 minutes
            set(Calendar.SECOND, 0) // 0 seconds
        }
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

        // When
        val formattedTime = timeFormat.format(calendar.time)

        // Then
        assertEquals("14:35:00", formattedTime)
    }

    @Test
    fun `test time formatting with single digit components`() {
        // Given
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 7) // 7 AM
            set(Calendar.MINUTE, 8) // 8 minutes
            set(Calendar.SECOND, 9) // 9 seconds
        }
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

        // When
        val formattedTime = timeFormat.format(calendar.time)

        // Then
        assertEquals("07:08:09", formattedTime)
    }

    @Test
    fun `test time formatting at midnight`() {
        // Given
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 0) // Midnight
            set(Calendar.MINUTE, 0) // 0 minutes
            set(Calendar.SECOND, 0) // 0 seconds
        }
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

        // When
        val formattedTime = timeFormat.format(calendar.time)

        // Then
        assertEquals("00:00:00", formattedTime)
    }

    @Test
    fun `test time formatting at end of day`() {
        // Given
        val calendar = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 23) // 11 PM
            set(Calendar.MINUTE, 59) // 59 minutes
            set(Calendar.SECOND, 59) // 59 seconds
        }
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

        // When
        val formattedTime = timeFormat.format(calendar.time)

        // Then
        assertEquals("23:59:59", formattedTime)
    }
}
