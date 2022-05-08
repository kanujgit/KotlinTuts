package com.codingquestion.hashmap;

public class LongestSubArrayGivenSum {
    public static void main(String[] args) {
        int[] arr = new int[]{5,8,-4,-4,9,-2,2};
        int sum =0;
        findLongestSubArray(arr,sum);
    }

    private static void findLongestSubArray(int[] arr,int sum) {
        int maxCnt =0;
        int curr_sum =0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr_sum =0;
            for (int j = i; j < arr.length; j++) {
                curr_sum = curr_sum+arr[j];
                if( curr_sum == sum){
                    maxCnt++;
                    max = Math.max(j-i+1,max);
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
