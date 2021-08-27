package com.kdroid.kotlintuts.geeks.array;

import java.util.HashSet;

public class DesiredSum {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int n = 7;

        //findDesiredSum(arr, sum);
//        int A[] = {1, 4, 45, 6, 10, 8};
//        int n = 16;
        printPairs(A, n);


    }

    static void printPairs(int arr[], int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + sum + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }


    private static void findDesiredSum(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] + arr[j] == sum) {
                        System.out.println("i =" + i + " and j = " + j);
                    }
                }
            }
        }
    }
}
