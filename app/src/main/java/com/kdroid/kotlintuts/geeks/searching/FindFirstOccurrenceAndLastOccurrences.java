package com.kdroid.kotlintuts.geeks.searching;

public class FindFirstOccurrenceAndLastOccurrences {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10};
        int findNumber = 10;
        // findFirstOccurrence(arr, findNumber);
        findLastOccurrence(arr, findNumber);
    }

    private static void findFirstOccurrence(int[] arr, int findNumber) {
        int low = 0;
        int end = arr.length - 1;
        while (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] > findNumber) {
                end = mid - 1;
            } else if (arr[mid] < findNumber) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    System.out.println("First occurrence is " + mid);
                    return;
                } else {
                    end = mid - 1;
                }
            }
        }
    }

    private static void findLastOccurrence(int[] arr, int findNumber) {
        int low = 0;
        int end = arr.length - 1;
        while (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] > findNumber) {
                end = mid - 1;
            } else if (arr[mid] < findNumber) {
                low = mid + 1;
            } else {
                if (mid == end || arr[mid + 1] != arr[mid]) {
                    System.out.println("last occurrence is " + mid);
                    return;
                } else {
                    low = mid + 1;
                }
            }
        }
    }
}