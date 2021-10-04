package com.codingchallanges.geeks.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 23, 2, 3, 4, 5};
        insertionSort(arr, arr.length);
    }

    private static void insertionSort(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));

    }
}
