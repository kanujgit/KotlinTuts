package com.codingchallanges.geeks.sorting;

import java.util.Arrays;

public class NaiveLomutohoarePartition {

    public static void main(String[] args) {
        int arr[] = {10,3, 8, 6, 10, 12, 7, 7, 9};
        int pivot = 6;
        System.out.println(hoarePartition(arr));//pivot should be first element
        System.out.println(Arrays.toString(arr));
        // lomutoPartation(arr);// pivot should be last element
        //callPartition(arr, pivot);
        //  callPartition2(arr, pivot);
    }

    private static void callPartition2(int[] arr, int pivot) {
        int l = 0;
        int h = arr.length;
        int tmp[] = new int[h];
        int index = 0;
        for (int i = 0; i < h; i++) {
            if (arr[i] < pivot) {
                tmp[index++] = arr[i];
            }
        }

        for (int i = 0; i < h; i++) {
            if (arr[i] == pivot) {
                tmp[index++] = arr[i];
            }
        }
        int res = index - 1;

        for (int i = 0; i < h; i++) {
            if (arr[i] > pivot) {
                tmp[index++] = arr[i];
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            arr[i] = tmp[i];
        }
        System.out.println("Partition index : " + res);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(tmp));
    }

    private static void lomutoPartation(int[] arr) {
        int h = arr.length - 1;
        int start = 0;
        int pivot = arr[h];// always last element
        int i = start - 1;

        for (int j = start; j < h; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h);
        System.out.println(Arrays.toString(arr));
    }

    private static int hoarePartition(int arr[]) {
        int l = 0;
        int h = arr.length - 1;
        int pivot = arr[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }

    public static <T> void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    //FIXME NOT WORKING
    private static void callPartition(int[] arr, int pivot) {
        int tmp1[] = new int[arr.length];
        int tmp2[] = new int[arr.length];
        int k = 0;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {
                tmp1[k++] = arr[i];
            } else {
                tmp2[l++] = arr[i];
            }
        }
        tmp1[k++] = pivot;

        k = l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (tmp1[l] != 0) {
                arr[i] = tmp1[l++];
            } else if (tmp2[k] != 0) {
                arr[i] = tmp2[k++];
            }
        }
        System.out.println(Arrays.toString(tmp1));
        System.out.println(Arrays.toString(tmp2));
        System.out.println(Arrays.toString(arr));
    }


}
