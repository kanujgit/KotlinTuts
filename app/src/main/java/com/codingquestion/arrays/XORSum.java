package com.codingquestion.arrays;

import java.util.Arrays;

public class XORSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.subsetXORSum(new int[]{5, 1, 6});
    }
}

class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int[] res = new int[(1 << n)];
        int sum = 0;
        int xor;
        for (int i = 0; i < (1 << n); i++) {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0)
                    res[i] ^= nums[j];
            }
            sum += res[i];
        }
        Arrays.toString(nums);
        return sum;
    }
}


