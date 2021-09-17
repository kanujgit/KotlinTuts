package com.codingquestion;

import java.util.Arrays;
import java.util.Random;

public class ShuffleSongList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        randomize(arr, n);
        randomize(arr, n);
        randomize(arr, n);
        randomize(arr, n);
        randomize(arr, n);
    }

    private static void randomize(int[] arr, int n) {
        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap arr[i] with the element at random index
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
