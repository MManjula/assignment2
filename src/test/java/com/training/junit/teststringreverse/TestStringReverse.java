package com.training.junit.teststringreverse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.stringreverse.StringReverse;
import com.training.junit.stringreverse.myexception.InvalidStringException;

/**
 * 
 * @author MManjula
 *
 */
public class TestStringReverse {
	/**
	 * tests if the output is in reversed form of the input string
	 * 
	 * @throws InvalidStringException
	 */
	@Test
	public void testStringReverseWithValidInput() throws InvalidStringException {
		String expected = "s'teL ekat edoCteeL tsetnoc";
		assertEquals(expected, StringReverse.reverse("Let's take LeetCode contest"));
	}

	/**
	 * 
	 * @throws InvalidStringException if the string passed by the user is empty
	 */
	@Test(expected = InvalidStringException.class)
	public void testStringReverseWithInvalidInput() throws InvalidStringException {
		StringReverse.reverse("");
	}

}
