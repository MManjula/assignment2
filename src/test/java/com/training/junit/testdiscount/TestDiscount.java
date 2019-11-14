package com.training.junit.testdiscount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.training.junit.discount.Discount;

/**
 * 
 * @author MManjula
 *
 */
public class TestDiscount {
	/**
	 * tests for correct output
	 */
	@Test
	public void testNewItemPrice() {
		assertEquals(91000, Discount.calNewItemPrice(140000), 0.02);
	}

	/**
	 * tests for incorrect output
	 */
	@Test
	public void testIncorrectNewPrice() {
		assertNotEquals(18000, Discount.calNewItemPrice(140000), 0.02);
	}

}
