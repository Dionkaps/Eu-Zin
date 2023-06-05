package com.ceid.EuzinApp;
import java.util.*; 


public abstract class GymRegistrationPage{
	
	public static String[] ProgramsFetched = new String[5];  	
	public static int choice ; 
	
	public static Scanner sc = new Scanner(System.in);  // Create a Scanner object


public static void showRegPage() {
	
	
	
	System.out.println("Gym registration page");
	System.out.printf("\n\n");
	System.out.println("Gym programs: ");
	
	
	
	//print the programs
	for(int i = 0 ; i <5 ; i++) {
					
		System.out.printf("\n%d)%s",i+1,ProgramsFetched[i]);
				
	}
	
	System.out.printf("\n\n\n");
	
	System.out.printf("Select a program: ");
	

	

	select_progr();
	

	
	
	
	
}







public static void select_progr() {
	
	//The user selects a program
	
	
	choice = sc.nextInt();	
	
	Gym.getSuitableGyms();
	
}


}




