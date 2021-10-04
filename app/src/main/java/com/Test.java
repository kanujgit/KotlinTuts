package com;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {1, 2, 3, 1, 1, 3};
        String s1 = "anu a";
        s1.split(" ");
        int num = Arrays.stream(nums).max().getAsInt();
        int[] clone = nums.clone();
        HashMap<Integer, Integer> map = new HashMap();
        for (int n : nums
        ) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
    }
}


