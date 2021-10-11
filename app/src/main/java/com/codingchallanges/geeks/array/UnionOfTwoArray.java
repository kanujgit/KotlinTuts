package com.codingchallanges.geeks.array;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 5, 6};
        unionOfArray(arr1, arr2);
    }

    private static void unionOfArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        while (i < arr1.length || j < arr2.length) {
            if (i > 0 && i < arr1.length - 1 && (arr1[i] == arr1[i - 1])) {
                continue;
            }
            if (j > 0 && j < arr2.length - 1 && (arr2[j] == arr2[j - 1])) {
                continue;
            }
            if (i <= arr1.length - 1) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    System.out.println(arr1[i]);
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    System.out.println(arr2[j]);
                    j++;
                }
            } else {
                System.out.println(arr2[j++]);
            }
        }
    }
}
