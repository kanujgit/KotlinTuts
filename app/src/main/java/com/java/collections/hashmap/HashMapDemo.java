package com.java.collections.hashmap;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;

public class HashMapDemo {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {

        HashMap<HashMapObjectKey, String> map = new HashMap<>();
        HashMapObjectKey key = new HashMapObjectKey("anuj");
        map.put(key, "kumar");
        //    key.setName("pankaj");
        System.out.println(map.get(key));
        System.out.println("------");

    }
}
