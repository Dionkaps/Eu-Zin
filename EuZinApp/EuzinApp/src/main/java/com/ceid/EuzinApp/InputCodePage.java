package com.ceid.EuzinApp;

import java.util.Scanner;

public class InputCodePage {

	public static void showInputCode(double totalPrice) {
		System.out.print("\nPlease insert your coupon code:");
		
		inputCode(totalPrice);
	}
	
	public static void inputCode(double totalPrice) {
		Scanner coupon = new Scanner(System.in);  
		String couponCode = coupon.nextLine();
		
		CouponCode.checkCode(couponCode,totalPrice);
	}
}
