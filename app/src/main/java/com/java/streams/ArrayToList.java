package com.java.streams;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

//        integerList();
//        stingArrToList();
//        StringListToArray();
        intListToArray();

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private static void intListToArray() {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        System.out.println(list);
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr));
    }

    private static void StringListToArray() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        int[] arr = list.stream().mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr));
    }

    private static void stingArrToList() {
        String[] str = {"a", "b", "c"};
        List<String> list = new ArrayList<String>();
        list = Arrays.asList(str);
        System.out.println(list);
    }

    private static void integerList() {
        // integer list
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.stream(arr).boxed().map(Integer::new).collect(Collectors.toList());
        System.out.println(list);
    }
}
