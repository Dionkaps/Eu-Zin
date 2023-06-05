package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.Scanner;

public class NutritionistSelectPage {

	public static void showNutrSelectPage(ArrayList<String> names) {
		System.out.println("\nSelect a nutritionist to review by typing its corresponding number:");
		
		int counter =0;
		
		for (String nutName : names) {
			
            System.out.println(counter + ". " + nutName);
            counter++;
            
        }
		selectNutr(names);
	}
	
	public static void selectNutr(ArrayList<String> names) {
		Scanner choice = new Scanner(System.in);
		int nameChoice = choice.nextInt();
		
		String selectedNutName = names.get(nameChoice);
		
		User.checkAppointments(selectedNutName);
	}
	
}
