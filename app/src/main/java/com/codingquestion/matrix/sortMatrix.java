package com.codingquestion.matrix;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

public class sortMatrix {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[][] mat = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};

        // sort second index
//        for (int[] i : mat) {
//            System.out.println(Arrays.toString(i));
//        }
//
//        System.out.println();
//
//        Arrays.sort(mat, Comparator.comparingInt(a -> a[1]));
//
//        for (int[] i : mat) {
//            System.out.println(Arrays.toString(i));
//        }

        int[][] mat2 = {{1, 1, 0},
                {1, 0, 0},
                {1, 0, 0}};
        for (int[] j : mat2
        ) {
            Arrays.sort(j);
        }
        for (int[] i : mat2) {
            System.out.println(Arrays.toString(i));
        }


    }
}
