package com.kdroid.kotlintuts.codingquestion.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayToLinkedHashSet {

	public static void main(String[] args) {
		// array of string
		String[] names = { "John", "Devid", "Smith", "Joe", "Stark" };

		// First convert the name array to List and then
		// use the LinkedHashSet constructor to convert
		// array to linkedhasset

		HashSet<String> hashSet = new LinkedHashSet<String>(Arrays.asList(names));

		for (String string : hashSet) {
			System.out.println(string);
		}

	}

}
