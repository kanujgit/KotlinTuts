package com.codingquestion.arrays.slidingwindows;

public class MaxSumOfKConsecutive {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        maxSum(arr, k);
        slidingWindows(arr, k);
    }

    private static void slidingWindows(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int n = arr.length;
        int windowsSum = sum;
        for (int i = k; i < n; i++) {
            windowsSum = windowsSum + arr[i]- arr[i-k];
            sum = Math.max(sum, windowsSum);

        }
        System.out.println("Windows sliding sum = "+sum);
    }

    private static void maxSum(int[] arr, int k) {
        int sum;
        int maxSum = arr[0];
        for (int i = 0; i < arr.length - k + 1; i++) {
            sum = 0;
            for (int j = 0; j < k; j++) {
                sum = sum + arr[i + j];
            }
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println("Max consecutive sum : " + maxSum);
    }
}
