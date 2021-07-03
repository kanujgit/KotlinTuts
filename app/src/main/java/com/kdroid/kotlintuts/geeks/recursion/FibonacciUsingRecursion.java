package com.kdroid.kotlintuts.geeks.recursion;

/**
 * You are given a number n. You need to find nth Fibonacci number.
 * F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 1
 * Output: 1
 * Explanation: The first fibonacci
 * number is 1
 * Example 2:
 * <p>
 * Input:
 * n = 20
 * Output:6765
 * Explanation: The 20th fibonacci
 * number is 6765
 * Your Task:
 * You don't need to read input or print anything. You only need to complete the function fibonacci that takes n as parameters and returns the n-th fibonacci number.
 * <p>
 * Expected Time Complexity: O(2n).
 * Expected Auxiliary Space: O(N).
 * <p>
 * Constraints:
 * 1 <= n <= 20
 */
public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        int n =5;
        System.out.println(findNthFibonacci(n));
    }

    private static int findNthFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return (findNthFibonacci(n - 1) + findNthFibonacci(n - 2));
    }

}
