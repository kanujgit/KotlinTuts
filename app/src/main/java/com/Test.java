package com;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

public class Test {


    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        List<String> list1 = list;
        list.forEach(System.out::print);
        System.out.println("...");
        list =null;
        list1.forEach(System.out::print);
        System.out.println("...");
        list.forEach(System.out::print);

    }
}


