package com.java.streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            list.add(i);
            sum += i * 2;
        }
        System.out.println(sum);


        System.out.println(list.stream().map(it -> it * 2).reduce(0, (c, e) -> c + e));
    }

}
