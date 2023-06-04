package foodSearch;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.ArrayList;

public class FoodSearchPage {
	
	public static User testUser; // Declare testUser as a public static variable
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ArrayList<FoodList> foodList = new ArrayList<>();
		
		foodList.add(new FoodList("apple", 12, 32, 1, 2));
		foodList.add(new FoodList("tost", 122, 50, 17, 26));
		foodList.add(new FoodList("tsoureki", 312, 35, 11, 32));
		foodList.add(new FoodList("yogurt", 122, 60, 12, 12));
		
		testUser = new User(foodList,568.0,177.0,65.0,72.0);
		getFood();
	}
	
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
