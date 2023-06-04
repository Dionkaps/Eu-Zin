package foodSearch;

import java.util.ArrayList;

public class FoodList {
	
	String name;
	double calories;
	double carbs;
	double fat;
	double protein;

	public FoodList(String name, double calories, double carbs, double fat, double protein) {
		super();
		this.name = name;
		this.calories = calories;
		this.carbs = carbs;
		this.fat = fat;
		this.protein = protein;
	}

	public static void saveFood(String name, double calories, double carbs, double fat, double protein) {
		
		ArrayList<FoodList> FoodDetails = new ArrayList();
		FoodDetails.add(new FoodList(name, calories, carbs, fat, protein));
		getFoodDetails(FoodDetails);
	}
	
	public static void getFoodDetails(ArrayList<FoodList> FoodDetails) {
		for (FoodList food : FoodDetails) {
		    String name = food.name;
		    double calories = food.calories;
		    double carbs = food.carbs;
		    double fat = food.fat;
		    double protein = food.protein;
		    
		    FoodDetailsPage.showFoodDetails(name,calories,carbs,fat,protein);
		}
	}
	
	public static void getFoodData1(String name, double calories, double carbs, double fat, double protein) {
		User.addFoodDailyMeals(name,calories,carbs,fat,protein);
	}
	
	public static void getFoodData2(double calories, double carbs, double fat, double protein) {
		
		User user = FoodSearchPage.testUser;
		
		//update user Calories
		double currentCalories = user.totCalories;
		double updatedCalories = currentCalories + calories;		
		
		//update user Carbs
		double currentCarbs = user.totCarbs;
		double updatedCarbs = currentCarbs + carbs;
		
		//update user Fat
		double currentFat = user.totFat;
		double updatedFat = currentFat + fat;
				
		//update user Protein
		double currentProtein = user.totProtein;
		double updatedProtein = currentProtein + protein;
		
		
		User.addFoodDailyCons(updatedCalories, updatedCarbs, updatedFat, updatedProtein);
	}
}
