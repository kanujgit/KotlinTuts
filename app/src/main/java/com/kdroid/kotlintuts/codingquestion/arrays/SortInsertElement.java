package com.kdroid.kotlintuts.codingquestion.arrays;

import java.util.Arrays;

public class SortInsertElement {

	public static void main(String[] args) {
		int[] arr ={ 6, 7, 8, 2, 3, 4, 5, 9, 10 }; ;
		int insertElement = 11;
		Arrays.sort(arr);
		int[] new_Arr = new int[arr.length + 1];
		int index = 0;
		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= insertElement) {
				new_Arr[i] = insertElement;
				index = i;
				b = true;
				break;
			} else {
				new_Arr[i] = arr[i];
			}

		}

		if (b) {
			for (int i = index; i < arr.length; i++) {
				new_Arr[i + 1] = arr[i];
			}
		} else {
			new_Arr[arr.length] = insertElement;
		}

		for (int i : new_Arr) {
			System.out.print(" " + i);
		}

	}
}
