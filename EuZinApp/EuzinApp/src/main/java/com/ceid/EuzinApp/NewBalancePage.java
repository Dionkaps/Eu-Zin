package com.ceid.EuzinApp;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NewBalancePage {

	public static void showNewBalance() {
		User user = EuZin.testUser;
		NumberFormat formatter = new DecimalFormat("#0.0");   
		System.out.println("\nYour new balance is: " + formatter.format(user.balance) );
	}
	
}
