package com.android.ticktactoe

// Cell.kt
data class Cell(var state: Char = ' ') {
    fun isEmpty(): Boolean = state == ' '
}
