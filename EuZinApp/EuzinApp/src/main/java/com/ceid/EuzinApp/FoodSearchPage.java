package com.ceid.EuzinApp;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import com.ceid.EuzinApp.User;

import java.util.ArrayList;

public class FoodSearchPage {
	
	public static void getFood() {
		Scanner foodInput = new Scanner(System.in);
		System.out.println("Type the name of the food you want to search for:");
		String food = foodInput.nextLine();
		
		Scanner amountInput = new Scanner(System.in);
		System.out.println("Type the number of grams of " + food + " you want to search for:");
		String amount = amountInput.nextLine();
		
		String query = amount + "g " + food;
		
		NutritionAPI.searchFood(query);
	}
}
