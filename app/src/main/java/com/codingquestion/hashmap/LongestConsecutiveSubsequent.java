package com.codingquestion.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequent {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,45,4,3,23};
        findLongest(arr);
        findLongestHash(arr);
    }

    private static void findLongestHash(int[] arr) {
        int res =1;
        Set<Integer> set = new HashSet<>();
        for (Integer x : arr)
            set.add(x);

        for (Integer x : arr){
            if(set.contains(x-1) == false){
                int curr =1;
                while (set.contains(x+curr)){
                    curr++;
                }
                res = Math.max(res,curr);
            }
        }
        System.out.println(res);
    }


    //naive
    private static void findLongest(int[] arr) {
        Arrays.sort(arr);
        int count =0;
        int res = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] == arr[i-1]+1){
                count++;
            }else if(arr[i] != arr[i-1]) {
                res = Math.max(res,count);
                count =1;
            }
        }

        int max = Math.max(res,count);
        System.out.println(res);
    }
}
