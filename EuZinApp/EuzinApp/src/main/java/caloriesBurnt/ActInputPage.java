package caloriesBurnt;

import java.util.Scanner;

public class ActInputPage {

	public static void main(String[] args) {
		showInputPage();

	}
	
	public static void showInputPage() {
		System.out.println("Insert an the name of the activity you want to search for");
		
		inputActivity();
	}
	
	public static void inputActivity() {
		Scanner activity = new Scanner(System.in);
        String inputActivity = activity.nextLine();
        
        CaloriesBurntAPI.checkAct(inputActivity);
	}
	
	public void showError() {
		
	}
}
