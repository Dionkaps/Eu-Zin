package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutPage {
	
	public static void showConfirm(ArrayList<Object[]> productList) {
		System.out.println("\nDo you want to checkout?(y/n)");
		confirm(productList);
	}
	
	public static void confirm(ArrayList<Object[]> productList) {
		Scanner answer = new Scanner(System.in);  
		String userAnswer = answer.nextLine();
		
		if(userAnswer.equals("y")) {
			FormPage.showForm(productList);
		}
		else if(userAnswer.equals("n")) {
			showConfirm(productList);
		}
	}
}
