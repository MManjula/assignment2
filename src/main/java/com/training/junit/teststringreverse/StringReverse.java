package com.training.junit.teststringreverse;

import com.training.junit.stringreverse.myexception.InvalidStringException;

public class StringReverse {

	public static Object reverse(String string) throws InvalidStringException {
		if (!string.isEmpty()) {
			String[] stringWithoutSpace = string.split(" ");
			String reversedString = "";
			for (int i = 0; i < stringWithoutSpace.length; i++) {
				String subString = stringWithoutSpace[i];
				String reversedSubString = "";
				for (int j = subString.length() - 1; j >= 0; j--) {
					reversedSubString += subString.charAt(j);
				}
				reversedString += reversedSubString + " ";

			}
			return reversedString.trim();
		}

		throw new InvalidStringException("String input is invalid");
	}

}
