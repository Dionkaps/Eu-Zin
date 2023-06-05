package com.ceid.EuzinApp;

import java.util.ArrayList;

public class ProductsPage {

	public static void showAvailProducts(String shopName,ArrayList<Object[]> productsAndPrices) {
		int counter = 0;
		
		System.out.println("Products and Prices for " + shopName + "\n");
        for (Object[] productAndPrice : productsAndPrices) {
            String productName = (String) productAndPrice[0];
            double price = (double) productAndPrice[1];
            System.out.println(counter+".\n"+"Product: " + productName);
            System.out.println("Price: $" + price);
            System.out.println();
            counter++;
        }
        
        User.addToCart(shopName,productsAndPrices);
	}
	
}
