package com.java.streams;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// stream
public class StreamDemo {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i + "");
        }

        //list.stream().mapToInt(Integer::parseInt).toArray();
        List<Integer> integers = new ArrayList<>();
        integers = list.stream().map(it -> Integer.parseInt(it)).collect(Collectors.toList());
        // List<Integer> r1 = list.stream().map(Integer::parseInt).collect(Collectors.toList());


        // list.stream().forEach(it ->  System.out.println(it));

//        long start1 =  System.currentTimeMillis();
//        list.stream().forEach(it -> System.out.print(it));
//        long end1 =  System.currentTimeMillis();
//        System.out.println();
//        System.out.println(end1-start1);
//
//
//        long start2 =  System.currentTimeMillis();
//        list.parallelStream().forEach(System.out::print);
//        long end2 =  System.currentTimeMillis();
//        System.out.println();
//        System.out.println(end2-start2);


        // we can't use reusable stream
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);


    }
}
