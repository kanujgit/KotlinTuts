package com.codingquestion.arrays;

/**
 * Java Program to Find 2 Elements in the Array such that Difference Between
 * them is Largest
 * 
 * @author anuj
 *
 */
public class FoundMaxDiffernceArrayElement {

	public static void main(String[] args) {
		int[] arr = new int[] { -7, 9, 5, 6, 3, 2};
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max= Math.max(max, arr[i]);
			min= Math.min(min, arr[i]);
			System.out.println("max="+max+" min = "+min);
		}
		System.out.println("differenc b/w : "+(max-min));

	}
}
