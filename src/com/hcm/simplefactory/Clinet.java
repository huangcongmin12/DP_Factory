package com.hcm.simplefactory;

public class Clinet {
	
	public static void main(String[] args) {
		Product product = ProductFactory.createProduct("ProductB");
		product.function();
	}
}
