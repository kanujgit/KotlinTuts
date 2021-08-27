package com.kdroid.kotlintuts.leetcode.dscourse;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {4, 0, 0, 0, 0, 0};
        int[] num2 = {1, 2, 3, 5, 6};
        int n1 = 1;
        int n2 = 5;
        mergeArrays(num1, n1, num2, n2);
    }

    private static void mergeArrays(int[] num1, int n1, int[] num2, int n2) {
        int index;
        for (int i = n1; i < n1 + n2; i++) {
            num1[i] = num2[i - n2];
        }

        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));
    }
}
