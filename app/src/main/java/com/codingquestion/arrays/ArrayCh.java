package com.codingquestion.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCh {
// Java program for the above approach

    // Function to return the new array

    public static List<Integer> getCounterList(int[] arr) {
        int n = arr.length;
        List<Integer> counter = new ArrayList<>();

        // Initialize the counter as an ArrayList of 0s
        for (int i = 0; i < n; i++) {
            counter.add(0);
        }

        // Loop through each element of the array
        for (int i = 1; i < n; i++) {
            // Compare with each element to its left
            for (int j = 0; j < i; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (arr[i] > arr[j]) {
                    counter.set(i, counter.get(i) - diff);
                    counter.set(j, counter.get(j) + diff);
                } else {
                    counter.set(i, counter.get(i) + diff);
                    counter.set(j, counter.get(j) - diff);
                }
            }
        }

        // Return the counter as a sublist from index 1 to n
        return counter.subList(1, n);
    }


    public static List<Long> getCounterArray(List<Long> arr) {
        List<Long> counterList = new ArrayList<>();
        long counter = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                counterList.add(counter);
            } else {
                if (arr.get(i) > arr.get(i - 1)) {
                    counter += Math.abs(arr.get(i) - arr.get(i - 1));
                } else {
                    counter -= Math.abs(arr.get(i) - arr.get(i - 1));
                }
                counterList.add(counter);
            }
        }
        return counterList;
    }

    public static void main(String[] args) {
        List<Long> arr = Arrays.asList(2L, 4L, 3L);
        List<Long> counterList = getCounterArray(arr);
        System.out.println(counterList);
    }
}

