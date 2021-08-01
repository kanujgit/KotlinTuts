package com.kdroid.kotlintuts.geeks.searching;

public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 13, 13};
        System.out.println(findNaiveSolution(arr, 4));
        System.out.println(findBinarySolution(arr, 12));


    }

    private static int findBinarySolution(int[] arr, int x) {
        if (arr[0] == x) return 0;
        else {
            int i = 1;
            while (arr[i] < x)
                i = i * 2;
            if (arr[i] == x) {
                return i;
            }
            return BinarySearch.callRecursiveWay(arr, i / 2, i - 1, x);

        }
    }

    private static int findNaiveSolution(int[] arr, int x) {
        int i = 0;
        while (true) {
            if (arr[i++] == x) {
                return i;
            } else {
                if (arr[i] > x) {
                    return -1;
                }
            }
        }
    }


}
