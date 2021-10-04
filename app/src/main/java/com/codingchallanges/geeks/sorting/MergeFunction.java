package com.codingchallanges.geeks.sorting;

public class MergeFunction {
    public static void main(String[] args) {
        int low = 0;
        int high = 6;
        int mid = 3;
        int[] arr = {10, 15, 20, 40, 8, 11, 55};
        //create aux arr
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i <= mid)
                leftArr[i] = arr[i];
            else
                rightArr[j++] = arr[i];
        }
        mergeTwoArray(leftArr, rightArr);
    }

    private static void mergeTwoArray(int[] leftArr, int[] rightArr) {
        int i = 0;
        int j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j])
                System.out.println(leftArr[i++]);
            else
                System.out.println(rightArr[j++]);
        }

        while (i < leftArr.length)
            System.out.println(leftArr[i++]);
        while (j < rightArr.length)
            System.out.println(rightArr[j++]);

    }


}
