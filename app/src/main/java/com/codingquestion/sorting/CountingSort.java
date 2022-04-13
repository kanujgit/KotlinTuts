package com.codingquestion.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 4, 1, 0, 0, 1};
        int k = 5;
        naiveSolution(arr, k);
        countingSort(arr, k);
    }

    private static void countingSort(int[] arr, int k) {
        int tmp[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            tmp[arr[i]]++;
        }

        // counting highest no of occurrence
        for (int i = 1; i < k; i++) {
            tmp[i] = tmp[i-1] + tmp[i];
        }

        //calculate output array
        int output[] = new int[arr.length];
        int n =arr.length;
        for (int i = n-1; i >=0; i--) {
            output[tmp[arr[i]]-1] = arr[i];
            tmp[arr[i]]--;
        }

        System.out.println(Arrays.toString(output));

    }

    private static void naiveSolution(int[] arr, int k) {
        int tmp[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            tmp[arr[i]]++;
        }
        int index=0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < tmp[i]; j++) {
                arr[index++] = i;
            }
        }
        System.out.println(Arrays.toString(tmp));
        System.out.println(Arrays.toString(arr));
    }
}
