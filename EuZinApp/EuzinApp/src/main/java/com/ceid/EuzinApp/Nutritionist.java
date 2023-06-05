package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Nutritionist {

	String name;
	String email;
	String bio;
	int phone;
	ArrayList<Map<String, ArrayList<String>>> schedule = new ArrayList<>();
	
	public Nutritionist(String name, String email, String bio, int phone,
			ArrayList<Map<String, ArrayList<String>>> schedule) {
		super();
		this.name = name;
		this.email = email;
		this.bio = bio;
		this.phone = phone;
		this.schedule = schedule;
	}

	public static void getNutrNames() {
		ArrayList<String> names = new ArrayList<>();
		
		for (Nutritionist nutritionist : EuZin.nutritionists) {
			String name = nutritionist.name;
			names.add(name);
		}
		
		NutritionistsPage.showNutrPage(names);
	}

	public static void getNutrInfo() {
		
	}
	
	public static void checkAvailableDates(ArrayList<Map<String, ArrayList<String>>> schedule, int userAnswer, String nutName) {
		String searchDay;
		if(userAnswer == 0) {searchDay = "Monday"; getAvailTime(schedule, searchDay, nutName);}
		else if(userAnswer == 1) {searchDay = "Tuesday"; getAvailTime(schedule, searchDay, nutName);}
		else if(userAnswer == 2) {searchDay = "Wednesday"; getAvailTime(schedule, searchDay, nutName);}
		else if(userAnswer == 3) {searchDay = "Thursday"; getAvailTime(schedule, searchDay, nutName);}
		else if(userAnswer == 4) {searchDay = "Friday"; getAvailTime(schedule, searchDay, nutName);}
		else if(userAnswer == 5) {searchDay = "Saturday"; getAvailTime(schedule, searchDay, nutName);}
		else if(userAnswer == 6) {searchDay = "Sunday"; getAvailTime(schedule, searchDay, nutName);}
		else {System.out.println("You made a typo");}
	}

	public static void getAvailTime(ArrayList<Map<String, ArrayList<String>>> schedule, String searchDay, String nutName) {
		boolean found = false;
		for (Map<String, ArrayList<String>> daySchedule : schedule) {
	        //Check if the current day matches the search day
	        if (daySchedule.containsKey(searchDay)) {
	            ArrayList<String> hours = daySchedule.get(searchDay);

	            HourSelectionPage.showHourSelectPage(searchDay,hours, nutName);
	            found = true;
	        }
	    }
		//Enallaktiki Roi 2
		if(found == false){
        	showError();
        }
		
	}
	
	public static void showError() {
		System.out.println("No room for appointment found for the specific day :(");
		Nutritionist.getNutrNames();
	}
}
