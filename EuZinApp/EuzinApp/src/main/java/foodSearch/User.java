package foodSearch;
import java.util.ArrayList;

public class User {
	
	ArrayList<FoodList> foodList = new ArrayList();
	double totCalories;
	double totCarbs;
	double totFat;
	double totProtein;
	
	public User(ArrayList<FoodList> foodList, double totCalories, double totCarbs, double totFat, double totProtein) {
		super();
		this.foodList = foodList;
		this.totCalories = totCalories;
		this.totCarbs = totCarbs;
		this.totFat = totFat;
		this.totProtein = totProtein;
	}
	
	
	
	public static void addFoodDailyMeals(String name, double calories, double carbs, double fat, double protein) {
		User user = FoodSearchPage.testUser;
		user.foodList.add(new FoodList(name,calories,carbs,fat,protein));
		
		FoodList.getFoodData2(calories,carbs,fat,protein);
	}
	
	public static void addFoodDailyCons(double calories, double carbs, double fat, double protein) {
		User user = FoodSearchPage.testUser;
		user.totCalories = calories;
		user.totCarbs = carbs;
		user.totFat = fat;
		user.totProtein = protein;
		
		ArrayList<FoodList> foodList1 = new ArrayList();
		foodList1 = user.foodList;
		
		DailyListsPage.showLists(foodList1);
	}
	
	public static void getLists() {
		
		ArrayList<FoodList> foodList1 = new ArrayList();
		foodList1 = FoodSearchPage.testUser.foodList;
		
		DailyListsPage.showLists(foodList1);
	}
}
