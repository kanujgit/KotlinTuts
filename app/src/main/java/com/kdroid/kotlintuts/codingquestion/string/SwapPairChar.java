package com.kdroid.kotlintuts.codingquestion.string;

/**
 * Swapping Pairs of Characters in a String in Java
 * 
 * @author anuj Input: str = “Java”
 *
 *         Output: aJva
 *
 *         Explanation: The given string contains even number of characters.
 *         Therefore, we swap every pair of characters.
 */
public class SwapPairChar {

	public static void main(String[] args) {
		String str = "anujl";
		String reverseString = "";
		boolean flagStatus;
		int len=0;
		if(str.length()%2==0) {
			len=str.length();
			flagStatus=true;
		}else
		{
			len =str.length()-1;
			flagStatus=false;
		}
		for (int i = 0; i < len; i = i + 2) {
			//reverseString += swapPairChar(str.substring(i, i + 2));
			reverseString += new StringBuilder(str.substring(i,i+2)).reverse();
		}
		if(flagStatus) {
			System.out.println(reverseString);	
		}else {
			System.out.println(reverseString+str.charAt(str.length()-1));
		}
		

	}

	private static String swapPairChar(String str) {
		System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return sb.toString();
	}

}
