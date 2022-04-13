package com.codingquestion.sorting;

public class KthSmallElementArray {
    public static void main(String[] args) {
        int [] arr= {5,11,1,2,3,4,3,1};
        int k =6;
        System.out.println(arr[findSmallElement(arr,k)]);
    }

    // lumoto partition
    private static int findSmallElement(int[] arr, int k) {
        int n = arr.length;
        int l =0;
        int r = n-1;
        while (l<=r){
            int p = partitions(arr,l,r);
            if(p == k-1){
                return p;
            }
            else if(p>k-1) {
                r =p-1;
            }else {
                l =p+1;
            }
        }
        return  -1;
    }

    private static int partitions(int[] arr, int l, int r) {
            int pivot = arr[r];
            int i = l-1;
            for (int j=l;j<r-1;j++){
                if(arr[j]<pivot){
                    i++;
                    swap(arr,i,j);
                }
            }
            swap(arr,i+1,r);
            return i+1;
    }

    public static <T> void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
