package com.kdroid.kotlintuts.codingchallanges.leetcode.dscourse;

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
        if (num1 == null || num2 == null || num1.length != n1 + n2) return;
        int i = n1 - 1;
        int j = n2 - 1;
        int t = n1 + n2 - 1;
        while (j >= 0) {
            if(i>=0 && num1[i]>num2[j]){
                num1[t--] = num1[i--];
            }else {
                num1[t--] = num2[j--];
            }
        }
        System.out.println(Arrays.toString(num1));
    }
}
