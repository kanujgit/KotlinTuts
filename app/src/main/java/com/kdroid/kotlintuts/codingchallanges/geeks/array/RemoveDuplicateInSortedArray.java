package com.kdroid.kotlintuts.codingchallanges.geeks.array;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5,};
        //removeDuplicate(arr, arr.length);
        removeDuplicateEfficient(arr, arr.length);
    }

    /**
     * O(N)
     * O(1)
     *
     */
    private static void removeDuplicateEfficient(int[] arr, int length) {
        int backupIndex = 1;
        for (int i = 1; i < length; i++) {
            if (arr[i] != arr[backupIndex-1]) {
                arr[backupIndex] = arr[i];
                backupIndex++ ;
            }
        }
        for (int i = 0; i < backupIndex; i++) {

            System.out.println(" "+arr[i]);
        }
    }

    /**
     * time:O(n)
     * space:O(n)
     *
     * @param arr
     * @param length
     */
    private static void removeDuplicate(int[] arr, int length) {
        int index = 0;
        int tmp[] = new int[length];
        for (int i = 1; i < length; i++) {
            if (arr[i - 1] != arr[i]) {
                tmp[index++] = arr[i - 1];
            }
        }
        for (int i = 0; i < index; i++) {
            arr[i] = tmp[i];
            System.out.println(" " + arr[i]);
        }

    }


}
