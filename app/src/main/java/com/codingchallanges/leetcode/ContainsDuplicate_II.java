package com.codingchallanges.leetcode;

import java.util.HashSet;

/**
 * Given an integer array nums and two integers k and t,
 * return true if there are two distinct indices i and j in the array such that
 * abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.
 * <p>
 * Input: nums = [1,2,3,1], k = 3, t = 0
 * Output: true
 * <p>
 * Input: nums = [1,5,9,1,5,9], k = 2, t = 3
 * Output: false
 *
 * Input:[1,0,1,1], k =1, t =2
 * Output:false
 *
 */
public class ContainsDuplicate_II {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1};
        int k = 1;
        int t = 2;
        System.out.println(checkDuplicate(arr, k, t));
       // binarySearch();
    }

    private static boolean checkDuplicate(int[] arr, int k, int t) {
        HashSet<Integer> set = new HashSet<>();
        int index = -1;
        boolean flag =false;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                index = getMatchedElemetntIndex(set, arr[i],arr);
                System.out.println(index);
                if(!(Math.abs(arr[i] - arr[index]) <= t  && Math.abs(i - index) <= k)){
                    flag =false;
                    return flag;
                }else {
                    flag  =true;
                }
                continue;

            } else {
                set.add(arr[i]);
            }
        }
        return flag;
    }


    private static int getMatchedElemetntIndex(HashSet<Integer> set, int element,int[]arr) {
        for (int i = 0; i < set.size(); i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private static void binarySearch(){
        int arr[] = {1,2,3,4,5,6};
        int searchIndex = 6;
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == searchIndex){
                System.out.println(mid);
                break;
            }else if(arr[mid]>searchIndex){
                end = mid-1;
            }else if(arr[mid]<searchIndex){
                start = mid+1;
            }
        }
     }
}
