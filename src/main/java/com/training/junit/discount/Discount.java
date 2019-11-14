package com.training.junit.discount;
/**
 * 
 * @author MManjula
 *
 */
public class Discount {
/**
 * 
 * @param newItem price which is a calculated discounted price
 * @return  new price which is a calculated discounted price
 */
	public static double calNewItemPrice(int newItem) {
		double discount = 0.35 * newItem;
		double newItemPrice = newItem - discount;
		return newItemPrice;
	}

}
