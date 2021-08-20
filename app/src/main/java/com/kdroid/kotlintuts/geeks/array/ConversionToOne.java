package com.kdroid.kotlintuts.geeks.array;

import java.util.Scanner;

/**
 * If N is even then divide the number by 2.
 * If N is odd then you can either add 1 to it or subtract 1 from it.
 */
public class ConversionToOne {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int input = sc.nextInt();
            count =0;
            System.out.println(makeItOne(input));
        }
    }

    private static int makeItOne(int input) {
        if (input == 1) {
            return count;
        } else if (input == 2) {
            count++;
            return count;
        } else if (input > 0 && input % 2 != 0) {
            input = input - 1;
            count++;
            makeItOne(input);
        } else if (input > 0 && input % 2 == 0) {
            input = input / 2;
            count++;
            makeItOne(input);
        }
        return count;
    }
}
