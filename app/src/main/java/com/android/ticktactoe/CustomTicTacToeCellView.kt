package com.android.ticktactoe

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.kotlintuts.R

class CustomTicTacToeCellView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    fun setCellState(cellState: Char) {
        text = cellState.toString()
    }
    // Set column_background.xml as the background for the column
    fun setColumnBackground() {
        setBackgroundResource(R.color.transparent)
    }
}
