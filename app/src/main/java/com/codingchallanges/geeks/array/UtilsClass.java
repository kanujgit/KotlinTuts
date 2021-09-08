package com.codingchallanges.geeks.array;

import java.util.ArrayList;
import java.util.Collections;

public class UtilsClass {
    public static Integer[] arr ={1,2,3,42,2,12,3};
    public static void printArray(int[] arr) {
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer a :
                list) {
            System.out.print(a + " ");
        }
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        int j = list.size() - 1;
        Integer[] objects = new Integer[list.size()];
        objects = list.toArray(objects);

        for (int i = 0; i < list.size() / 2; i++) {
            if (i <= j) {
                Collections.swap(list, i, j);
                j--;
            }
        }
        return list;
    }
}
