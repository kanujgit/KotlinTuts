package com.codingquestion.matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralMatrix(mat);
    }

    private static void spiralMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int top = 0;
        int left = 0;
        int bottom = r - 1;
        int right = c - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(mat[left][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(mat[i][right] + " ");
            right--;

            if(top<=bottom){
                for (int i = right; i >=left; i--)
                    System.out.print(mat[bottom][i]+" ");
                bottom--;
            }
            if(left<=right){
                for (int i = bottom; i >=top ; i--)
                    System.out.print(mat[i][left]+" ");
                left++;
            }
        }
    }
}
