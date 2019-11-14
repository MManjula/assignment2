package com.training.junit.testmultidimensionalarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.multidimensionalarray.MultiDimensionalArray;
import com.training.junit.multidimensionalarray.myexception.InvalidInputException;

/**
 * 
 * @author MManjula
 *
 */
public class TestMultiDimensionalArray {
	/**
	 * 
	 * test for saerching a valid input in the matrix
	 */
	@Test
	public void testSearchElementInMultiDimensionalArray() throws InvalidInputException {
		assertEquals(true, MultiDimensionalArray.search(5));
	}

	/**
	 * 
	 * @throws InvalidInputException if the input is not present in the matrix
	 */
	@Test(expected = InvalidInputException.class)
	public void testSearchInvalidElement() throws InvalidInputException {
		MultiDimensionalArray.search(16);
	}

}
