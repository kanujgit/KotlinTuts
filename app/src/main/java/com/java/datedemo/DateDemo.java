package com.java.datedemo;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//its immutable
public class DateDemo {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {

        ZonedDateTime dateTime = ZonedDateTime.now();
        //System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));


//        Date currentDate = new Date(System.currentTimeMillis());
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.getDefault());
//        String cDateTime = dateFormat.format(new Date());
//        System.out.println(cDateTime);
//        System.out.println(LocalDateTime.now());

        LocalDateTime localDate = LocalDateTime.now();
        //System.out.println(LocalDateTime.now());
        LocalDate date = LocalDate.of(1993, Month.DECEMBER, 30);
        //System.out.println(date);

        //2021-09-10T11:45:16+04:00
        //  LocalTime localTime = LocalTime.of(12,21,2,21);
//        LocalTime localTime = LocalTime.now(ZoneId.of());
        for (String s : ZoneId.getAvailableZoneIds()
        ) {
            //  System.out.println(s);
        }

        //System.out.println(localTime);


    }
}
