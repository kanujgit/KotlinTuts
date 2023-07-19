package com.android.custumview

import android.content.Context
import android.content.res.TypedArray
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import com.kotlintuts.R


class CircleImageView constructor(context: Context, attributes: AttributeSet) :
    androidx.appcompat.widget.AppCompatImageView(context, attributes) {

    private val DEF_PRESS_HIGHLIGHT_COLOR = 0x32000000
    private var mBitmapShader: Shader? = null
    private var mShaderMatrix: Matrix? = null

    private var mBitmapDrawBounds: RectF = RectF()
    private var mStrokeBounds: RectF = RectF()

    private var mBitmap: Bitmap? = null

    private var mBitmapPaint: Paint = Paint()
    private var mStrokePaint: Paint = Paint()
    private var mPressedPaint: Paint = Paint()

    private var mInitialized = false
    private var mPressed = false
    private var mHighlightEnable = false

    var strokeColor: Int = Color.TRANSPARENT
    var strokeWidth = 0f
    var highlightEnable = true
    var highlightColor = DEF_PRESS_HIGHLIGHT_COLOR


    init {
        setUpAttributes(attributes)
        setUpPain()
        setupBitmap()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        drawBitmap(canvas)
        drawStroke(canvas)
        drawHighlight(canvas)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        var processed = false
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (!isInCircle(event.x, event.y)) {
                    return false
                }
                processed = true
                mPressed = true
                invalidate()
            }
            MotionEvent.ACTION_CANCEL, MotionEvent.ACTION_UP -> {
                processed = true
                mPressed = false
                invalidate()
                if (!isInCircle(event.x, event.y)) {
                    return false
                }
            }
        }
        return super.onTouchEvent(event) || processed
    }

    private fun isInCircle(x: Float, y: Float): Boolean {
        // find the distance between center of the view and x,y point
        val distance = Math.sqrt(
            Math.pow(
                (mBitmapDrawBounds.centerX() - x).toDouble(), 2.0
            ) + Math.pow((mBitmapDrawBounds.centerY() - y).toDouble(), 2.0)
        )
        return distance <= mBitmapDrawBounds.width() / 2
    }

    private fun drawHighlight(canvas: Canvas) {
        if (highlightEnable && mPressed) canvas.drawOval(mBitmapDrawBounds, mPressedPaint)
    }

    private fun drawBitmap(canvas: Canvas) {
        // we draw an oval shape using draw bounds that we have set to always square
        // and it would draw a circle in it
        // also the bitmap paint is set with the bitmap shader so the color
        // of the shape is the bitmap itself
        canvas.drawOval(mBitmapDrawBounds, mBitmapPaint)
    }

    private fun drawStroke(canvas: Canvas) {
        if (mStrokePaint.strokeWidth > 0f) {
            canvas.drawOval(mStrokeBounds, mStrokePaint);
        }
    }


    private fun setupBitmap() {
        if (!mInitialized) return

        mBitmap = getBitmapFromDrawable(drawable)
        if (mBitmap == null) return

        mBitmapShader = BitmapShader(mBitmap!!, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP)
        mBitmapPaint.shader = mBitmapShader

        updateBitmapSize()
    }

    private fun updateBitmapSize() {
        if (mBitmap == null) return
        val dx: Float
        val dy: Float
        val scale: Float

        // scale up/down with respect to this view size and maintain aspect ratio
        // translate bitmap position with dx/dy to the center of the image
        if (mBitmap!!.width < mBitmap!!.height) {
            scale = mBitmapDrawBounds.width() / mBitmap!!.width.toFloat()
            dx = mBitmapDrawBounds.left
            dy =
                mBitmapDrawBounds.top - mBitmap!!.height * scale / 2f + mBitmapDrawBounds.width() / 2f
        } else {
            scale = mBitmapDrawBounds.height() / mBitmap!!.height.toFloat()
            dx =
                mBitmapDrawBounds.left - mBitmap!!.width * scale / 2f + mBitmapDrawBounds.width() / 2f
            dy = mBitmapDrawBounds.top
        }
        mShaderMatrix!!.setScale(scale, scale)
        mShaderMatrix!!.postTranslate(dx, dy)
        mBitmapShader!!.setLocalMatrix(mShaderMatrix)
    }


    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updateCircleDrawBounds(mBitmapDrawBounds)

    }

    private fun updateCircleDrawBounds(bounds: RectF) {
        val contentWidth = (width - paddingLeft - paddingRight).toFloat()
        val contentHeight = (height - paddingTop - paddingBottom).toFloat()

        var left = paddingLeft.toFloat()
        var top = paddingTop.toFloat()

        // we'll center bounds by translating left/top
        // so that the rendered circle always in the center of view
        if (contentWidth > contentHeight) {
            left += (contentWidth - contentHeight) / 2f
        } else {
            top += (contentHeight - contentWidth) / 2f
        }

        // we want to make this bounds always square (aspect ratio of 1:1)
        val diameter = Math.min(contentWidth, contentHeight).toFloat()
        bounds.set(left, top, left + diameter, top + diameter)

    }

    private fun setUpPain() {
        mShaderMatrix = Matrix()

        mBitmapPaint = Paint(Paint.ANTI_ALIAS_FLAG)

        mPressedPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = highlightColor
            style = Paint.Style.FILL
        }

        mStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = strokeColor
            style = Paint.Style.STROKE
            strokeWidth = strokeWidth
        }

        mHighlightEnable = highlightEnable
        mInitialized = true

    }

    private fun setUpAttributes(attrs: AttributeSet) {

        val a: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.CircleImageView, 0, 0)
        strokeColor = a.getColor(R.styleable.CircleImageView_strokeColor, Color.TRANSPARENT)
        strokeWidth = a.getDimension(R.styleable.CircleImageView_strokeWidth, 0f)
        highlightEnable = a.getBoolean(R.styleable.CircleImageView_highlightEnable, false)
        highlightColor =
            a.getColor(R.styleable.CircleImageView_highlightColor, DEF_PRESS_HIGHLIGHT_COLOR)
        a.recycle()
    }


    private fun getBitmapFromDrawable(drawable: Drawable?): Bitmap? {
        if (drawable == null) return null

        if (drawable is BitmapDrawable) {
            return drawable.bitmap
        }

        val bitmap = Bitmap.createBitmap(
            drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, canvas.width, canvas.height)
        drawable.draw(canvas)
        return bitmap
    }


}