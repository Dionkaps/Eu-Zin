package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class NutritionistInfoPage {

	public static void showNutrInfoPage(String nutName,String name, String email,String bio, int phone, ArrayList<Map<String, ArrayList<String>>> schedule) {
		
	    
	    
	    System.out.println("\nName: " + name);
	    System.out.println("Email: " + email);
	    System.out.println("Bio: " + bio);
	    System.out.println("Phone: " + phone);
	    
	    insertSelection(schedule,nutName);
	}
	
	public static void insertSelection(ArrayList<Map<String, ArrayList<String>>> schedule, String nutName) {
		Scanner answer = new Scanner(System.in);  
		System.out.println("\nDo you want to create an appointment with this Nutritionist?(y/n):");
		String userAnswer = answer.nextLine();
		
		if(userAnswer.equals("y")) {
			
			DaySelectionPage.showCalendar(schedule,nutName);
			
		}
		else if(userAnswer.equals("n")) { //Enallaktiki Roi 1
			
			Nutritionist.getNutrNames(1);			
		}
		else {
			System.out.println("You made a typo");
		}
		
		
	}
}
