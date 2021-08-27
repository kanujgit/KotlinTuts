package com.kdroid.kotlintuts.geeks.searching;

public class FindFirstOccurrenceAndLastOccurrences {
    static int[] arr = {10, 10, 11, 11, 12,12};
    static int findNumber = 12;

    public static void main(String[] args) {
        int[] arr = {10, 10, 11, 11, 12,12};
        int findNumber = 10;
        // findFirstOccurrence(arr, findNumber);
        //findLastOccurrence(arr, findNumber);
        findAllOccurrence();
    }

    public static void findAllOccurrence() {
        int first = findOccurrence(arr, findNumber, false);
        int second = findOccurrence(arr, findNumber, true);
        System.out.println("first : "+first +" and "+second);
    }

    private static int findOccurrence(int[] arr, int findNumber, boolean flag) {
        int low = 0;
        int end = arr.length - 1;
        while (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] > findNumber) {
                end = mid - 1;
            } else if (arr[mid] < findNumber) {
                low = mid + 1;
            } else {
                if (flag) {
                    if ((mid == end || arr[mid + 1] != arr[mid])) {
                        System.out.println("last occurrence is " + mid);
                        return mid;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (mid == 0 || arr[mid - 1] != arr[mid]) {
                        System.out.println("First occurrence is " + mid);
                        return mid;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
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