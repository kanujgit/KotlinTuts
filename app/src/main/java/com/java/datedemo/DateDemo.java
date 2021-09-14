package com.java.datedemo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

//its immutable
public class DateDemo {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate date = LocalDate.of(1993, Month.DECEMBER, 30);
        System.out.println(date);

        //  LocalTime localTime = LocalTime.of(12,21,2,21);
//        LocalTime localTime = LocalTime.now(ZoneId.of());
        for (String s : ZoneId.getAvailableZoneIds()
        ) {
            System.out.println(s);
        }

        //System.out.println(localTime);


    }
}
