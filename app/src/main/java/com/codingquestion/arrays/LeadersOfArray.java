package com.codingquestion.arrays;

import java.util.ArrayList;

public class LeadersOfArray {
    public static void main(String[] args) {
        int[] arr = {7,10,4,10,6,5,2};
       // UtilsClass.printList(findLeadersArray(arr, arr.length));
        UtilsClass.printList(findLeadersArrayOptimizeWay(arr, arr.length));
    }

    /*
    O(N^2)
     */
    private static ArrayList<Integer> findLeadersArray(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag;
        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(arr[i]);
            }
        }
        return list;
    }


    private static ArrayList<Integer> findLeadersArrayOptimizeWay(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n-1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max <arr[i]) {
                list.add(arr[i]);
                max =arr[i];
            }
        }
        list.add(0,arr[n-1]);
        return UtilsClass.reverseList(list);
    }

}
