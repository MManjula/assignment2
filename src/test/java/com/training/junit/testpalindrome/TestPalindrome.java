package com.training.junit.testpalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.junit.palindrome.Palindrome;

/**
 * 
 * @author MManjula
 *
 */
public class TestPalindrome {
	/**
	 * test for checking correct palindrome
	 */
	@Test
	public void testPalindromeForPositiveInteger() {
		assertEquals(true, Palindrome.checkPalindrome(101));
	}

	/**
	 * test for checking palindrome if the input is negative integer
	 */
	@Test
	public void testPalindromeForNegativeInteger() {
		assertEquals(false, Palindrome.checkPalindrome(-121));
	}

	/**
	 * test for checking palindrome if the input is an integer containing 0
	 */
	@Test
	public void testPalindromeForZero() {
		assertEquals(false, Palindrome.checkPalindrome(10));
	}

}
