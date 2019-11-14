package com.training.junit.multidimensionalarray;

import com.training.junit.multidimensionalarray.myexception.InvalidInputException;

/**
 * 
 * @author MManjula
 *
 */
public class MultiDimensionalArray {
	/**
	 * 
	 * @param element
	 * @return the element from the matrix when it matches the input
	 * @throws InvalidInputException if the input is not present in the matrix
	 */
	public static Object search(int element) throws InvalidInputException {
		int matrix[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j] == element) {
					return true;
				}
			}
		}
		throw new InvalidInputException("Invalid Input");
	}

}
