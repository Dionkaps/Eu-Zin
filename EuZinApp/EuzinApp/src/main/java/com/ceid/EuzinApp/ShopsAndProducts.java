package com.ceid.EuzinApp;
import java.util.ArrayList;

import java.util.HashSet;

public class ShopsAndProducts {

	public static void getShopData() {
		
		HashSet<String> uniqueShopNames = new HashSet<>();
		//Extract unique shop names
        for (Object[] item : EuZin.shopInventory) {
            String shopName = (String) item[0];
            uniqueShopNames.add(shopName);
        }
        
        User.getBalance(uniqueShopNames);
	}
	
	public static void getProdData(String shopName) {
		ArrayList<Object[]> productsAndPrices = new ArrayList<>();
		
		for (Object[] item : EuZin.shopInventory) {
            String sName = (String) item[0];
            if (sName.equals(shopName)) {
                String productName = (String) item[1];
                double price = (double) item[2];
                productsAndPrices.add(new Object[]{productName, price});
            }
        }
        
        ProductsPage.showAvailProducts(shopName,productsAndPrices);
	}
	
}
