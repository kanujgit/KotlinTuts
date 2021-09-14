package com.java.streams;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterDemo {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 2, 2);

        //   list.stream().forEach(it ->System.out.println(it));

        //System.out.println(list.stream().filter( it -> it%2 ==0).reduce(Integer::sum));
//        System.out.println(list.stream()
//                .filter(it -> it % 2 == 0).
//                        reduce(Integer::sum));
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer a) {
                if (a % 2 == 0) {
                    return true;
                }
                return false;
            }
        };


        System.out.println(list.stream().filter(p).reduce(0, (c, e) -> c + e));


    }
}
