package com.kdroid.kotlintuts.codingchallanges.geeks.array;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        checkArrayIsSorted(arr, arr.length);
    }

    private static void checkArrayIsSorted(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return;
            }else if(arr[i] ==arr[i+1]) {
                continue;
            }
        }
        System.out.println("Array is sorted");
    }
}
