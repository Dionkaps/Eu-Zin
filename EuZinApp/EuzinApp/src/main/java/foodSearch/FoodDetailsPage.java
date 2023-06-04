package foodSearch;

import java.util.Scanner;

public class FoodDetailsPage {
	
	public static void showFoodDetails(String name, double calories, double carbs, double fat, double protein) {
		System.out.println("\nName: " + name);
        System.out.println("Calories (kcal): " + calories);
        System.out.println("Total Fat (g): " + fat);
        System.out.println("Protein (g): " + protein);
        System.out.println("Total Carbohydrates (g): " + carbs);
        
        insertSelection(name,calories,fat,protein,carbs);
	}
	
	public static void insertSelection(String name, double calories, double carbs, double fat, double protein) {
		Scanner useAnswer = new Scanner(System.in);  
		System.out.println("\nDo you want to add this food to DailyMeals? (y/n)");
		String answer = useAnswer.nextLine();
		
		checkSelection(name,calories,fat,protein,carbs,answer);
	}

	
	public static void checkSelection(String name, double calories, double carbs, double fat, double protein,String answer) {
		
		if(answer.equals("y")) {
			FoodList.getFoodData1(name,calories,fat,protein,carbs);
		}
		else if(answer.equals("n")) {
			User.getLists();
		}
		else {
			System.out.println("You made a typo restart the program");
		}
	}
}
