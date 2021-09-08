package com.codingquestion.string;

public class RemoveFirstAndLastChar {

	public static void main(String[] args) {
		String str="ANuj";
		StringBuilder builder = new StringBuilder(str);
		builder.deleteCharAt(0);
		builder.deleteCharAt(builder.length()-1);
		System.out.println(builder.toString());

	}

}
