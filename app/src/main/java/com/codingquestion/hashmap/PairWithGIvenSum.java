package com.codingquestion.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairWithGIvenSum {
    public static void main(String[] args) {
        int arr[] = new int[]{3,2,8,15,-8};
        foundPair(arr,17);
        Map<Integer,Integer> map = new HashMap<>();
    }

    private static void foundPair(int[] arr,int x) {
        Set<Integer> set = new HashSet<>();
        for (Integer i: arr) {
            if(set.contains(x-i)){
                System.out.println(" pair : " + i +" "+(x-i));
                return;
            }else {
                set.add(i);
            }
        }
        System.out.println("No pair found");
    }
}
