package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Scanner;

public class ActivitiesPage {
	
	public static void showActList(ArrayList<Activities> ActDetails) {
		System.out.println("\n~~Activities Lists~~\n");
		int counter = 0;
		//Print the activities
		 for (Activities activity1 : ActDetails) {
		     System.out.println(counter + ". " +"Name: " + activity1.name + ", Calories per hour: " + activity1.caloriesBurnt);
		     counter++;
		 }
		 chooseAct(ActDetails);
	}
	
	public static void chooseAct(ArrayList<Activities> ActDetails) {
		System.out.println("\nChoose an activity from the above (by typing the corresponding number)");
		Scanner answer = new Scanner(System.in);
        int inputAnswer = answer.nextInt();
        
        Activities act;
        
        act = ActDetails.get(inputAnswer);
        
        TimePage.showTimeSpent(act);
	}

}
