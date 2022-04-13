package com.codingquestion.arrays;

import java.util.HashMap;

public class FrequencyOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 25, 30, 30};
        countFrequencies(arr);
    }

    private static void countFrequencies(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i], 1);
//            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }
}
