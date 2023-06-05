package com.ceid.EuzinApp;

import java.util.Scanner;

public class CouponPage {
	
	public static void pay(double totalPrice) {
		User.checkBalance(totalPrice);
	}

	public static void showDiscPage(double totalPrice) {
		System.out.println("\nDo you have a coupon code? (y/n)");
		
		chooseDiscount(totalPrice);
	}
	
	public static void chooseDiscount(double totalPrice) {
		Scanner answer = new Scanner(System.in);  
		String userAnswer = answer.nextLine();
		
		if(userAnswer.equals("y")) {
			InputCodePage.showInputCode(totalPrice);
		}
		else {
			User.calculateBalance(totalPrice);
		}
	}
	
}
