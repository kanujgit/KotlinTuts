package com.codingquestion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AddDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lth = sc.next();
        String ltm = sc.next();
        String tth = sc.next();
        String ttm = sc.next();
        String lt = lth + ":" + ltm;
        String tt = tth + ":" + ttm;
        addTime(lt,tt);
    }

    public static void addTime(String a, String b) {
        int minSum = 0;
        int hourSum = 0;
        int hour1 = Integer.parseInt(a.substring(0, 2));
        int hour2 = Integer.parseInt(b.substring(0, 2));
        int min1 = Integer.parseInt(a.substring(3, 5));
        int min2 = Integer.parseInt(b.substring(3, 5));
        minSum = min1 + min2;
        if (minSum > 59) {
            hourSum += 1;
            minSum %= 60;
        }
        hourSum = hourSum + hour1 + hour2;
        System.out.println(hourSum + " Hours : " + minSum + " minutes");

    }
}
