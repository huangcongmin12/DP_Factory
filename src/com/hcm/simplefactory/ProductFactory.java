package com.hcm.simplefactory;

public class ProductFactory {

	public static Product createProduct(String productName) {
		if (productName == "ProductA") {
			return new ProductA();
		}
		if (productName == "ProductB") {
			return new ProductB();
		}
		return null;
	}

}
