package com.ceid.EuzinApp;

import java.util.ArrayList;

public class Activities {
	
	String name;
	double caloriesBurnt;
	
	public Activities(String name, double caloriesBurnt) {
		super();
		this.name = name;
		this.caloriesBurnt = caloriesBurnt;
	}

	

	public static void saveActivity(ArrayList<Activities> ActDetails) {
		Activities.getAct(ActDetails);
	}
	
	public static void getAct(ArrayList<Activities> ActDetails) {
		ActivitiesPage.showActList(ActDetails);
	}
	
	public static void getCalPerHour(Activities act, int timeSpent) {
		double cal = act.caloriesBurnt;
		
		User.calculateCal(cal,act,timeSpent);
	}
}
