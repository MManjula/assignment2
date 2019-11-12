package com.training.junit.discount;

public class Discount {

	public static double calNewItemPrice(int newItem) {
		double discount = 0.35 * newItem;
		double newItemPrice = newItem - discount;
		return newItemPrice;
	}

}
