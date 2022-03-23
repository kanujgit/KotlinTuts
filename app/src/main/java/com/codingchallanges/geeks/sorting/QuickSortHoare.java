package com.codingchallanges.geeks.sorting;

import java.util.Arrays;

public class QuickSortHoare {
    public static void main(String[] args) {
        int arr[] = {12,32,44,22,1,3,4,5,2};
        qSort(arr,0,arr.length-1);
        //hoarePartition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void qSort(int[] arr, int start, int end) {
        if(start<end){
            int p =hoarePartition(arr,start,end);
            qSort(arr,start,p);
            qSort(arr,p+1,end);
        }
    }

    private static int hoarePartition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i =start-1;
        int j =end+1;

        while (true) {
            do { i++; } while (arr[i] < pivot);
            do { j--; } while (arr[j] > pivot);
            if (i >= j) { return j; }
            swap(arr,i,j);
        }
    }

    public static <T> void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
