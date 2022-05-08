package com.codingquestion.matrix;

public class SearchNumberInSortedMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{10, 20, 30, 40}, {15, 25, 35, 45}, {20, 29, 40, 50}};
        searchTarget(mat, 50);
    }

    private static void searchTarget(int[][] mat, int x) {
        int r = mat.length;
        int c = mat[0].length ;
        int i = 0;
        int j = c - 1;

        while (i < r && j >= 0) {
            if (mat[i][j] == x) {
                System.out.println("found number (" + i + " " + j + ")");
                return;
            } else if (mat[i][j] > x) {//bottom
                j--;
            } else if (mat[i][j] < x) {//left
                i++;
            }
        }
        System.out.println("Not Found");
    }
}
