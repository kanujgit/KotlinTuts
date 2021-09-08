package com.codingquestion.arrays;

import java.util.Arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        int candies = 10, num_people = 3;
        System.out.println(Arrays.toString(distributeCandies(candies,num_people)));

    }
    public static int[] distributeCandies(int candies, int num_people) {
        int[] output = new int[num_people];
        int i = 0;
        int n = 1;

        while (candies > 0) {
            if (candies <=n) {
                output[i] += candies;
                break;
            }
            output[i] += n;
            candies -= n;
            n++;
            i++;
            i = i % num_people;
        }
        return output;
    }
}
