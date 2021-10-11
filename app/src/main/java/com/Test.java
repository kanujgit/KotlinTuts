package com;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[][] a = {{1, 1}, {0, 0}};

        Solution solution = new Solution();
    }
}

class Solution {
    public int repeatedNTimes(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if (map.containsKey(nums[i])) {
                res = nums[i];
                break;
            } else {
                map.put(nums[i], 1);
            }
        }
        // for (Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue()>1){
        //         res =entry.getKey();
        //     }
        // }
        return res;
    }
}



