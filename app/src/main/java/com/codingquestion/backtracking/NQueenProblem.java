package com.codingquestion.backtracking;

public class NQueenProblem {
    static final int N = 4;
    static int board[][] = {{0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}};

    public static void main(String[] args) {
        if (!solveRec(0)) {
            System.out.println("Solution doesn't exists");
        } else {
            System.out.println("Exists");
        }
    }

    private static boolean solveRec(int col) {
        if (col == N) {
            return true;
        }
        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;
                if (solveRec(col + 1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        for (i = row, j = col; j >= 0 && i < N; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }
        return true;
    }

}
