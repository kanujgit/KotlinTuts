package com.codingchallanges.leetcode.dscourse;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection. Each element in the result must appear as many times as it
 * shows in both arrays and you may return the result in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */
public class IntersectionArrayII {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5, 9};
        int[] arr2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    /*public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);

    }*/
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        Set<Integer> set = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                set.add(nums1[i++]);
                j++;
            }
        }
        System.out.println(set);
        nums1 = new int[set.size()];
        k = 0;
        for (int l = 0; l < set.size(); l++) {

        }
        for (Integer num : set
        ) {
            nums1[k++] = num;
        }
        return nums1;

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int[] intersectHashMap(int[] nums1, int[] nums2) {

        List<Integer> list = new LinkedList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        }

        for (Integer i : map1.keySet()){
            if(map2.containsKey(i)) {
                int min = (Math.min(map1.get(i), map2.get(i)));
                while (min-->0) {
                    list.add(i);
                }
            }

        }
        return list.stream().mapToInt(i->i).toArray();
    }


}
