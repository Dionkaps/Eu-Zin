package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class DaySelectionPage {

	public static void showCalendar(ArrayList<Map<String, ArrayList<String>>> schedule, String nutName) {
		 
		System.out.println("\nSelect a day to make an appointment by typing the corresponding number:");
        System.out.println("0. Monday");
        System.out.println("1. Tuesday");
        System.out.println("2. Wednesday");
        System.out.println("3. Thursday");
        System.out.println("4. Friday");
        System.out.println("5. Saturday");
        System.out.println("6. Sunday");
		
		selectDate(schedule, nutName);
		
	}
	
	public static void selectDate(ArrayList<Map<String, ArrayList<String>>> schedule, String nutName) {
		Scanner answer = new Scanner(System.in); 
		int userAnswer = answer.nextInt();
		
		Nutritionist.checkAvailableDates(schedule, userAnswer, nutName);
	}
	
}
