package com.ceid.EuzinApp;
import java.util.Scanner;

public class BookingConfiPage {

	public static void showConfirmPage(String appTime, String nutName, String searchDay) {
		System.out.println("\nAre you sure you want to make an appointment with " + nutName + " this " + searchDay + " at " + appTime + "? (y/n)");
		makeAppointment(appTime,nutName,searchDay);
	}
	
	public static void makeAppointment(String appTime, String nutName, String searchDay) {
		Scanner answer = new Scanner(System.in);  
		String userAnswer = answer.nextLine();
		
		if(userAnswer.equals("y")) {
			User.addAppointment(appTime,nutName,searchDay);
		}
		else if(userAnswer.equals("n")) {
			Nutritionist.getNutrNames();
		}
		else {
			System.out.println("You made a typo");
		}
	}
	
}
