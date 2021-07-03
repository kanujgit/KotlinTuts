package com.kdroid.kotlintuts.java.datastructure.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 1);
        hm.put(2, 2);
        System.out.println(hm.hashCode());
        for (Map.Entry<Integer, Integer> e : hm.entrySet()
        ) {
            System.out.println("key : "+e.hashCode() +"\t and value :"+e.getValue());
        }
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
