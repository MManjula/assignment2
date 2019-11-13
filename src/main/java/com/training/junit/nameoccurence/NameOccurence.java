package com.training.junit.nameoccurence;

import com.training.junit.nameoccurence.myexception.NoSuchElementFoundException;

public class NameOccurence {

	public static int findOccurence(String[] input, String name) throws NoSuchElementFoundException {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].matches(name))
				count++;
			else
				continue;
		}
		if (count == 0)
			throw new NoSuchElementFoundException("There is no such element present in the arrray.");
		else
			return count;
	}

}
