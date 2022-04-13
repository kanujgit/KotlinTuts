package com.codingquestion;

import java.util.Scanner;

/**
 * <h2>Java Primality Test</h2>
 * <h4><p>A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .
 * Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
 * </h4>
 * </br>
 * <h3>
 * Input Format
 * </h3>
 * </br>
 * A single line containing an integer,  (the number to be checked).
 * <p>
 * Constraints
 * <p>
 * contains at most  digits.
 * Output Format
 * <p>
 * If  is a prime number, print prime; otherwise, print not prime.
 * <p>
 * Sample Input
 * <p>
 * 13
 * Sample Output
 * <p>
 * prime
 * Explanation
 * <p>
 * The only positive divisors of  are  and , so we print prime.
 */
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");

    }

    private static void findPrimeViaLoop(int n) {
        for (int i = 2; i < Math.sqrt(Double.parseDouble(String.valueOf(n))); i++) {
            if (n % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        if (n == 1) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }

}
