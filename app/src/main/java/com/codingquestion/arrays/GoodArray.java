package com.codingquestion.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GoodArray {
    public static List<Integer> getQueryResults(long n, List<List<Integer>> queries) {
        List<Integer> array = new ArrayList<>();
        int i = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                array.add((int) Math.pow(2, i));
            }
            n >>= 1;
            i++;
        }
        Collections.sort(array);
        List<Integer> results = new ArrayList<>();
        for (List<Integer> query : queries) {
            int l = query.get(0);
            int r = query.get(1);
            int m = query.get(2);
            long product = 1;
            for (i = l - 1; i < r; i++) {
                product = (product * array.get(i)) % m;
            }
            results.add((int) product);
        }
        return results;
    }

    public static void main(String[] args) {

//        int n = 841;
//        int x = 1;
//        for (int i=0;i<50;i++){
//            int nx = (x+n/x)/2;
//            x = nx;
//        }
//
//        System.out.println(x);


        Integer a = 315;
        Integer b = 840;
        while (b>0){
            a%= b;
            a = a - b;
            b = a + b;
            a = b - a;
        }
        System.out.println(a);

    }


}
