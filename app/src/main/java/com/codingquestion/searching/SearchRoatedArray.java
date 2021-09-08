package com.codingquestion.searching;

public class SearchRoatedArray {
    public static void main(String[] args) {
        int[] arr = {7,4,5,6,7,0,1,2,0};
        int key = 0;
        searchRoatedArray(arr, key);
    }

    private static void searchRoatedArray(int[] arr, int key) {
        int n = arr.length;
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
    }

    static int search(int arr[], int l, int h, int key) {
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;

        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            return search(arr, mid + 1, h, key);
        }

        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);

        return search(arr, l, mid - 1, key);
    }

}

