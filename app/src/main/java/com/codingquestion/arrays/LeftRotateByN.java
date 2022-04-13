package com.codingquestion.arrays;

public class LeftRotateByN {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int rotation = 3;
        leftRotate(arr, 1, rotation);
        int tmpArr[] = new int[arr.length - (rotation)];
        for (int i = 0; i < arr.length - rotation; i++) {
            tmpArr[i] = arr[rotation + i];
        }
        rightRotate(tmpArr, 1, tmpArr.length);
        for (int i = 0; i < tmpArr.length; i++) {
            arr[rotation + i] = tmpArr[i];
        }
        UtilsClass.printArray(arr);
    }

    private static void rotateArrayByD(int[] arr, int rotation, int length) {
        for (int i = 0; i < rotation; i++) {
            rotateArrayByOne(arr, length, rotation);
        }
        UtilsClass.printArray(arr);
    }

    private static void rotateArrayByOne(int[] arr, int n, int k) {
        for (int i = k + 1; i < n; i++) {
            swap(arr, i - 1, i);
        }
        UtilsClass.printArray(arr);
    }

    public static void swap(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
    }


    private static void leftRotate(int arr[], int d, int n) {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /*Fuction to get gcd of a and b*/
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    ////////////////////////////////////////////////  Right

    public static void rightRotate(int[] nums, int k, int n) {
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
