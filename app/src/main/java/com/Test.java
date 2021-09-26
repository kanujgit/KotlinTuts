package com;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.Scanner;

public class Test {


    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        int n = s.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (n-- > 0) {
            arr[i++] = s.nextInt();
        }
        int hour = s.nextInt();

        System.out.println(hour);
        System.out.println(Arrays.toString(arr));
    }
}


