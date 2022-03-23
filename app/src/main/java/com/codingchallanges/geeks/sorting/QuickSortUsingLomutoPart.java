package com.codingchallanges.geeks.sorting;

public class QuickSortUsingLomutoPart {
    public static void main(String[] args) {
        int arr[] = {10,3, 8, 6, 10, 12, 7, 7, 9};
        int l=0;
        int h =arr.length-1;
        qSort(arr,l,h);
        for(int x: arr)
            System.out.print(x+" ");
    }

    private static void qSort(int[] arr,int l,int h) {
        if(l<h) {
            int p = callLomutoPartition(arr, l, h);
            qSort(arr, l, p - 1);
            qSort(arr, p + 1, h);
        }
    }

    private static int callLomutoPartition(int []arr, int l, int h){

        int pivot =arr[h];
        int i =l-1;

        for (int j = l; j <= h-1; j++) {
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    public static <T> void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
