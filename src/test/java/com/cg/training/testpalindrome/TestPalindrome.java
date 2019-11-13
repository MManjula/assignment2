package com.cg.training.testpalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.training.palindrome.Palindrome;

public class TestPalindrome {

	@Test
	public void testPalindromeForPositiveInteger() {
		assertEquals(true, Palindrome.checkPalindrome(101));
	}

	@Test
	public void testPalindromeForNegativeInteger() {
		assertEquals(false, Palindrome.checkPalindrome(-121));
	}

	@Test
	public void testPalindromeForZero() {
		assertEquals(false, Palindrome.checkPalindrome(10));
	}

}
