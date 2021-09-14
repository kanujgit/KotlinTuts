package com.java.streams;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 2, 2);


//        Consumer<Integer> stringConsumer = new Consumer<Integer>() {
//            public void accept(Integer a) {
//                System.out.println(a);
//            }
//        };
//        list.stream().forEach(stringConsumer);

        //step 2
//        Consumer<Integer> stringConsumer = (it)-> System.out.println(it);
//        list.stream().forEach(stringConsumer);

        // step 3
        //Consumer<Integer> stringConsumer = (it)-> System.out.println(it);
        list.stream().forEach((it) -> System.out.println(it));


    }

}
