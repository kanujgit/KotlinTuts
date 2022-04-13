package com.codingquestion.matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{1, 2, 3,4}, {4, 5, 6,7}, {7, 8, 9,10}};
        transposeMatrix(mat);
    }

    private static void transposeMatrix(int[][] mat) {
        int tmp[][] = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tmp[i][j] = mat[i][j];
            }
        }
        System.out.println(Arrays.toString(tmp));
        System.out.println(Arrays.toString(mat));
    }
}
