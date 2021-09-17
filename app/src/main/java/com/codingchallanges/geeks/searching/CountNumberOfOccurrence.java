package com.codingchallanges.geeks.searching;

public class CountNumberOfOccurrence {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 0};
        int x = 1;
        findOccurrence(arr, x);
    }

    /**
     * O(Log n + count)
     * @param arr
     * @param x
     */
    private static void findOccurrence(int[] arr, int x) {
        int index = binarySearch(arr, x);
        System.out.println("index found " + index);
        int count = 1;
        int left = index - 1;
        while (left >= 0 && arr[left] == x) {
            left--;
            count++;
        }
        int right = index + 1;
        while (right < arr.length && arr[right] == x) {
            right++;
            count++;
        }
        System.out.println("Total no of count "+count);
    }

    private static int binarySearch(int[] arr, int x) {
        int low = 0, mid;
        int end = low + arr.length - 1;
        while (low <= end) {
            mid = (low + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            }
        }
        return -1;
    }

}
