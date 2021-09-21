package com.codingquestion;

import java.util.ArrayList;

public class MatrixTraverseINArrayList {
    static int count = 0;

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(0);
        integers.add(1);
        integers.add(1);
        integers.add(1);
        list.add(integers);

        ArrayList<Integer> integersList = new ArrayList<>();
        integersList.add(0);
        integersList.add(0);
        integersList.add(0);
        integersList.add(0);
        integersList.add(1);
        list.add(integersList);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(0);
        a3.add(0);
        a3.add(0);
        a3.add(0);
        a3.add(1);
        list.add(a3);
        ArrayList<Integer> a4 = new ArrayList<Integer>();
        a4.add(0);
        a4.add(0);
        a4.add(0);
        a4.add(0);
        a4.add(1);
        list.add(a4);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
                if (list.get(i).get(j) == 1) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
            }
            System.out.println(max);
            count = 0;
            System.out.println();
        }

//        int amx = Integer.MIN_VALUE;
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.get(i).size(); j++) {
//                System.out.println(""+list.get(i) +" "+list.get(j));
//
//                if (list.get(i).get(j) == 1) {
//                    count++;
//                }
//            }
//            if (amx < count) {
//                amx = count;
//            }
//            count = 0;
//        }
//        System.out.println(amx);
    }

}
