package com;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {1, 2, 3, 1, 1, 3};
        HashMap<Integer, Integer> map = new HashMap();
        for (int n : nums
        ) {
            //map.put(num, map.getOrDefault(num, 0));
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
    }
}


