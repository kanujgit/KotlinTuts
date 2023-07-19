package com.codingquestion.arrays;

import java.util.Arrays;

public class ArrayFillDemo {
    public static void main(String[] args) {
        int start = 0;
        int[] arr = {1, 2, 3, 4, 5};
        //Arrays.fill(arr,-1);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            Arrays.fill(arr, start, start + arr[i], arr[i + 1]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
