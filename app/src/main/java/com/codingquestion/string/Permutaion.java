package com.codingquestion.string;

//Java program to print all the permutations 
//of the given string 
public class Permutaion {

	// Function to print all the distinct
	// permutations of str
	static void printDistinctPermutn(String str, String ans) {

		String[] outStrings = new String[20];
		int j = 0;
		// If string is empty
		if (str.length() == 0) {

			if (!ans.startsWith("9")) {
				//outStrings[j++] = ans;
				System.out.print(ans+ " ");
				outStrings[j++] =ans;
			}
			return;
		}

		// Make a boolean array of size '26' which
		// stores false by default and make true
		// at the position which alphabet is being
		// used
		boolean alpha[] = new boolean[10];

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// If the character has not been used
			// then recursive call will take place.
			// Otherwise, there will be no recursive
			// call
			if (alpha[ch - '0'] == false)
				printDistinctPermutn(ros, ans + ch);
			alpha[ch - '0'] = true;
		}
	}

	// Driver code
	public static void main(String[] args) {
		int n = 4;
		StringBuilder str = new StringBuilder();
		if (n % 2 == 0) {
			int halfNumber = n / 2;
			for (int i = 0; i < n; i++) {
				if (i < halfNumber) {
					str.append("8");
				} else {
					str.append("9");
				}

			}
		}
		// String s = "geek";
//		String [] pstr= printDistinctPermutn(str.toString(), "");
//		for (String string : pstr) {
//			System.out.println(string)	;
//		}
		printDistinctPermutn(str.toString(), "");
		
		
	}
}
