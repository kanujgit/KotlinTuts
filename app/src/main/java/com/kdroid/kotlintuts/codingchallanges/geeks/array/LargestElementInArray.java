package com.kdroid.kotlintuts.codingchallanges.geeks.array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {11, 3, 4, 5};
    //    printLargestIndexByNaive(arr, arr.length);
        findLargestElement(arr, arr.length);
    }

    /**
     * O(n~2)
     *
     * @param arr
     * @param n
     */
    private static void printLargestIndexByNaive(int[] arr, int n) {
        boolean flag;
        int index = -1;
        for (int i = 0; i < n; i++) {
            flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                index = i;
            }
        }
        System.out.println("largest index :" + index);
    }

    public static void findLargestElement(int[] arr, int n) {
        int res=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        System.out.println("largest index : "+ res);
    }
}
