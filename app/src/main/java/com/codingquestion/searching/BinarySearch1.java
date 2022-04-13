package com.codingquestion.searching;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int findItem = 11;
        //  binarySearchIterative(arr, findItem);
//        findOptimizeWay(arr, findItem);
        findBinarySearchRecursiveWay(arr, findItem);
    }

    private static void findBinarySearchRecursiveWay(int[] arr, int findItem) {
        int low = 0;
        int end = arr.length - 1;
        System.out.println(callRecursiveWay(arr, low, end, findItem));
    }

    public static int callRecursiveWay(int[] arr, int low, int end, int findItem) {
        int mid = (low + end) / 2;
        if(low> end){
            return -1;
        }
        if (arr[mid] == findItem) {
            System.out.println("Item found at " + mid);
            return mid;
        }
        if (arr[mid] > findItem) {
            return callRecursiveWay(arr, low, mid - 1, findItem);
        } else {
            return callRecursiveWay(arr, mid + 1, end, findItem);
        }
    }

    private static void findOptimizeWay(int[] arr, int findItem) {
        int low = 0;
        int end = arr.length - 1;
        while (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] == findItem) {
                mid = mid + 1;
                System.out.println("Item found at " + mid);
                break;
            } else if (arr[mid] > findItem) {
                end = mid - 1;
            } else if (arr[mid] < findItem) {
                low = mid + 1;
            }
        }
    }

    /**
     * O(n)
     *
     * @param arr
     * @param findItem
     */
    private static void binarySearchIterative(int[] arr, int findItem) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findItem) {
                index = i;
                break;
            }
        }
        if (index != -1)
            System.out.println("item found at " + index);
    }


}
