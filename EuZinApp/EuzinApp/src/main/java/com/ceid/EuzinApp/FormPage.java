package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Scanner;

public class FormPage {

	public static void showForm(ArrayList<Object[]> productList) {
		System.out.println("\nPlease insert your name:");
		Scanner name = new Scanner(System.in);  
		String formName = name.nextLine();
		
		System.out.println("\nPlease insert your surname:");
		Scanner surname = new Scanner(System.in);  
		String formSurname = surname.nextLine();
		
		System.out.println("\nPlease insert your address:");
		Scanner address = new Scanner(System.in);  
		String formAddress = address.nextLine();
		
		System.out.println("\nPlease insert your postal code:");
		Scanner postCode = new Scanner(System.in);  
		String formPostCode = postCode.nextLine();
		
		Form.checkForm(productList,formName,formSurname,formAddress,formPostCode);
	}
	
	public static void filForm() {
		
	}
	
}
