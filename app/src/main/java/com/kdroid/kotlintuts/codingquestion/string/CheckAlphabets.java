package com.kdroid.kotlintuts.codingquestion.string;

/**
 * 
 * @author anuj
 * Check if a string contains only alphabets in Java using Lambda expression
 * Examples:

	Input : GeeksforGeek
	Output : True

	Input : Geeks4Geeks
	Output : False

	Input : null
	Output : False
 *
 */
public class CheckAlphabets {

	public static void main(String[] args) {
		// Checking for True case 
        System.out.println("Test Case 1:"); 
  
        String str1 = "GeeksforGeeks"; 
        System.out.println("Input: " + str1); 
        System.out.println("Output: " + isStringOnlyAlphabet(str1)); 
  
        // Checking for String with numeric characters 
        System.out.println("\nTest Case 2:"); 
  
        String str2 = "Geeks4Geeks"; 
        System.out.println("Input: " + str2); 
        System.out.println("Output: " + isStringOnlyAlphabet(str2)); 
  
        // Checking for null String 
        System.out.println("\nTest Case 3:"); 
  
        String str3 = null; 
        System.out.println("Input: " + str3); 
        System.out.println("Output: " + isStringOnlyAlphabet(str3)); 
  
        // Checking for empty String 
        System.out.println("\nTest Case 4:"); 
  
        String str4 = ""; 
        System.out.println("Input: " + str4); 
        System.out.println("Output: " + isStringOnlyAlphabet(str4)); 
	}
	
	private static boolean isStringOnlyAlphabet(String requestedString) {
		return ((requestedString!=null) && (!requestedString.equals("")) && 
				(requestedString.chars().allMatch(Character::isAlphabetic)));
	}

}
