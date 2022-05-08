package com.codingquestion.matrix;

import java.util.Arrays;

public class Rotate90Matrix {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{1, 2, 3,4}, {4, 5, 6,7}, {7, 8, 9,10},{10,11,12,13}};
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        System.out.println();
        rotateMatrix(mat);
    }

    public  static void  rotateMatrix(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }

        // REVERSE MATRIX
        for (int i = 0; i < mat.length; i++) {
            int low =0;
            int high = mat[0].length-1;
            while (low<high){
                int tmp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = tmp;

                low++;
                high--;
            }
        }

        System.out.println();
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }

    }

}
