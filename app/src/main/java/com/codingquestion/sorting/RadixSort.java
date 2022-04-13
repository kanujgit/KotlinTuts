package com.codingquestion.sorting;

import java.util.Arrays;

// find min element
//start a loop and find counting sort()
public class RadixSort {
    public static void main(String[] s) {
        int arr[] = new int[]{11, 23, 23, 44, 2222};
        int n = arr.length;
        radixSort(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, n, exp);
        }
    }

    private static void countingSort(int[] arr, int n, int exp) {
        System.out.println(Arrays.toString(arr));
        int output[] = new int[n]; // output array
        int count[] = new int[10];     // range by default max char is 10 (0....10)

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] = count[i - 1] + count[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i]/exp)%10] -1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}