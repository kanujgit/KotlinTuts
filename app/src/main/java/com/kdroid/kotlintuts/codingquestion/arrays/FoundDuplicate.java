package com.kdroid.kotlintuts.codingquestion.arrays;

import java.util.HashMap;

public class FoundDuplicate {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 60, 1, 3 };

		// foundRepeatedUsingFreequency(arr);
		foundRepeatElementUsingHashMap(arr);

	}

	private static void foundRepeatElementUsingHashMap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
//		for(HashMap map : Integer) {
//			
//		}
		int index = 0;
		for (int i : arr) {
			index++;
			if (!map.containsKey(i)) {
				map.put(index, i);
			}else {
				System.out.println("found duplicate :"+i);
			}
			

		}
		System.out.println(map.toString());

	}

	private static void foundRepeatedUsingFreequency(int[] arr) {
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			m = Math.max(m, arr[i]);
		}
		int[] tmp = new int[m + 1];
		for (int i = 0; i < arr.length; i++) {
			tmp[arr[i]]++;
		}
		for (int i = 0; i < m + 1; i++) {
			// System.out.println(tmp[i]);
			if (tmp[i] > 1) {
				System.out.println(i);
			}
		}
	}
}
