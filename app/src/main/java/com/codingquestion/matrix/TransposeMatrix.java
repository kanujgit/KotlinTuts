package com.codingquestion.matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][]{{2,9,4}, {20,7,15}, {18,12,19}};
        //transposeMatrix(mat);
        System.out.println(minCost(mat));
    }



    public static int minCost(int[][] costs) {
        if(costs==null||costs.length==0)
            return 0;

        for(int i=1; i<costs.length; i++){
            costs[i][0] += Math.min(costs[i-1][1], costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0], costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0], costs[i-1][1]);
        }

        int m = costs.length-1;
        return Math.min(Math.min(costs[m][0], costs[m][1]), costs[m][2]);
    }

    private static void transposeMatrix(int[][] mat) {
        int tmp[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tmp[i][j] = mat[j][i];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = tmp[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            System.out.print(Arrays.toString(mat[i]));
        }
        System.out.println();


    }
}
