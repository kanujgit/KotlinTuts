package com.codingchallanges.geeks.sorting;

import java.util.Arrays;

public class Segregate3ItemArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,1,1,2,1,0,1,0};
        sortArray012(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Dutch National Flag Algorithm
     * @param arr
     * @param n
     */
    private static void sortArray012(int[] arr, int n) {
        int low =0;
        int mid =0;
        int end = n;
        while (mid<end){
            if(arr[mid] == 0 ){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else {
                end--;
                swap(arr,mid,end);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
