package com.android.ticktactoe

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TicTacToeViewModelFactory(private val boardSize: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TicTacToeViewModel::class.java)) {
            return TicTacToeViewModel(boardSize) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
