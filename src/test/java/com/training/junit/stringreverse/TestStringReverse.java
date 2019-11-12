package com.training.junit.stringreverse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.stringreverse.myexception.InvalidStringException;
import com.training.junit.teststringreverse.StringReverse;

public class TestStringReverse {

	@Test
	public void testStringReverseWithValidInput() throws InvalidStringException {
		String expected = "s'teL ekat edoCteeL tsetnoc";
		assertEquals(expected, StringReverse.reverse("Let's take LeetCode contest"));
	}

	@Test(expected = InvalidStringException.class)
	public void testStringReverseWithInvalidInput() throws InvalidStringException {
		StringReverse.reverse("");
	}

}
