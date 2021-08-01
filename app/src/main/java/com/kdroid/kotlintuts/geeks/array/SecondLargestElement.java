package com.kdroid.kotlintuts.geeks.array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 11};
//        findSecondLargestElement(arr, arr.length);
        findSecondMaxNumberUngOneTraversal(arr, arr.length);
    }

    private static void findSecondLargestElement(int[] arr, int length) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int a : arr
        ) {
            max = Math.max(a, max);
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] != max) {
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        if (secondLargest == Integer.MIN_VALUE)
            System.out.println("There is no second " +
                    "largest element\n");
        else
            System.out.println("The second largest " +
                    "element is " + secondLargest);

    }

    public static void findSecondMaxNumberUngOneTraversal(int[] arr, int n) {
        int largestIndex = 0;
        int backUpIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[largestIndex]) {
                backUpIndex = largestIndex;
                largestIndex = i;
            } else if (arr[i] != arr[largestIndex]) {
                if (backUpIndex != -1 && arr[i] > arr[backUpIndex]) {
                    backUpIndex = i;
                }
            }
        }
        if(backUpIndex!=-1){
            System.out.println("max number : " + arr[largestIndex] + " and Second number " + arr[backUpIndex]);
        }else {
            System.out.println("No Largest number");
        }

    }
}
