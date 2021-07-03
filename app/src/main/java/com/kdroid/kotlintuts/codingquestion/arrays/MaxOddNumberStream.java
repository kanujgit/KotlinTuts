package com.kdroid.kotlintuts.codingquestion.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MaxOddNumberStream {

	public static void main(String[] args) {
		int[] arr = {1,2,3,0};
		int m=-1;
		for (int i : arr) {
			if(i%2 !=0) {
				m = Math.max(m, i);
			}
		}
	//	System.out.println(m);
		//using stream 
		List<Integer> list = new ArrayList<Integer>();
		Arrays.stream(arr).forEach(list :: add);
		System.out.println(list.stream().filter(item -> (item%2!=0)).max(Integer :: compare).orElse(0));
	
		
	}
}
