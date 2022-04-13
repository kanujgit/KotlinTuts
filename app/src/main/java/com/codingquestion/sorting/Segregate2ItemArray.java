package com.codingquestion.sorting;

import java.util.Arrays;

public class Segregate2ItemArray {
    public static void main(String[] args) {
        int[] arr = new int[]{11,-15,-3,-2,18};
        int[] arr1 = new int[]{11,-15,-3,-2,18};
        int[] arr2 = new int[]{0,1,0,0,1,0,1};
        int[] arr3 = new int[]{0,1,0,0,1,0,1};
        sortNegativeNumber(arr,arr.length);
        System.out.println(Arrays.toString(arr));

        sortPositiveNumber(arr1,arr1.length);
        System.out.println(Arrays.toString(arr1));

        sort0and1(arr2,arr2.length);
        System.out.println(Arrays.toString(arr2));

        sort1and0(arr3,arr3.length);
        System.out.println(Arrays.toString(arr3));
    }

    private static void sortNegativeNumber(int[] arr, int n) {
        int i=-1; int j=n;
        while (true){
            do { i++; }while (arr[i]<0);
            do { j--; }while (arr[j]>=0);
            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }

    private static void sortPositiveNumber(int[] arr, int n) {
        int i=-1; int j=n;
        while (true){
            do { i++; }while (arr[i]>=0);
            do { j--; }while (arr[j]<0);
            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }

    private static void sort0and1(int[] arr, int n) {
        int i=-1; int j=n;
        while (true){
            do { i++; }while (arr[i]==0);
            do { j--; }while (arr[j]==1);
            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }

    private static void sort1and0(int[] arr, int n) {
        int i=-1; int j=n;
        while (true){
            do { i++; }while (arr[i]==1);
            do { j--; }while (arr[j]==0);
            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }

    private static void swap(int[] arr,int i, int i1) {
            int tmp =arr[i];
            arr[i] = arr[i1];
            arr[i1] =tmp;
    }
}
