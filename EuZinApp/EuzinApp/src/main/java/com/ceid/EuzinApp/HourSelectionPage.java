package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Scanner;

public class HourSelectionPage {

	public static void showHourSelectPage(String searchDay,ArrayList<String> hours, String nutName) {
		int counter = 0;
		 System.out.println("\nHours for " + searchDay + "\n");
		 for (String time : hours) {
	            System.out.println(counter + ". " + time);
	            counter++;
	        }
		 
		 selectTime(hours, nutName, searchDay);
	}
	
	public static void selectTime(ArrayList<String> hours, String nutName,String searchDay) {
		Scanner answer = new Scanner(System.in);  
		System.out.println("\nChoose a specific time by typing the corresponding number:");
		int userAnswer = answer.nextInt();
		
		String appTime = hours.get(userAnswer);
		
		BookingConfiPage.showConfirmPage(appTime, nutName, searchDay);
	}
	
}
