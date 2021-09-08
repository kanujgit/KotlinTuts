package com.codingchallanges.geeks.searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 25;
        System.out.println(calculatePerfectSquareNaive(x));
        System.out.println(calculatePerfectSquareOptimizeWay(x));


    }

    private static int calculatePerfectSquareOptimizeWay(int x) {
        int low = 1;
        int end = x;
        int mid;
        int square;
        int ans = -1;
        while (low <= end) {
            mid = (low + end) / 2;
            square = mid * mid;
            if (x < square) {
                end = mid - 1;
            } else if (x > square) {
                low = mid + 1;
                ans = mid;
            } else {
                return mid;
            }
        }
        return ans;
    }

    /**
     * O(sqrt(n^1/2)
     *
     * @param x
     * @return
     */
    private static int calculatePerfectSquareNaive(int x) {
        int index = -1;
        for (int i = 1; i * i <= x; i++) {
            if (i * i == x) {
                System.out.println("Found perfect square " + i);
                return i;
            }
            index = i;
        }

        return index;
    }
}
