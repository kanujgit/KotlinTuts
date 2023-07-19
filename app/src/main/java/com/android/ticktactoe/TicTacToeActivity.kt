package com.android.ticktactoe

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.kotlintuts.R

class TicTacToeActivity : AppCompatActivity() {
    lateinit var viewModel: TicTacToeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val boardSize = 5
        viewModel = ViewModelProvider(
            this, TicTacToeViewModelFactory(boardSize)
        ).get(TicTacToeViewModel::class.java)


        val gridLayout: GridLayout = findViewById(R.id.gridLayout)
        gridLayout.apply {
            rowCount = boardSize
            columnCount = boardSize
        }


        // Set up click listeners for Tic Tac Toe cells to handle user input
        for (row in 0 until boardSize) {
            for (col in 0 until boardSize) {
                val cellView = CustomTicTacToeCellView(this)
                cellView.layoutParams = ViewGroup.LayoutParams(400, 400)
                cellView.setOnClickListener { viewModel.onCellClicked(row, col) }
                // Set column background for the appropriate cells
                cellView.background = resources.getDrawable(R.drawable.grid_border_background, null)
                gridLayout.addView(cellView)
            }
        }

        viewModel.boardLiveData.observe(this) { board ->
            // Update the UI to reflect the current state of the Tic Tac Toe board
            for (row in 0 until boardSize) {
                for (col in 0 until boardSize) {
                    val cellState = board[row][col].state
                    // Assuming you have custom Tic Tac Toe cell views
                    val cellView =
                        gridLayout.getChildAt(row * boardSize + col) as CustomTicTacToeCellView
                    cellView.textSize = 40f
                    cellView.gravity = Gravity.CENTER
                    cellView.setCellState(cellState)
                }
            }
        }

        viewModel.currentPlayerLiveData.observe(this) { currentPlayer ->
            // Update the UI to display the current player (X or O).
            findViewById<TextView>(R.id.currentPlayerTextView).setText(
                getString(
                    R.string.current_player, currentPlayer
                )
            )
        }


        viewModel.gameStateLiveData.observe(this, Observer { gameState ->
            when (gameState) {
//                is TicTacToeViewModel.GameState.InProgress -> {
////                    updateBoard(gameState.board)
////                    updateCurrentPlayer(gameState.currentPlayer)
//                }
                is TicTacToeViewModel.GameState.Winner -> {
                    showWinnerDialog("Player ${gameState.winner} wins!")
                    viewModel.resetGame()
                }
                TicTacToeViewModel.GameState.Draw -> {
                    showWinnerDialog("Match is draw")
                    viewModel.resetGame()
                }
            }
        })
    }

    private fun showWinnerDialog(winner: String?) {
        val dialog = AlertDialog.Builder(this).setTitle(R.string.game_over).setMessage(
            winner
        ).setPositiveButton(R.string.reset) { _, _ -> viewModel.resetGame() }.setCancelable(false)
            .create()

        dialog.show()
    }

    companion object {
        const val EXTRA_BOARD_SIZE = "EXTRA_BOARD_SIZE"
    }
}