package com.kdroid.kotlintuts.geeks.array;

public class MoveZeroEnd {
    public static void main(String[] args) {
        int[] arr = {0};
        //  moveZeroByNaive(arr, arr.length);
        printLinearTimeSolution(arr, arr.length);
    }

    /**
     * O(N~2)
     *
     * @param arr
     * @param length
     */
    private static void moveZeroByNaive(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < length; j++) {
                    if (arr[j] != 0) {
                        swap(arr, j, i);
                    }
                }
            }
        }
        UtilsClass.printArray(arr);
    }

    public static void printLinearTimeSolution(int arr[], int len) {
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                swap(arr, count, i);
                count++;
            }
        }
        UtilsClass.printArray(arr);

    }

    private static void swap(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;

    }
}
