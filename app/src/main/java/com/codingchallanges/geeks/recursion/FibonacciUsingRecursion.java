package com.codingchallanges.geeks.recursion;

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
    static int n1 =0;
    static int n2 =1;
    static int n3 =0;

    public static void main(String[] args) {
        int n =10;
        printAllFabbonacciNumber(n-2);
    }

    private static void printAllFabbonacciNumber(int n) {
        if(n>0){
            n3= n1+n2;
            n1 = n2;
            n2= n3;
            System.out.println(n3);
            printAllFabbonacciNumber(n-1);
        }

    }

//    private static int findNthFibonacci(int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return (findNthFibonacci(n - 1) + findNthFibonacci(n - 2));
//    }


}
