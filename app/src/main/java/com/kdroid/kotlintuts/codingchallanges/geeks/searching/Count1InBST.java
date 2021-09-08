package com.kdroid.kotlintuts.codingchallanges.geeks.searching;

import com.kdroid.kotlintuts.codingchallanges.geeks.array.UtilsClass;

public class Count1InBST {
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0, 0,1,1,1,1,2,2,2};
        int x = 1;
        findOccurrence(arr, x);



        int changeArr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            changeArr[i] = calculateNumberChangingPosition(arr, i);
        }
        UtilsClass.printArray(changeArr);

    }

    private static int calculateNumberChangingPosition(int[] arr, int x) {
        return (findFirstOccurrence(arr, x));
    }


    private static void findOccurrence(int[] arr, int x) {
        int firstOne = findFirstOccurrence(arr, x);
        if (firstOne == -1) {
            System.out.println("No match");
            return;
        }
        int count = arr.length - firstOne;
        System.out.println("Count " + count);
    }

    private static int findFirstOccurrence(int[] arr, int x) {

        int low = 0;
        int end = arr.length - 1, mid;

        while (low <= end) {
            mid = (low + end) / 2;

            if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}
