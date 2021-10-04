package com.codingchallanges.geeks.sorting;

public class MergeTwoSortedArray {


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 5};
        mergeArray(arr1, arr2);
    }

    private static void mergeArray(int[] arr1, int[] arr2) {
        int i, j;
        i = j = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i++] + " ");
            } else {
                System.out.print(arr2[j++] + " ");
            }
        }
        while (i < len1) {
            System.out.print(arr1[i++] + " ");
        }
        while (j < len2) {
            System.out.print(arr2[j++] + " ");
        }
    }

}
