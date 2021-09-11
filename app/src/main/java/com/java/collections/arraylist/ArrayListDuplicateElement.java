package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicateElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.forEach(System.out::println);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("\n");
        set.forEach(System.out::println);
    }
}
