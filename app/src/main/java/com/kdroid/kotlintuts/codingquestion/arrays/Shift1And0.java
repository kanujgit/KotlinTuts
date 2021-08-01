package com.kdroid.kotlintuts.codingquestion.arrays;

//Java Program to Segregate 0s on Left Side & 1s on Right Side of the Array
public class Shift1And0  extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("thread is running...");  

		
		
	}

	public static void main(String[] args) {

		int[] arrr = new int[] { 1, 0, 1, 0, 1, 0, 1, 0, 0, 0 };
		int tmp[] = new int[2];

		for (int i = 0; i < arrr.length; i++) {
			tmp[arrr[i]]++;
		}
		for (int i = 0; i < tmp[0]; i++) {
			arrr[i] = 0;
		}
		for (int i = 0; i < tmp[1]; i++) {
			arrr[i + tmp[0]] = 1;
		}

		for (int i : arrr) {
			System.out.println(i);
		}
		Shift1And0 and0 = new Shift1And0();
		and0.start();
		and0.start();
		
		
	}

}
