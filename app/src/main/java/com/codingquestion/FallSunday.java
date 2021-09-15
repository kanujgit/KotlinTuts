package com.codingquestion;

import java.util.Calendar;

public class FallSunday {
    public static void main(String[] args) {
        //int count =0;
//        Calendar cal = Calendar.getInstance();
//        if (Calendar.SUNDAY == cal.get(Calendar.DAY_OF_WEEK) && cal.get(Calendar.DAY_OF_MONTH) <= 7){
//            count++;
//        }
//
//        Calendar rightNow = Calendar.getInstance();
//        int weekDay = rightNow.get(Calendar.DAY_OF_WEEK);
//        int monthDay = rightNow.get(Calendar.DAY_OF_MONTH);
//        if ( (weekDay == Calendar.SUNDAY) && (monthDay <8)) {
//            // first sunday of this month
//        }

        Calendar calendar = Calendar.getInstance();
        int countFirstSunday = 0;
        for (int year = 1900; year <= 1999; year++) {
            for (int month = 0; month <= 11; month++) {
                calendar.set(year, month, 1);
                if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                    countFirstSunday++;
                }
            }
        }
        System.out.println("Sundays as the first of month: " + countFirstSunday);
    }

}

