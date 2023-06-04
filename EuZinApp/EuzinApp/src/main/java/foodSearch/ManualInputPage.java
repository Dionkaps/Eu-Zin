package foodSearch;

import java.util.Scanner;

public class ManualInputPage {
	
	public static void showManualAdd() {
		
		System.out.println("Please insert the food details yourself:\n");
		
		getManFood();
	}
	
	public static void getManFood() {
		Scanner nameInput = new Scanner(System.in);  
		System.out.println("Type the name of the food you want to add:");
		String name = nameInput.nextLine();
		
		Scanner calInput = new Scanner(System.in);  
		System.out.println("Type the calories of this food:");
		double calories = calInput.nextDouble();
		
		Scanner fatInput = new Scanner(System.in);  
		System.out.println("Type the fat of this food:");
		double fat = fatInput.nextDouble();
		
		Scanner carbsInput = new Scanner(System.in);  
		System.out.println("Type the carbs of this food:");
		double carbs = carbsInput.nextDouble();
		
		Scanner proteinInput = new Scanner(System.in);  
		System.out.println("Type the protein of this food:");
		double protein = proteinInput.nextDouble();
		
		FoodList.saveFood(name, calories, carbs, fat, protein);
	}
}
