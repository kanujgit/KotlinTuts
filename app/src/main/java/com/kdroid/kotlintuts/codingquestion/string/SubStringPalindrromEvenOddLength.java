package com.kdroid.kotlintuts.codingquestion.string;

public class SubStringPalindrromEvenOddLength {

	public static void main(String[] args) {
		String str = "baa";
		checkLength(str);

	}

	private static void checkLength(String str) {

		
		int even = 0;
		int odd = 0;
		for (int i = 0; i < str.length(); i++) {
			String subStr = "";
			for (int j = i + 1; j <= str.length(); j++) {
				subStr = str.substring(i, j);
				//System.out.println(subStr);
				if (subStr.length() % 2 == 0 && checkPalindrom(subStr)) {
					even++;
					//System.out.println("even " + even + " " + subStr);

				} else if (subStr.length() % 2 != 0 && checkPalindrom(subStr)) {
					//System.out.println("odd " + even + " " + subStr);
					odd++;
				}
			}
		}
		System.out.println("{" + even + "," + odd + "}");

	}

	private static boolean checkPalindrom(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
			return false;
			}
		}
		return true;
	}

}
