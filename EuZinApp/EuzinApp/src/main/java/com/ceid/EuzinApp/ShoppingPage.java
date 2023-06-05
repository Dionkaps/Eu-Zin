package com.ceid.EuzinApp;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class ShoppingPage {
	
	public static void showShopList(HashSet<String> uniqueShopNames, double balance) {
		int counter =0;
        System.out.println("\n~~Shops:~~\n");
        for (String shopName : uniqueShopNames) {
            System.out.println(counter + ". " + shopName);
            counter++;
        }
        System.out.println("\nYour current balance is: " + balance + "\n");
        
        chooseShop(uniqueShopNames);
	}
	
	public static void chooseShop(HashSet<String> uniqueShopNames) {
		Scanner shopInput = new Scanner(System.in);  
		System.out.println("\nChoose a shop by typing its corresponding number: ");
		int shop = shopInput.nextInt();
		ArrayList<String> shopNamesList = new ArrayList<>(uniqueShopNames);
		String shopName = shopNamesList.get(shop);
		
		ShopsAndProducts.getProdData(shopName);
	}
}
