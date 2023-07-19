package com.android.custumview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.*
import kotlin.math.cos
import kotlin.math.sin

class DialWatchView(context: Context, attrs: AttributeSet?) : View(context, attrs) {

    private val backgroundPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val hourPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val minutePaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val secondPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var hourAngle = 0f
    private var minuteAngle = 0f
    private var secondAngle = 0f

    init {

        backgroundPaint.color = Color.BLUE
        backgroundPaint.style = Paint.Style.FILL

        hourPaint.strokeWidth = 20f
        hourPaint.color = Color.BLACK
        minutePaint.strokeWidth = 10f
        minutePaint.color = Color.GRAY
        secondPaint.strokeWidth = 5f
        secondPaint.color = Color.RED
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val centerX = width / 2f
        val centerY = height / 2f
        val radius = width / 2f - 20f

        canvas.drawCircle(centerX, centerY, radius, backgroundPaint)

        // Draw hour lines
        for (i in 1..12) {
            val angle = i * 30f
            val startX = centerX + (radius - 40f) * sin(angle * Math.PI / 180f).toFloat()
            val startY = centerY - (radius - 40f) * cos(angle * Math.PI / 180f).toFloat()
            val endX = centerX + (radius - 10f) * sin(angle * Math.PI / 180f).toFloat()
            val endY = centerY - (radius - 10f) * cos(angle * Math.PI / 180f).toFloat()
            canvas.drawLine(startX, startY, endX, endY, hourPaint)
        }


        for (i in 1..60) {
            if (i % 5 == 0) continue // Skip hour lines
            val angle = i * 6f
            val startX = centerX + (radius - 20f) * sin(angle * Math.PI / 180f).toFloat()
            val startY = centerY - (radius - 20f) * cos(angle * Math.PI / 180f).toFloat()
            val endX = centerX + (radius - 10f) * sin(angle * Math.PI / 180f).toFloat()
            val endY = centerY - (radius - 10f) * cos(angle * Math.PI / 180f).toFloat()
            canvas.drawLine(startX, startY, endX, endY, minutePaint)
        }


        // Draw hour hand
        val hourX = centerX + radius * 0.5f * sin(hourAngle)
        val hourY = centerY - radius * 0.5f * cos(hourAngle)
        canvas.drawLine(centerX, centerY, hourX, hourY, hourPaint)

        // Draw minute hand
        val minuteX = centerX + radius * 0.7f * sin(minuteAngle)
        val minuteY = centerY - radius * 0.7f * cos(minuteAngle)
        canvas.drawLine(centerX, centerY, minuteX, minuteY, minutePaint)

        // Draw second hand
        val secondX = centerX + radius * sin(secondAngle)
        val secondY = centerY - radius * cos(secondAngle)
        canvas.drawLine(centerX, centerY, secondX, secondY, secondPaint)
    }

    fun startWatch() {
        val timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                val calendar = Calendar.getInstance()
                hourAngle =
                    (calendar.get(Calendar.HOUR) + calendar.get(Calendar.MINUTE) / 60f) * 30f
                minuteAngle = calendar.get(Calendar.MINUTE) * 6f
                secondAngle = calendar.get(Calendar.SECOND) * 6f
                postInvalidate()
            }
        }, 0, 1000)
    }
}
