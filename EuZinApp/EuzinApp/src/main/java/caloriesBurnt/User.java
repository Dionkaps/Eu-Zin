package caloriesBurnt;

public class User {
	
	double totalCalories;
	
	public User(double totalCalories) {
		super();
		this.totalCalories = totalCalories;
	}

	public static void calculateCal(double caloriesBurnt, Activities act, int timeSpent) {
		double totCaloriesBurned = (caloriesBurnt * timeSpent)/60;
		updateDailyList();
	}
	
	public static void updateDailyList() {
		getCalBurnt();
	}
	
	public static void getCalBurnt() {
		CaloriesBurntPage.showCalBurnt();
	}

}
