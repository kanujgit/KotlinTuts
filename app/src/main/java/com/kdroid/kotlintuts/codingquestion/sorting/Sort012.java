package com.kdroid.kotlintuts.codingquestion.sorting;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 1, 0, 0, 2, 2};
        //int[] arr = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
        sortNumber(arr, arr.length);
    }

    private static void sortNumber(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int end = n - 1;
        while (mid <= end) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr, mid, end);
                end--;
            }
        }
        for (int i : arr
        ) {
            System.out.println(i);
        }
        System.out.println("low :" + low + " mid: " + mid + " end: " + end);
    }

    private static void swap(int[] arr, int i1, int i2) {

        arr[i1] = arr[i1] + arr[i2];
        arr[i2] = arr[i1] - arr[i2];
        arr[i1] = arr[i1] - arr[i2];

//        int tmp = arr[i1];
//        arr[i1] = arr[i2];
//        arr[i2] = tmp;

    }
}
