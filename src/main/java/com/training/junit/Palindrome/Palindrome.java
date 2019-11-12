package com.training.junit.Palindrome;

public class Palindrome<T> {

	public String[] callPalindrome(String[] inputs) {
		String[] palindromeArray = {};
		int index = 0;

		for (int i = 0; i < inputs.length; i++) {
			String reverse = "";
			for (int j = inputs[i].length() - 1; j >= 0; j--) {
				reverse += inputs[i].toUpperCase().charAt(j);
				System.out.println(reverse);
			}
			System.out.println(reverse);
			if (reverse.equals(inputs[i].toUpperCase())) {
				palindromeArray[index] = inputs[i];
				System.out.println(palindromeArray[index]);
				index++;
				
			}
		}

		for (int i = 0; i < palindromeArray.length - 1; i++) {
			String maxArray = palindromeArray[i];
			if (palindromeArray[i + 1].length() > palindromeArray[i].length())
				maxArray = palindromeArray[i + 1];
		}
		return palindromeArray;

	}


}
