/**
 * 
 */
package com.training.junit.testmissingnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.missingnumber.MissingNumber;
import com.training.junit.missingnumber.NoMissingNumberFoundException;

/**
 * @author MManjula
 *
 */
public class TestMissingNumber {
	/**
	 * 
	 * test for correct missing number as the output
	 */
	@Test
	public void testNumberNotPresentInArray() throws NoMissingNumberFoundException {
		int array[] = { 3, 0, 1 };
		assertEquals(2, MissingNumber.calFinder(array));
	}

	/**
	 * 
	 * @throws NoMissingNumberFoundException if there is no missing number
	 */
	@Test(expected = NoMissingNumberFoundException.class)
	public void testMissingNumberWithNoMissingNumber() throws NoMissingNumberFoundException {
		int[] array = { 9, 7, 5, 3, 6, 8, 1, 0, 2, 4 };
		MissingNumber.calFinder(array);
	}

}
