package com.java.cloning;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        List<Integer> list1;
        list1 = list;
        list1 = null;
        System.out.println(list);
        System.out.println(list1);
    }
}
