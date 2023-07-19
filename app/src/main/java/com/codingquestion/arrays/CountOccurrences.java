package com.codingquestion.arrays;

import java.util.HashMap;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 2, 2, 2, 2, 0, 0, 6, 0, 0, 0, 5, 5, 5, 5};
        int n = arr.length;
        calculateOccurrenceByHashMap(arr, n);
    }

    private static void calculateOccurrenceByHashMap(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i], 1);
//            }

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }

}
