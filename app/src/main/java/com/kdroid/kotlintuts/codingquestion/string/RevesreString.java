package com.kdroid.kotlintuts.codingquestion.string;

import java.util.Stack;

public class RevesreString {

	public static void main(String[] args) {
		String str = "anuj";
		Stack<Character> stack = new Stack<Character>();
		for(Character ch : str.toCharArray()) {
			stack.push(ch);
		}
		for (Character character : str.toCharArray()) {
			System.out.print(stack.pop());	
		}

	}

}
