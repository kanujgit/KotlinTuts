package com.kdroid.kotlintuts.leetcode.dscourse;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //System.out.println(checkIfContainDuplicate(arr));
      //  System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicateHasMap(arr));
    }

    private static boolean checkIfContainDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet hm = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(hm.contains(nums[i])){
                return true;
            }else{
                hm.add(nums[i]);
            }
        }
        return false;
    }
    public static boolean containsDuplicateHasMap(int[] nums) {
        HashMap hm = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                return true;
            }else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}
