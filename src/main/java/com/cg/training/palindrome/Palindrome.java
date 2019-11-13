package com.cg.training.palindrome;

public class Palindrome {

	public static boolean checkPalindrome(int number) {
		String reverse = "";

		String input = String.valueOf(number);
		for (int i = (input.length() - 1); i >= 0; i--) {
			reverse += input.charAt(i);
		}

		if (reverse.equals(input))
			return true;
		else
			return false;

	}

}
