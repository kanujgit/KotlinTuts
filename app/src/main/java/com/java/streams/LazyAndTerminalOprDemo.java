package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LazyAndTerminalOprDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 2, 2);

        System.out.println(list.stream().
                filter(it -> it % 2 == 0).
                map(it -> it * 3).
                findFirst());


        for (Integer i : list
        ) {
            if (i % 2 == 0) {
                int itm = i * 3;
                System.out.println("element" + itm);
                break;

            }
        }

//        System.out.println(list.stream().
//                filter(LazyAndTerminalOprDemo::filterDemo).
//                map(LazyAndTerminalOprDemo::mapDemo).
//                findFirst());
    }

    private static Boolean filterDemo(Integer it) {
        System.out.println("filter " + it);
        if (it % 2 == 0) {
            return true;
        }
        return false;
    }

    private static Integer mapDemo(Integer it) {
        System.out.println("Map " + it);
        return it * 3;
    }

}
