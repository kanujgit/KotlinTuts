package com.android.custumview

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.kotlintuts.R

class ShapeSelectorView constructor(
    context: Context, attributeSet: AttributeSet
) : View(context, attributeSet) {

    private var shapeColor = 0
    private var displayShapeName = false

    // drawing a shape
    private var shapeWidth: Int = 100
    private val shapeHeight = 100
    private var textXOffset = 0
    private val textYOffset = 30
    private var paintShape: Paint = Paint()

    //toggling the shape
    private var shapeValues: Array<String> = arrayOf("square", "circle", "triangle")
    private var currentShapeIndex = 0
    private var trianglePath: Path = Path()


    init {
        setupAttributes(attributeSet)
        setUpPaint()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val shapeSelected = shapeValues[currentShapeIndex]

        when (shapeSelected) {
            "square" -> {
                canvas.apply {
                    drawRect(0f, 0f, shapeWidth.toFloat(), shapeHeight.toFloat(), paintShape)
                    textXOffset = 0
                }
            }
            "circle" -> {
                canvas.apply {
                    drawCircle(
                        (shapeWidth / 2).toFloat(),
                        (shapeHeight / 2).toFloat(),
                        (shapeWidth / 2).toFloat(),
                        paintShape
                    )
                    textXOffset = 12
                }
            }
            "triangle" -> {
                canvas.apply {
                    drawPath(
                        getTrianglePath(), paintShape
                    )
                    textXOffset = 12
                }
            }
        }
        canvas.apply {
            if (displayShapeName) drawText(
                "Square",
                (0 + textXOffset).toFloat(),
                (shapeHeight + textYOffset).toFloat(),
                paintShape
            )
        }
    }

    private fun getTrianglePath(): Path {
//        return trianglePath.apply {
//            moveTo(0f, shapeHeight.toFloat())
//            lineTo(shapeWidth.toFloat(), shapeHeight.toFloat())
//            lineTo((shapeWidth / 2).toFloat(), 0f)
//        }

        trianglePath.moveTo(0f, shapeHeight.toFloat())
        trianglePath.lineTo(shapeWidth.toFloat(), shapeHeight.toFloat())
        trianglePath.lineTo((shapeWidth / 2).toFloat(), 0f)
        return trianglePath
    }


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val textPadding = 10
        val contentWidth = shapeWidth

        // Resolve the width based on our minimum and the measure spec
        val minw = contentWidth + paddingLeft + paddingRight
        val w = resolveSizeAndState(minw, widthMeasureSpec, 0)

        var minH = shapeHeight + paddingBottom + paddingTop
        if (displayShapeName) minH += textXOffset + textPadding
        val h = resolveSizeAndState(minH, heightMeasureSpec, 0)

        setMeasuredDimension(w, h);
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val result = super.onTouchEvent(event)
        Log.d("TAG", "onTouchEvent() called with: event = $event")
        if (event?.action == MotionEvent.ACTION_DOWN) {
            currentShapeIndex = (currentShapeIndex++) % shapeValues.size
            postInvalidate();
            return true
        }
        return result
    }

    private fun setUpPaint() {
        paintShape.apply {
            style = Paint.Style.FILL
            color = shapeColor
            textSize = 30f
        }


    }

    private fun setupAttributes(attrs: AttributeSet) {
        val typedArray: TypedArray =
            context.theme.obtainStyledAttributes(attrs, R.styleable.ShapeSelectorView, 0, 0)
        try {
            shapeColor = typedArray.getColor(R.styleable.ShapeSelectorView_shapeColor, Color.BLACK)
            displayShapeName =
                typedArray.getBoolean(R.styleable.ShapeSelectorView_displayShapeName, false)
        } finally {
            typedArray.recycle()
        }
    }


    // add property method
    open fun isDisplayingShapeName(): Boolean {
        return displayShapeName
    }

    fun setDisplayingShapeName(state: Boolean) {
        displayShapeName = state
        invalidate()
        requestLayout()
    }

    fun getShapeColor(): Int {
        return shapeColor
    }

    fun setShapeColor(color: Int) {
        shapeColor = color
        invalidate()
        requestLayout()
    }
    fun getSelectedShape(): String {
        return shapeValues[currentShapeIndex]
    }

}