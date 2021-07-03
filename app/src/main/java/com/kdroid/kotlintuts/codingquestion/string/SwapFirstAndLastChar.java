package com.kdroid.kotlintuts.codingquestion.string;

public class SwapFirstAndLastChar {

	public static void main(String[] args) {
		String str="Anudsdsdj";
		String sub= str.substring(1,str.length()-1);
		String newStr= String.valueOf(str.charAt(str.length()-1))+sub+String.valueOf(str.charAt(0));
		System.out.println(newStr);

	}

}
