package com.codingquestion.backtracking;

public class RatMazeProblem {
    static int N;

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};

        N = maze.length;
        solveMaze(maze, N);
    }

    private static boolean solveMaze(int[][] maze, int n) {
        int[][] solv = new int[n][n];
        if (!solveMazeRec(maze, 0, 0, solv)) {
            System.out.println("solution doesn't exist");
            return false;
        }
        printSolution(solv);
        return true;
    }

    private static void printSolution(int[][] solv) {
        for ( int [] arr: solv) {
            for (int i: arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static boolean solveMazeRec(int[][] maze, int i, int j, int[][] solv) {
        if (i == N - 1 && j == N - 1 && maze[i][j] == 1) {
            solv[i][j] = 1;
            return true;
        }
        if (isSafe(maze, i, j)) {
            solv[i][j] = 1;

            if (solveMazeRec(maze, i + 1, j, solv))
                return true;
            if (solveMazeRec(maze, i, j + 1, solv))
                return true;

            solv[i][j] = 0;
        }
        return false;
    }

    private static boolean isSafe(int[][] maze, int i, int j) {
        return (i < N && j < N && maze[i][j] == 1);
    }
}
