package com.codingquestion.sorting;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{2, 2, 3, 4, 5};
        intersection(arr1, arr2);
    }

    private static void intersection(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int len1 = arr1.length ;
        int len2 = arr2.length ;


        while (len1 > i && len2 > j) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                //System.out.println(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                //System.out.println(arr2[j]);
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
//        while (i < len1) {
//            if (i > 0 && arr1[i] != arr1[i - 1]) {
//                System.out.println(arr1[i]);
//                i++;
//            }
//        }
//        while (j < len2) {
//            if (j > 0 && arr2[j] != arr2[j - 1]) {
//                System.out.println(arr2[j]);
//                j++;
//            }
//        }
    }
}
