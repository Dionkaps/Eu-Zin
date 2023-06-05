package com.ceid.EuzinApp;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ConfirmationPage {

	public static void showPurchase(ArrayList<Object[]> productList) {
		HashSet<String> uniqueProducts = new HashSet<>();
		NumberFormat formatter = new DecimalFormat("#0.0"); 
        double totalPrice = 0.0;

        System.out.println("\n~~Products in your Cart~~");
        for (Object[] product : productList) {
            String name = (String) product[0];
            int amount = (int) product[1];
            double price = (double) product[2];

            
            totalPrice += (price * amount);

          
            if (!uniqueProducts.contains(name)) {
                uniqueProducts.add(name);
                System.out.println(name);
                System.out.println();
            }
        }

        System.out.println("Total Price: $" + formatter.format(totalPrice));
        
        approve(totalPrice);
    }
	
	public static void approve(double totalPrice) {
		Scanner answer = new Scanner(System.in);  
		System.out.println("\nDo you want to proceed to the payment? (y/n)");
		String userAnswer = answer.nextLine();
		
		if(userAnswer.equals("y")) {
			CouponPage.pay(totalPrice);
		}
		else {
			ShopsAndProducts.getShopData();
		}
	}
	
}
