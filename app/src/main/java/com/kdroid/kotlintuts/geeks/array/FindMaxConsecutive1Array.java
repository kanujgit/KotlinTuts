package com.kdroid.kotlintuts.geeks.array;

public class FindMaxConsecutive1Array {
    public static void main(String[] args) {
        int[] arr = {0,1, 1, 1, 1, 0, 1, 1};
        findNaiveSolution(arr, arr.length);
        findOptimize(arr, arr.length);
    }

    private static void findOptimize(int[] arr, int length) {
        int count = 0;
        int res = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                res = Math.max(count, res);
            }
        }
        System.out.println("Max occ "+ res);
    }


    /**
     * time: O(N)
     * Space o(N)
     *
     * @param arr
     * @param length
     */
    private static void findNaiveSolution(int[] arr, int length) {
        int[] countArray = new int[length];
        int counter = 1;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 1) {
                if (flag) {
                    counter = 1;
                    index++;
                    flag = false;
                }
                countArray[index] = counter++;
            } else {
                flag = true;
            }
        }
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < countArray.length; i++) {
            maxNumber = Math.max(maxNumber, countArray[i]);
        }
        System.out.println("max consecutively number: " + maxNumber);
    }


}
