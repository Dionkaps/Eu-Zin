package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nutritionist {

	String name;
	String email;
	String bio;
	int phone;
	ArrayList<Map<String, ArrayList<String>>> schedule = new ArrayList<>();
	ArrayList<Review> reviews = new ArrayList<>();
	
	public Nutritionist(String name, String email, String bio, int phone,
			ArrayList<Map<String, ArrayList<String>>> schedule, ArrayList<Review> reviews) {
		super();
		this.name = name;
		this.email = email;
		this.bio = bio;
		this.phone = phone;
		this.schedule = schedule;
		this.reviews = reviews;
	}

	public static void getNutrNames(int flag) {
		ArrayList<String> names = new ArrayList<>();
		
		for (Nutritionist nutritionist : EuZin.nutritionists) {
			String name = nutritionist.name;
			names.add(name);
		}
		if(flag == 0) {
			System.out.print("Choose the action you want to do next by typing the corresponding number: \n1. Create an appointment with a Nutritionist \n2. Review a Nutritionist");
			
			Scanner action = new Scanner(System.in);  
			int choice = action.nextInt();
			
			if(choice == 1) { //Usecase Rantevou me diatrofologo
				NutritionistsPage.showNutrPage(names);
			}
			else if(choice == 2) { //Usecase Nutritionist Rating
				NutritionistSelectPage.showNutrSelectPage(names);
			}
			else {
				System.out.println("You made a typo");
			}
		}
		else if(flag == 1) {
			NutritionistsPage.showNutrPage(names);
		}
		else if(flag == 2) {
			NutritionistSelectPage.showNutrSelectPage(names);
		}
		
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
		Nutritionist.getNutrNames(1);
	}
	
	
	public static void updateNutrRating(String selectedNut, String comment, int rating) {
		ArrayList<Review> reviews = new ArrayList<>();
		reviews.add(new Review(comment, rating));
		Nutritionist targetNutritionist = null;
		
		for (Nutritionist nutritionist : EuZin.nutritionists) {
		    if (nutritionist.name.equals(selectedNut)) {
		        nutritionist.reviews.addAll(reviews);
		        break;
		    }
		}
		
		for (Nutritionist nutritionist : EuZin.nutritionists) {
		    if (nutritionist.name.equals(selectedNut)) {
		        targetNutritionist = nutritionist;
		        break;
		    }
		}

		if (targetNutritionist != null) {
		    ArrayList<Review> nutReviews = targetNutritionist.reviews;
		    System.out.println("\nRecent reviews and ratings for " + selectedNut + "\n");
		    for (Review review : nutReviews) {
		        System.out.println(review.comment + " " + review.rating +"/5");
		    }
		} else {
		    System.out.println("Nutritionist not found.");
		}
	}
}
