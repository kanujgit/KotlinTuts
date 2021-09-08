package com.codingchallanges.geeks.array;

public class DeletionOps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int deleteNumber = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == deleteNumber) {
                break;
            }
            if (i == arr.length) {
                return;
            }
        }

        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }

        for (int j = 0; j < arr.length-1; j++) {
            System.out.println(arr[j]);
        }
        for (int k : arr
        ) {

        }
    }
}
