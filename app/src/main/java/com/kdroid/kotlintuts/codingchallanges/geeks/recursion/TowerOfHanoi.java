package com.kdroid.kotlintuts.codingchallanges.geeks.recursion;

/**
 * No of movement
 * 2 to power(n-1)
 * 1 ,2 , 4,......2^(n-1)
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        char a = 'a', b = 'b', c = 'c';
        toh(n, a, b, c);
        System.out.println();
        System.out.println(tohWithReturn(n,a,b,c));

    }

    private static void toh(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("move 1 from " + a + " to " + c);
            return;
        }
        toh(n - 1, a, c, b);
        System.out.println("move " + n + " from " + a + " to " + c);
        toh(n - 1, b, a, c);
    }

    private static long tohWithReturn(int n, char from, char to, char aux) {
        long move = 0;
        if (n >= 1) {
            move += tohWithReturn(n - 1, from, aux, to);
            System.out.println("move disk " + n + " from rod " + from + " to " + to);
            move++;
            move += tohWithReturn(n - 1, aux, to, from);
        }
        return move;
    }


}
