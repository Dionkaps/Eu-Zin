package com.ceid.EuzinApp;
import java.util.*; 


public abstract class SubscriptionPage{
	
	
	public static Scanner sc = new Scanner(System.in);  // Create a Scanner object
	public static int dur_choice;
	public static int sub_cost ; 
	
	
	public static void showSelectSub() {
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		
		System.out.printf("Subscription page \n\n");
		System.out.printf("Available choices for the subscription's duration: ");
		System.out.printf("\n1)One week (%d€)",GymInfoPage.gym_price/4);
		System.out.printf("\n2)One month (%d€)",GymInfoPage.gym_price);
		System.out.printf("\n3)One year (%d€)",GymInfoPage.gym_price*12);
		
		System.out.printf("\n\nSelect the duration of your subscription to %s: ",GymInfoPage.gym_name);
	
		select_duration();
	}

	
	
	

public static void select_duration() {
	
	dur_choice = sc.nextInt();
	
	
	
	if(dur_choice == 1)
	{
		
		sub_cost = (GymInfoPage.gym_price)/4;
	}
	
	if(dur_choice == 2)
	{
		
		sub_cost = (GymInfoPage.gym_price);
	}
	if(dur_choice == 3)
	{
		
		sub_cost = (GymInfoPage.gym_price)*12;
	}



	GymUserInfo.showUserInfo();

}




}
