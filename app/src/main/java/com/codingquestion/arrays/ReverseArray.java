package com.codingquestion.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        reverseArray(arr, arr.length);
    }

    public static void reverseArray(int[] arr, int length) {
        int j = length - 1;
        for (int i = 0; i < length / 2; i++) {
            if (i <= j) {
                swap(arr, i, j);
                j--;
            }
        }
        for (int a :
                arr) {
            System.out.print(a + " ");
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
