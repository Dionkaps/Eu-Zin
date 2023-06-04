package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Scanner;

public class TimePage {

	public static void showTimeSpent(Activities act) {
		System.out.println("\nType the time in minutes you spent doing this activity:");
		
		inputTime(act);
	}
	
	public static void inputTime(Activities act) {
		Scanner answer = new Scanner(System.in);
        int inputAnswer = answer.nextInt();
        
        Activities.getCalPerHour(act,inputAnswer);
	}
}
