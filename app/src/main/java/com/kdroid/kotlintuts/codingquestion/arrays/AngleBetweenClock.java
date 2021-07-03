package com.kdroid.kotlintuts.codingquestion.arrays;

public class AngleBetweenClock {

	public static void main(String[] args) {
		//(hour*30)-(11/2*m)
		int h =2;
		int m=12;
		//int angle= (hour*30)-((11/2)*minute);
		//60 - 5*12
		 int hour_angle = (int)(0.5 * (h*60 + m));
		 //1/2*(h*60+m)
		 //h*30+m/2 - 6m
		 
	        int minute_angle = (int)(6*m);
		System.out.println(hour_angle);
		System.out.println(minute_angle);
		// Find the difference between two angles
        int angle = Math.abs(hour_angle - minute_angle);
 
        // smaller angle of two possible angles
        angle = Math.min(360-angle, angle);
		System.out.println(angle);

	}
}
