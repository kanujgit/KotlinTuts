package com.kdroid.kotlintuts.codingquestion.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegex {

	public static void main(String[] args) {
		String str="AnujKume!23.434";
		String regex = "[^A-Za-z0-9]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		System.out.println(matcher.replaceAll(""));

	}

}
