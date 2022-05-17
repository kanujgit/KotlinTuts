package com.codingquestion.heap;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,23,22,0,121,12};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        buildHeap(arr,n);
        for (int i = n-1; i >0 ; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i]  = tmp;
            heapify(arr,i,0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<n && arr[l] > arr[largest])
            largest = l;
        if(r<n && arr[r] > arr[largest])
            largest = r;
        if(largest!=i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr,n,largest);
        }
    }

    private static void buildHeap(int[] arr, int n) {
        for (int i = n/2; i >=0 ; i--) {
            heapify(arr,n,i);
        }
    }
}
