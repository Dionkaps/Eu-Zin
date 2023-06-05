package com.ceid.EuzinApp;
import java.util.ArrayList;

public class CouponCode {
	
	public static void checkCode(String coupoCode, double totalPrice) {
		ArrayList<String> couponCodes;
		couponCodes = EuZin.couponCodes;
		if (couponCodes.contains(coupoCode)) {
            User.calculateCost(totalPrice);
        } else {
            showError(totalPrice);
        }
	}
	
	public static void showError(double totalPrice) {
		System.out.println("\nThe coupon code you inserted is invalid!");
		CouponPage.showDiscPage(totalPrice);
	}
}
