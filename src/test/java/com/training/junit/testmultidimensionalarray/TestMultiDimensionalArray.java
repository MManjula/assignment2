package com.training.junit.testmultidimensionalarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.multidimensionalarray.MultiDimensionalArray;
import com.training.junit.multidimensionalarray.myexception.InvalidInputException;

public class TestMultiDimensionalArray {

	@Test
	public void testSearchElementInMultiDimensionalArray() throws InvalidInputException {
		assertEquals(true, MultiDimensionalArray.search(5));
	}

	@Test(expected = InvalidInputException.class)
	public void testSearchInvalidElement() throws InvalidInputException {
		MultiDimensionalArray.search(16);
	}

}
