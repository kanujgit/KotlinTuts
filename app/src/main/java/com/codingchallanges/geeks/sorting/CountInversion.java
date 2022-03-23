package com.codingchallanges.geeks.sorting;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr1 = new int[]{ 2,4, 1, 3,5};
        countInversion(arr1);

    }

    //o(n*2)
    private static void countInversion(int[] arr1) {
        int count =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i]>arr1[j]){
                    count++;
                }
            }
        }
        System.out.println("total inversion "+ count);
    }
}
