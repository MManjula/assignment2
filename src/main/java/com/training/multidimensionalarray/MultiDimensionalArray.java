package com.training.multidimensionalarray;

import com.training.junit.multidimensionalarray.myexception.InvalidInputException;

public class MultiDimensionalArray {

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
