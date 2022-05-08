package com.codingquestion.hashmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int a[] = new int[]{10,10,10};
        int b[] = new int[]{10,10,10};
        int c[] = new int[]{0};
        intersectionsEfficent(a,b);
    }


    private static void intersections(int[] a, int[] b) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set  = new HashSet<>();
        for (Integer i: a) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Integer i: b) {
            if(map.containsKey(i)){
                set.add(i);
            }
        }
        System.out.println(set);
    }

    private static void intersectionsEfficent(int[] a, int[] b) {
        Set<Integer> set  = new HashSet<>();
        int count =0;

        for (Integer i: a) {
            set.add(i);
        }
        for (Integer i: b) {
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        System.out.println(set +" "+count);
    }
}
