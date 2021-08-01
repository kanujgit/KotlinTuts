package com.kdroid.kotlintuts.codingquestion.string;

/**
 * A string is a pangram string if it contains all the character of the
 * alphabets ignoring the case of the alphabets.
 * 
 * @author anuj Input: str = “Abcdefghijklmnopqrstuvwxyz” Output: Yes
 *         Explanation: The given string contains all the letters from a to z
 *         (ignoring case).
 * 
 *         Input: str = “GeeksForGeeks” Output: No Explanation: The given string
 *         does not contain all the letters from a to z (ignoring case).
 * 
 * 
 */
public class StringPanagram {

	public static void main(String[] args) {

		String str = "Abksd";
		boolean flag =false;
		str = str.toLowerCase();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}

	}
}
