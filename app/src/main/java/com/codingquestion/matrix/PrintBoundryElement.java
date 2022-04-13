package com.codingquestion.matrix;

public class PrintBoundryElement {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{1, 2, 3,4}, {4, 5, 6,7}, {7, 8, 9,10}};
        printBoundrPattern(mat);
    }

    private static void printBoundrPattern(int[][] mat) {
        // first row
        for (int i = 0; i < mat[0].length; i++)
            System.out.print(mat[0][i] +" ");

        // last column
        for (int i = 1; i < mat.length; i++)
            System.out.print(mat[i][mat[i].length-1]+" ");

        // bottom row
        //System.out.println(mat[0].length +" ");
        for (int i = mat[0].length-2; i>=0; i--)
            System.out.print(mat[mat[0].length-2][i]+" ");

        // first column
        for (int i = mat.length-2; i >0; i--)
            System.out.print(mat[i][0]+" ");
    }
}
