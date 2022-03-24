package com.codingchallanges.geeks.sorting;

import java.util.Arrays;

public class ArrMinDiff {
    public static void main(String[] args) {
        int arr[] = new int[]{101, 33, 44, 55, 2, 22, 11};
        System.out.println(findMinDiff(arr));
    }

    private static int findMinDiff(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (arr.length == 2) {
            return arr[1] - arr[0];
        } else if (arr.length == 1) {
            return -1;
        } else {
            int min = arr[1] - arr[0];
            for (int i = 1; i < arr.length - 1; i++) {
                int minOfNextElement = arr[i + 1] - arr[i];
                if (min >= minOfNextElement) {
                    min = minOfNextElement;
                }
            }
            return min;
        }
    }
}

