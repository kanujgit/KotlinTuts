package com.android.ticktactoe

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TicTacToeViewModel(val boardSize: Int) : ViewModel() {

    private var board: Array<Array<Cell>> = Array(boardSize) { Array(boardSize) { Cell() } }
    private var currentPlayer: Char = 'X'
    private var winner: Char? = null

    sealed class GameState {
        //data class InProgress(val board: Array<Array<Cell>>, val currentPlayer: Char) : GameState()
        data class Winner(val winner: Char) : GameState()
        object Draw : GameState()
    }


    // Expose LiveData properties for observing the game state
    private val _boardLiveData: MutableLiveData<Array<Array<Cell>>> = MutableLiveData()
    val boardLiveData: LiveData<Array<Array<Cell>>> get() = _boardLiveData


    private val _currentPlayerLiveData: MutableLiveData<Char> = MutableLiveData()
    val currentPlayerLiveData: LiveData<Char> get() = _currentPlayerLiveData


    // Expose LiveData property for observing the game state
    private val _gameStateLiveData: MutableLiveData<GameState> = MutableLiveData()
    val gameStateLiveData: LiveData<GameState> get() = _gameStateLiveData


    init {
        resetGame()
    }

    private fun switchPlayer() {
        currentPlayer = if (currentPlayer == 'X') 'O' else 'X'
        _currentPlayerLiveData.value = currentPlayer
    }

    private fun checkForWin(row: Int, col: Int) {
        // Check for a win in the current row, column, and diagonals around the selected cell.
        if (checkRow(row) || checkColumn(col) || checkDiagonal() || checkAntiDiagonal()) {
            winner = currentPlayer
            _gameStateLiveData.value = GameState.Winner(winner!!)

        } else if (isBoardFull()) {
            // If no winner is found and the board is full, it's a draw
            winner = null
            _gameStateLiveData.value = GameState.Draw

        }
    }

    private fun isBoardFull(): Boolean {
        for (row in 0 until boardSize) {
            for (col in 0 until boardSize) {
                if (board[row][col].isEmpty()) {
                    return false
                }
            }
        }
        return true
    }

    private fun checkRow(row: Int): Boolean {
        return (0 until boardSize).all { col -> board[row][col].state == currentPlayer }
    }

    private fun checkColumn(col: Int): Boolean {
        return (0 until boardSize).all { row -> board[row][col].state == currentPlayer }
    }

    private fun checkDiagonal(): Boolean {
        return (0 until boardSize).all { i -> board[i][i].state == currentPlayer }
    }

    private fun checkAntiDiagonal(): Boolean {
        return (0 until boardSize).all { i -> board[i][boardSize - 1 - i].state == currentPlayer }
    }

    fun resetGame() {
        board = Array(boardSize) { Array(boardSize) { Cell() } }
        currentPlayer = 'X'
        winner = null
        _boardLiveData.value = board
        _currentPlayerLiveData.value = currentPlayer
    }


    fun onCellClicked(row: Int, col: Int) {
        if (board[row][col].isEmpty() && winner == null) {
            board[row][col].state = currentPlayer
            _boardLiveData.value = board
            checkForWin(row, col)
            switchPlayer()
        }
    }
}