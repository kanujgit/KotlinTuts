package com.java.collections.hashmap;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;

public class HashMapDemo {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[]  = {1,2,2,3,4,4,5};
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }


        System.out.println(hm);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
