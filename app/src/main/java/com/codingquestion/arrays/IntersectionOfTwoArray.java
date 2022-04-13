package com.codingquestion.arrays;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 5, 10, 10, 10, 15, 20};
        int[] arr2 = new int[]{10, 10, 15};
        intersectionArrayOptimizeWay(arr1, arr2);
    }

    private static void intersectionArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (i > 0 && arr1[i - 1] == arr1[i]) {
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if (j > 0 && arr2[j - 1] == arr2[j]) {
                    continue;
                }
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    private static void intersectionArrayOptimizeWay(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (i > 0 && arr1[i - 1] == arr1[i]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j - 1] == arr2[j]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }
        }
    }
}

