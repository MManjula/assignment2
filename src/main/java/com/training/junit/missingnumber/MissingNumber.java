package com.training.junit.missingnumber;

import java.util.Arrays;

/**
 * 
 * @author MManjula
 *
 */
public class MissingNumber {
	/**
	 * 
	 * @param array
	 * @return the missing number in the array
	 * @throws NoMissingNumberFoundException if there is no missing number
	 */
	public static Object calFinder(int[] array) throws NoMissingNumberFoundException {
		int missingNumber = 0;
		Arrays.sort(array);

		for (int i = 0; i < array.length - 1; i++) {
			if ((array[i] + 1) == array[i + 1])
				continue;
			else {
				missingNumber = array[i] + 1;
			}
		}
		if (missingNumber == 0)
			throw new NoMissingNumberFoundException("There is no missing number in the array");
		else
			return missingNumber;

	}

}
