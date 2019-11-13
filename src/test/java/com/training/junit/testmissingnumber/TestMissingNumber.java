/**
 * 
 */
package com.training.junit.testmissingnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.missingnumber.MissingNumber;
import com.training.junit.missingnumber.NoMissingNumberFoundException;

/**
 * @author mmanjul1
 *
 */
public class TestMissingNumber {

	@Test
	public void testNumberNotPresentInArray() throws NoMissingNumberFoundException {
		int array[] = {3, 0, 1};
		assertEquals(2, MissingNumber.calFinder(array));
	}

	@Test(expected = NoMissingNumberFoundException.class)
	public void testMissingNumberWithNoMissingNumber() throws NoMissingNumberFoundException {
		int[] array = { 9, 7, 5, 3, 6, 8, 1, 0, 2, 4 };
		MissingNumber.calFinder(array);
	}

}
