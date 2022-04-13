package com.codingquestion.sorting;

import java.util.Arrays;

public class SelectionSort1 {
    static int[] arr = {1, 2, 3, 4, 43, 2, 4};

    public static void main(String[] args) {
        //  int[] arr = {1, 2, 3, 4, 43, 2, 4};
        // sortArray(arr, arr.length);
        sortArrayOptimize(arr, arr.length);
    }

    private static void sortArray(int[] arr, int length) {
        int[] tmp = new int[length];
        for (int i = 0; i < length; i++) {
            int minNo = 0;
            for (int j = 1; j < length; j++) {
                if (arr[j] < arr[minNo]) {
                    minNo = j;
                }
            }
            tmp[i] = arr[minNo];
            arr[minNo] = Integer.MAX_VALUE;
        }
        arr = tmp;
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArrayOptimize(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            int minNo = i;
            for (int j = i + 1; j < length; j++)
                if (arr[j] < arr[minNo])
                    minNo = j;


            //swap
            int t = arr[minNo];
            arr[minNo] = arr[i];
            arr[i] = t;
        }

        System.out.println(Arrays.toString(arr));
    }

}
