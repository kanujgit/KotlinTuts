package com.kdroid.kotlintuts.geeks.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
 * Take the set of integers
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
 * First, delete every second number, we get following reduced set.
 * 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
 * Now, delete every third number, we get
 * 1, 3, 7, 9, 13, 15, 19,….….
 * Continue this process indefinitely……
 * Any number that does NOT get deleted due to above process is called “lucky”.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Output: 0
 * Explanation: 5 is not a lucky number
 * as it gets deleted in the second
 * iteration.
 * Example 2:
 * <p>
 * Input:
 * N = 19
 * Output: 1
 * Explanation: 19 is a lucky number
 */

class ExceptionHandle {

}

public class LuckyNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            System.out.println(isLucky(n) ? 1 : 0 );
        }
    }
    public static int counter = 2;
    public static boolean isLucky(int n) {
//        long counter =2;
        if(counter>n){
            return true;
        }
        if(n%counter == 0){
            return false;
        }
        n=n-(n/counter);
        counter++;
        return isLucky(n);
    }
}
