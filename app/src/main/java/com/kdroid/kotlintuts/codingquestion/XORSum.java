package com.kdroid.kotlintuts.codingquestion;

import java.util.ArrayList;
import java.util.List;

public class XORSum {

    public static void main(String[] args) {
        long L = 60, R = 130;
        System.out.println(sumOfXor(L, R));
    }

    private static long sumOfXor(long L, long R) {
        List<Integer> list = new ArrayList<>();
        for (int i = (int) L; i < R; i++) {
            if (calculatePowerOfTwo(i)) {
                list.add(i);
            }
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return sumXOR(arr, list.size());

    }

    static long sumXOR(int arr[], int n) {
        long sum = 0;
        for (int i = 0; i < 32; i++) {
            // Count of zeros and ones
            int zc = 0, oc = 0;

            // Individual sum at each bit position
            long idsum = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] % 2 == 0)
                    zc++;

                else
                    oc++;
                arr[j] /= 2;
            }

            // calculating individual bit sum
            idsum = oc * zc * (1 << i);

            // final sum
            sum += idsum;
        }
        return sum;
    }

    private static boolean calculatePowerOfTwo(int n) {
        return (n & n - 1) == 0;
    }
}
