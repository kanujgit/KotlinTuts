package com.kdroid.kotlintuts.geeks.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
//        Integer arr[] = {1,3,42,2,3,4,23};
        Integer arr[] = {2,5,20,10,3,12};
        //Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, new EvenOddCompare());

        System.out.println(Arrays.toString(arr));
    }
}
 class EvenOddCompare implements Comparator<Integer> {
     @Override
     public int compare(Integer t1, Integer t2) {
         return t1%2 -t2%2;
     }
 }
