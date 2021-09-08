package com.kdroid.kotlintuts.codingchallanges.geeks.array;

public class TappingRainWaterSolutions {
    public static void main(String[] args) {
        int[] arr = {5, 0, 6, 2, 3};
        // int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        naiveSolutions(arr, arr.length);
        efficientSolutions(arr, arr.length);
    }

    private static void efficientSolutions(int[] arr, int length) {
        int[] leftMax = new int[length];
        int[] rightMax = new int[length];

        leftMax[0] = arr[0];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        rightMax[length-1] =arr[length-1];
        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        UtilsClass.printArray(rightMax);
        System.out.println();
        UtilsClass.printArray(leftMax);

        int res = 0;
        for (int i = 1; i < length - 1; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        System.out.println(" save water : " + res);
    }


    /**
     * O(n~2)
     *
     * @param arr
     * @param n
     */
    private static void naiveSolutions(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int left = arr[0];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[i]);
            }

            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
            res += Math.min(left, right) - arr[i];
        }
        System.out.println(" total saved water : " + res);
    }


}
