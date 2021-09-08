package com.kdroid.kotlintuts.codingchallanges.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        // System.out.println(Arrays.toString(twoSum(arr, target)));
         System.out.println(Arrays.toString(twoSumOptimal(arr, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                } else if (nums[i] + nums[j] > target) {
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] twoSumOptimal(int[] arr, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int curSum = arr[0]+arr[1];
            if (curSum> target) {
                right--;
            } else if (curSum < target) {
                left++;
            } else {
                res[0] = left;
                res[1] = right;
                return res;
            }
        }
        return res;
    }
}
