package com.ceid.EuzinApp;

import java.util.Scanner;

public class TopUpBalancePage {
	
	public static void showUpdateBalance(double totalPrice) {
		System.out.println("\nYour current balance isn't enough to complete the payment");
		System.out.println("\nPlease top up your balance");
		
		addAmount(totalPrice);
	}
	
	public static void addAmount(double totalPrice) {
		
		Scanner topUp = new Scanner(System.in);  
		System.out.println("\nType the amount of money you want to add to your current balance:");
		int amount = topUp.nextInt();
		
		User.updateBalance(totalPrice,amount);
		
	}
}
