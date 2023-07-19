package com.android.custumview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Circle @JvmOverloads constructor(
    context: Context, attributes: AttributeSet, defStyle: Int = 0
) : View(context, attributes, defStyle) {

    private val circlePaint = Paint()

    init {
        circlePaint.color = Color.BLUE
        circlePaint.style = Paint.Style.STROKE
        circlePaint.strokeWidth = 10f
        circlePaint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

//        canvas?.let {
//            val centerX = width / 2
//            val centerY = height / 2
//            val redius = Math.min(centerX, centerY).toFloat()
//            it.drawCircle(centerX.toFloat(), centerY.toFloat(), redius-circlePaint.strokeWidth/2, circlePaint)
//        }
        canvas?.let {
            val width = width
            val height = height
            val size = Math.min(width, height)
//            val centerX = ((size - width) / 2).toFloat()
//            val centerY = ((size - height) / 2).toFloat()
            val centerX = (width/2).toFloat()
            val centerY = (height/2).toFloat()

            val paint = Paint().apply {
                color = Color.BLUE
                strokeWidth = 10f
                style = Paint.Style.FILL_AND_STROKE
            }
            it.drawRect(centerX, centerY, centerX + size, centerY + size, paint)

        }
    }

}