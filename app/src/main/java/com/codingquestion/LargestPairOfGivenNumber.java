package com.codingquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPairOfGivenNumber {
    public static void main(String[] args) {
        System.out.print(LargestPair(LargestPair(4759472)));

    }

    public static int LargestPair(int num) {
        List<Integer> list = makePair(num);
        List<String> newList = new ArrayList<>();

        Collections.reverse(list);
        for (int i = 0; i < list.size() - 1; i++) {
            newList.add(list.get(i).toString() + list.get(i + 1).toString());
        }

        list.clear();
        for (String item : newList) {
            list.add(Integer.parseInt(item));
        }
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0);
    }

    private static List<Integer> makePair(int n) {
        List<Integer> list = new ArrayList<>();
        int temp, digit, count = 0;
        temp = n;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        while (temp > 0) {
            digit = temp % 10;
            list.add(digit);
            temp = temp / 10;
            count--;
        }
        return list;
    }

}
