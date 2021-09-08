package com.codingquestion.sorting;

public class Sort0and1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1};
        swappingMethods(arr);

    }

    private static void swappingMethods(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1) {
//                int tmm = arr[start];
//                arr[start] = arr[end];
//                arr[end] =tmm;
                arr[end] = arr[end] + arr[start];
                arr[start] = arr[end] - arr[start];
                arr[end] = arr[end] - arr[start];
                end--;
            } else {
                start++;
            }
        }
        for (int a : arr
        ) {
            System.out.println(a);
        }
    }
}

