package com.ceid.EuzinApp;

import java.util.Scanner;
import java.util.ArrayList;import java.util.ArrayList;


public class ActCreatePage {
	
	public static void showCreateAct() {
		System.out.println("Please insert the data of the activity below");
		
		inputActData();
	}
	
	public static void inputActData() {
		System.out.println("\nType the name of the activity:");
		Scanner name = new Scanner(System.in);
        String inputName = name.nextLine();
        
        System.out.println("\nType the calories burnt per hour doing the activity:");
		Scanner calories = new Scanner(System.in);
        int inputCalories = calories.nextInt();
        
        ArrayList<Activities> activities = new ArrayList();
        activities.add(new Activities(inputName,inputCalories));
        
        Activities.saveActivity(activities);
	}
}
