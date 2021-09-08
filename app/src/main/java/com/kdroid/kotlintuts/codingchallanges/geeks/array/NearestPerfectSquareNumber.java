package com.kdroid.kotlintuts.codingchallanges.geeks.array;

import java.util.Scanner;

public class NearestPerfectSquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int input = sc.nextInt();
            findClosestPerfectSquare(input);
        }
    }

    private static void findClosestPerfectSquare(int input) {
        if (isPerfectNumber(input)) {
            System.out.println("0");
            return;
        }
        int high = -1;
        int low = -1;
        int n;
        n =input+1;
        while (true){
            if(isPerfectNumber(n)){
                high =n;
                break;
            }
            else {
                n++;
            }
        }

        n = input - 1;
        while (true) {
            if (isPerfectNumber(n)) {
                low = n;
                break;
            } else {
                n--;
            }
        }

        int difference1 = high-input;
        int difference2 = input-low;

        if(difference1>difference2){
            System.out.println(difference2);
        }else {
            System.out.println(difference1);
        }

    }

    private static boolean isPerfectNumber(int N) {
        if ((Math.sqrt(N) - Math.floor(Math.sqrt(N))) != 0)
            return false;
        return true;
    }
}
