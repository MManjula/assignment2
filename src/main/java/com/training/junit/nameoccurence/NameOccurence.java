package com.training.junit.nameoccurence;

import com.training.junit.nameoccurence.myexception.NoSuchElementFoundException;

/**
 * 
 * @author MManjula
 *
 */
public class NameOccurence {
	/**
	 * 
	 * @param input
	 * @param name
	 * @return the count of the occurrence of the same name present in the array of
	 *         string
	 * @throws NoSuchElementFoundException
	 */
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
