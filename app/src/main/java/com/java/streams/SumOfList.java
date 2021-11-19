package com.java.streams;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.List;

public class SumOfList {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

    }

}


