package com.ceid.EuzinApp;

import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class ActInputPage {
	
	public static void showInputPage() throws ParseException {
		System.out.println("Insert the name of the activity you want to search for:");
		
		inputActivity();
	}
	
	public static void inputActivity() throws ParseException {
		Scanner activity = new Scanner(System.in);
        String inputActivity = activity.nextLine();
        
        CaloriesBurntAPI.checkAct(inputActivity);
	}
	
	public static void showError() {
		System.out.println("\nThe activity you searched for does not exist\n");
		ActCreatePage.showCreateAct();
	}
}
