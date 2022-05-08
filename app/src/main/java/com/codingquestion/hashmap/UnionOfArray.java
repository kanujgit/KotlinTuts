package com.codingquestion.hashmap;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {
    public static void main(String[] args) {
        int a[] = new int[]{5,20,5,15};
        int b[] = new int[]{15,15,15,20,10};
        union(a,b);
    }

    private static void union(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (Integer i: a) {
            set.add(i);
        }
        for (Integer i: b) {
            set.add(i);
        }
        System.out.println(set +" size "+ set.size());
    }
}
