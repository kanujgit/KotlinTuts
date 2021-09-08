package com.codingchallanges.geeks.array;

/**
 * Max diff arr[j]-arr[i] -> j>i
 */
public class MaxDifferenceArray {
    public static void main(String[] args) {
    Integer[] arr = {2, 3, 10, 4, 8, 1};
//        Integer[] arr = {7, 9, 5, 6, 3, 2};
        findDiff(arr, arr.length);
        findDiffOptimal(arr, arr.length);
    }

    /**
     * O(N^2)
     *
     * @param arr
     * @param length
     */
    private static void findDiff(Integer[] arr, int length) {
        int diff;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                diff = arr[j] - arr[i];
                maxDiff = Math.max(maxDiff, diff);
            }
        }
        System.out.println("max diff " + maxDiff);
    }


    private static void findDiffOptimal(Integer[] arr, int length) {
        int res = arr[1] - arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.max(res, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Max diff = " + res);
    }

}
