package com.ceid.EuzinApp;

import java.util.ArrayList;

public class Form {

	public static void checkForm(ArrayList<Object[]> productList,String formName, String formSurname, String formAddress, String formPostCode) {
		if(formName instanceof String && formSurname instanceof String && formAddress instanceof String && formPostCode instanceof String) {
			User.getCartData(productList);
		}
		else {
			Form.showError(productList);
		}
	}
	
	public static void showError(ArrayList<Object[]> productList) {
		System.out.println("\nThe info you provided is invalid. Please try again");
		FormPage.showForm(productList);
	}
	
}
