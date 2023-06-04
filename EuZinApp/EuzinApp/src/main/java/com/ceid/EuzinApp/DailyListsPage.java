package com.ceid.EuzinApp;
import java.util.ArrayList;

import com.ceid.EuzinApp.User;

public class DailyListsPage {

	public static void showLists(ArrayList<FoodList> foodList) {
		int counter = 1;
		System.out.println("\n~~~DailyMeals List~~~\n");
		for (FoodList food : foodList) {
		    String name = food.name;
		    double calories = food.calories;
		    double carbs = food.carbs;
		    double fat = food.fat;
		    double protein = food.protein;

		    System.out.println("~~Meal " + counter + "~~\n");
		    System.out.println("Name: " + name);
		    System.out.println("Calories: " + calories);
		    System.out.println("Carbs: " + carbs);
		    System.out.println("Fat: " + fat);
		    System.out.println("Protein: " + protein + "\n");
		    
		    counter++;
		}
		User user = EuZin.testUser;
		
		System.out.println("\nSo far you have consumed:");
		System.out.println("\nCalories (kcal): " + user.totCalories + "\nCarbs (g): " + user.totCarbs + "\nFat (g): " + user.totFat + "\nProtein (g): " + user.totProtein + " " );
	}
	
}
