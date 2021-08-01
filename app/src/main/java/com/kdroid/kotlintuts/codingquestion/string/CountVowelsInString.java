package com.kdroid.kotlintuts.codingquestion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 	CountVowelsInString {

	/**
	 * Java Program to Count Number of Vowels in a String
	 * 
	 */
	public static void main(String[] args) {
		String str= "Count the vowles";
		List<Character> list = str.chars().mapToObj(item -> (char)item).collect(Collectors.toList());
		int count=0;
		
		//via stram function
		Predicate<Character> p = ch -> (ch.equals('a')|| ch.equals('A')|| ch.equals('e')|| ch.equals('E')|| ch.equals('i')|| ch.equals('I')||
				ch.equals('o')|| ch.equals('O')|| ch.equals('u')|| ch.equals('U'));
		
		long countNo= list.stream().filter(p).count();
		
		
		//via simple for loop
//		}
		
		
		System.out.println("Total no of vowels"+countNo);
	}

}
