package com.codingquestion.string;

/**
 * find all substrings in string java
 * @author anuj
 *
 */
public class AllSubString {

	public static void main(String[] args) {
		String str = "aabb";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
		

	}

}
