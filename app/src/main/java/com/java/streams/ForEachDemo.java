package com.java.streams;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//functional programming :only focus what to do rest thing leave to stream
//Object oriented: how to do and what to do
public class ForEachDemo {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.asList(1, 2, 3, 4, 5);

        /// 1 step
//        Consumer consumer = new Consumer() {
//            @Override
//            public void accept(Object o) {
//                System.out.println(o);
//            }
//    };

//// 2 step
        //Consumer consumer = it  -> System.out.println(it );

//// 3 step
        Consumer consumer = System.out::println;

//        list.forEach(System.out::println);   -> :: method reference
        //list.forEach(it -> System.out.println(it));

        //list.forEach(consumer);

//        list.forEach(ForEachDemo::show);
        list.forEach(Demo::show);

    }

    public static void show(int i) {
        System.out.println("show demo" + i * 2);
    }
}

class Demo {
    public static void show(int i) {
        System.out.println("show demo " + i * 3);
    }
}
