package com.codingquestion;

import java.io.IOException;

public class PerfactNumber {

    static int getSum(int n) {
        int sum = 0;

        // Note that this loop runs till square
        // root of n
        for (int i = 1; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                // If divisors are equal,take only
                // one of them
                if (n / i == i)
                    sum = sum + i;

                else // Otherwise take both
                {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }

        // calculate sum of all proper divisors
        // only
        sum = sum - n;
        return sum;
    }

    // Function to check Abundant Number
    static boolean checkAbundant(int n) {
        // Return true if sum of divisors is
        // greater than n.
        return (getSum(n) > n);
    }

    /* Driver program to test above function */
    public static void main(String args[]) throws
            IOException {

        int n = 28;
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                s += i;
        }
        if (s == n)
            System.out.println("Perfect Number");
        else if (s > n)
            System.out.println("Abundant Number");
        else
            System.out.println("Deficient Number");
    }

}


// This code is contributed by Nikita Tiwari.

