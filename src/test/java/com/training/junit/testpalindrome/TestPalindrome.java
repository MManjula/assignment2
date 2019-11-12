package com.training.junit.testpalindrome;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.training.junit.Palindrome.Palindrome;

public class TestPalindrome {
	private Palindrome<Object> number;

	@Before
	public void setUp() {
		number = new Palindrome<Object>();
	}

	@Test
	public void testPalindrome() {
		String[] inputs = { "1001", "100", "Madam", "234", "Manjula" };
		String[] expected = {"1001", "Madam" };
		assertArrayEquals(expected, number.callPalindrome(inputs));
	}

}
