package com.android.custumview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.*

class AnalogeCustumView constructor(context: Context, attributeSet: AttributeSet) :
    View(context, attributeSet) {

    val paint = Paint()

    init {
        paint.apply {
            color = Color.BLUE
            strokeWidth = 5f
            style = Paint.Style.STROKE
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val width = width
        val height = height
        val radius = (Math.min(width, height) / 2).toFloat()

        // Draw the watch face
        canvas?.drawCircle((width / 2).toFloat(), (height / 2).toFloat(), radius, paint)

        // Draw the hour and minute hands
        drawHourHand(canvas!!, width.toFloat(), height.toFloat(), radius)
        drawMinuteHand(canvas, width.toFloat(), height.toFloat(), radius)
    }


    private fun drawHourHand(canvas: Canvas, width: Float, height: Float, radius: Float) {
        val hour = Calendar.getInstance().get(Calendar.HOUR)
        val degrees = hour / 12.0f * 360.0f

        canvas.save()
        canvas.rotate(degrees, width / 2, height / 2)
        canvas.drawLine(width / 2, height / 2, width / 2, height / 2 - 0.4f * radius, paint)
        canvas.restore()
    }

    private fun drawMinuteHand(canvas: Canvas, width: Float, height: Float, radius: Float) {
        val minute = Calendar.getInstance().get(Calendar.MINUTE)
        val degrees = minute / 60.0f * 360.0f

        canvas.save()
        canvas.rotate(degrees, width / 2, height / 2)
        canvas.drawLine(width / 2, height / 2, width / 2, height / 2 - 0.6f * radius, paint)
        canvas.restore()
    }

}