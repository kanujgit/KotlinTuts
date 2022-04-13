package com.codingquestion.recursion;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        System.out.println(ropeCuttingProblem(10, 2, 3, 4));
    }

    private static int ropeCuttingProblem(int i, int i1, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        int res = maxNumber(ropeCuttingProblem(i - i1, i1, i2, i3), ropeCuttingProblem(i - i2, i1, i2, i3),
                ropeCuttingProblem(i - i3, i1, i2, i3));

        if (res == -1) {
            return -1;
        } else {
            return res + 1;

        }
    }

    private static int maxNumber(int a, int b, int c) {
        int maxA = Math.max(a, b);
        return Math.max(maxA, c);
    }
}

