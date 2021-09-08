package com.codingchallanges.java.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Input Format
 * <p>
 * There will be two lines containing two numbers,  and .
 * <p>
 * Constraints
 * <p>
 * and  are non-negative integers and can have maximum  digits.
 * <p>
 * Output Format
 * <p>
 * Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.
 * <p>
 * Sample Input
 * <p>
 * 1234
 * 20
 * Sample Output
 * <p>
 * 1254
 * 24680
 * Explanations
 * <p>
 * 1234+20 = 1254
 * 1234*20 = 24680
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger in1 = sc.nextBigInteger();
        BigInteger in2 = sc.nextBigInteger();

        BigInteger sum, mul;
        sum= in1.add(in2);
        mul= in1.multiply(in2);
        System.out.println("sum : "+sum + " and mul : "+mul);

    }
}
