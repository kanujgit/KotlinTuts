package com.kdroid.kotlintuts.codingchallanges.geeks.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 1, 2, 3, 10, 5};
//        int[] arr = {8,5,10,20};
        bubbleSort(arr);
        bubbleSortOptimize(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortOptimize(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
