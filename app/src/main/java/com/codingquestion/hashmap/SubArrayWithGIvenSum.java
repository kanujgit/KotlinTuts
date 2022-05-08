package com.codingquestion.hashmap;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGIvenSum {

    public static void main(String[] args) {
        int[] arr = new int[]{5,8,6,13,3,-1};
        int sum = 22;
        fundSubArray(arr,sum);
    }

    private static void fundSubArray(int[] arr,int sum) {
        Set<Integer> set = new HashSet<>();
        int prefixSum = 0;
        int checkSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum+arr[i];
            if(prefixSum == sum){
                System.out.println("Found");
                return;
            }


            checkSum = prefixSum-sum;
            if(set.contains(checkSum)){
                System.out.println("Found Sum");
                return;
            }else {
                set.add(prefixSum);
            }
        }
    }
}
