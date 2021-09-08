package com.codingchallanges.geeks.recursion;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3};
        int sum = 1;
        System.out.println(findSubSetSum(arr, 3, sum));
    }

    private static int findSubSetSum(int[] num, int n, int sum) {
        if (n == 0) {
            return (sum==0)?1:0;
        } else {
            return findSubSetSum(num, n - 1, sum) + findSubSetSum(num, n - 1, sum - num[n - 1]);
        }

    }
}
