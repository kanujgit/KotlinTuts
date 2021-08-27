package com.kdroid.kotlintuts.leetcode.dscourse;

public class MaximumSubarray {
    public static void main(String[] args) {
        int num[]  = {-1,-1};
        System.out.println(findLargestSum(num));
    }

    private static int findLargestSum(int[] num) {
        int sum = Integer.MIN_VALUE;
        int lastSum = 0;
        for (int i = 0; i < num.length; i++) {
            lastSum = lastSum+num[i];
            if(sum<lastSum){
                sum =lastSum;
            }
            if(lastSum<0){
                lastSum =0;
            }
        }
        return sum;
    }
}
