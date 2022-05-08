package com.codingquestion.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayToLinkedHashSet {

	public static void main(String[] args) {
		// array of string
		String[] names = { "John", "Devid", "Smith", "Joe", "Stark" };

		String[] arr = Arrays.copyOf(names,names.length-3);
		System.out.println(Arrays.toString(arr));
		// First convert the name array to List and then
		// use the LinkedHashSet constructor to convert
		// array to linkedHashset

		HashSet<String> hashSet = new LinkedHashSet<String>(Arrays.asList(names));
		hashSet.iterator().next();
		for (String string : hashSet) {
			System.out.println(string);
		}

	}

}
