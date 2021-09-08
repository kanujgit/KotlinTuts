package com.codingquestion.string;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Java Program to Count Number of Digits in a String
 * @author anuj
 *
 */
public class CountDigitInString {

	public static void main(String[] args) {
		String str = "Anuj go the 100 no";
		List<Character> list = str.chars().mapToObj(item -> (char) item).collect(Collectors.toList());
		Predicate<Character> p = item->(item>=48 && item<=57);
		long count = list.stream().filter(p).count();
		System.out.println("totoal no of digit "+count);
		

	}

}
