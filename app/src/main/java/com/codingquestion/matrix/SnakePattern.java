package com.codingquestion.matrix;

public class SnakePattern {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printPattern(mat);
    }

    public static void printPattern(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[i].length; j++)
                    System.out.print(mat[i][j] +" ");
            } else {
                for (int j = mat[i].length - 1; j >= 0; j--)
                    System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
