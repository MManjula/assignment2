package com.cg.training.testmultidimensionalarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.training.multidimensionalarray.MultiDimensionalArray;
import com.cg.training.multidimensionalarray.myexception.InvalidInputException;

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
