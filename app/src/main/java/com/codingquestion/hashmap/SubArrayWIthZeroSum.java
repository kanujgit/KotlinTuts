package com.codingquestion.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWIthZeroSum {
    public static void main(String[] args) {
        int[] arr = new int[]{-3,4,-3,-1,1};
        findSubArray(arr);
    }

    private static void findSubArray(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int index=0;
        int prefixSum =0;
        for (Integer i : arr){
             prefixSum = prefixSum+i;
            System.out.println(prefixSum);
            if(map.containsValue(prefixSum)){
                System.out.println("found sub Array with 0 sum");
                break;
            }else {
                map.put(index, prefixSum);
            }

            if(prefixSum ==0){
                System.out.println("Found Sum");
            }
            index++;
        }
        System.out.println(map);
    }
}
