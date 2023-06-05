package com.ceid.EuzinApp;
import java.util.ArrayList;
import java.util.Scanner;

public class NutritionistsPage {
	
	public static void selectNutritionist(ArrayList<String> names) {
		
		Scanner choice = new Scanner(System.in);
		int nameChoice = choice.nextInt();
		
		String selectedNutName = names.get(nameChoice);
		
		Nutritionist.getNutrInfo(selectedNutName);
		
	}
	
	public static void showNutrPage(ArrayList<String> names) {
		
		System.out.println("\nSelect a nutritionist from below by typing the corresponding number:");
		
		int counter =0;
		
		for (String nutName : names) {
			
            System.out.println(counter + ". " + nutName);
            counter++;
            
        }
		
		selectNutritionist(names);
		
	}
}
