package com.codingquestion.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDistnictElement {
    public static void main(String[] args) {
        int[] arr ={15,12,12,13,12,18};
        //countDistinct(arr);
        countDistinctSort(arr);
    }

    private static void countDistinct(int[] arr) {
        Set set = new HashSet();
        for (Integer i: arr) {
            set.add(i);
        }
        System.out.println(set.size());
    }

    private static void countDistinctSort(int[] arr) {
        List<Integer> integers = Arrays.stream(arr).boxed().map(Integer::new).collect(Collectors.toList());
        Set<Integer> set = new HashSet(integers);
        System.out.println(set.size()+" "+set);

        // traverse array
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for (Integer  s: set
             ) {
            System.out.print(s + "");
        }
    }
}
