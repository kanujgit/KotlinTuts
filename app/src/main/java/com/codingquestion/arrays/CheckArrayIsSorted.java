package com.codingquestion.arrays;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3};
        checkArrayIsSorted(arr, arr.length);
    }

    private static void checkArrayIsSorted(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}
