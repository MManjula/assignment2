package com.training.junit.sentenceeditor;

import com.training.junit.sentenceeditor.myexception.NoSuchWordFoundException;

public class SentenceEditor<T> {

	public String spaceTrimmer(String input) {
		String trimmedString = input.replaceAll("\\s+", " ");
		return trimmedString.trim();
	}

	public Object wordDeletor(String input, String word, int position) throws NoSuchWordFoundException {
		String trimmedString = spaceTrimmer(input);
		String newString = "";
		int count = 0;
		String[] arrayOfString = trimmedString.split(" ");
		for (int i = 0; i < arrayOfString.length; i++) {
			if (arrayOfString[i].equals(word) && i == (position - 1)) {
				newString=newString+arrayOfString[i].replace(word, "");
				count++;
			}
			else
				newString += arrayOfString[i] + " ";
		}
		if (count == 0)
			throw new NoSuchWordFoundException("The is no such word present in the sentence");
		else
			return newString.trim();
	}

}
