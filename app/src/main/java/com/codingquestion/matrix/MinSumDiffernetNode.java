package com.codingquestion.matrix;

public class MinSumDiffernetNode {
    public static void main(String[] args) {
        int[][] mat = {{2,9,4}, {2,7, 15}, {18,12,19}};

        for (int i = 0; i < mat.length; i++) {
            int jFLoag =-1;
            int min =Integer.MAX_VALUE;
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]<min){
                    if(jFLoag == j && jFLoag !=-1) {
                        continue;
                    }
                        if (jFLoag == -1 || jFLoag != j) {
                            min = mat[i][j];
                            jFLoag = j;
                        }

                    System.out.print("min number:  "+min);
                }
            }
            System.out.println();
        }



    }

}
