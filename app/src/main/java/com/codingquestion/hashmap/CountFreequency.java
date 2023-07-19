package com.codingquestion.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountFreequency {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2,2,3,3,5,4,4,4,};
        countFreeq(arr);
    }

    private static void countFreeq(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        for (Integer i: arr) {
            map1.put(i,map1.getOrDefault(i,0)+1);
        }

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            System.out.println(m.getKey() +" :: "+m.getValue());
        }
        System.out.println(map);
        System.out.println(map1);
    }
}
