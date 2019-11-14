package com.training.junit.testnameoccurence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.nameoccurence.NameOccurence;
import com.training.junit.nameoccurence.myexception.NoSuchElementFoundException;

/**
 * 
 * @author MManjula
 *
 */
public class TestNameOccurence {
	/**
	 * user defined array of string
	 */
	private String[] input = { "Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan",
			"Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller",
			"Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson" };

	/**
	 * 
	 * test for counting the occurrence of the valid input in the array of string
	 */
	@Test
	public void testNameOccurrenceWithValidInput() throws NoSuchElementFoundException {
		assertEquals(2, NameOccurence.findOccurence(input, "Sam"));
	}

	/**
	 * 
	 * @throws NoSuchElementFoundException if the input is invalid
	 */
	@Test(expected = NoSuchElementFoundException.class)
	public void testNameOccurenceWithInvalidInput() throws NoSuchElementFoundException {
		NameOccurence.findOccurence(input, "Drake");
	}

}
