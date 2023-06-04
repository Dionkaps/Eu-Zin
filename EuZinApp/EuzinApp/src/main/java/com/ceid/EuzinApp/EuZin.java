package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import org.json.simple.parser.ParseException;

import services.CaloriesBurnedApi;
import services.FirebaseInit;
import services.NutritionApi;
import services.ReadPostData;

/**
 * Hello world!
 *
 */
public class EuZin 
{
	public static User testUser;
	static ArrayList<String> postTitles = new ArrayList();
	static ArrayList<FoodList> foodList = new ArrayList<>();
    public static void main( String[] args ) throws InterruptedException, ExecutionException, ParseException
    {
    	foodList.add(new FoodList("apple", 12, 32, 1, 2));
		foodList.add(new FoodList("tost", 122, 50, 17, 26));
		foodList.add(new FoodList("tsoureki", 312, 35, 11, 32));
		foodList.add(new FoodList("yogurt", 122, 60, 12, 12));
		
		EuZin.testUser = new User(foodList,568.0,177.0,65.0,72.0); //Test User init
		
		Scanner nameInput = new Scanner(System.in);  
		System.out.println("Type the corresponding number for what you want to do:\n1. Anagnwsi kai aksiologisi anartisewn xristi"
				+ "\n2. Athlisi kai ipologismos thermidwn \n3. Anazitisi kai prosthiki fagitou");
		int choice = nameInput.nextInt();
		if(choice==1) {
			Server.serverInit();
	    	Posts.getPostsNames(postTitles);
		}
		else if(choice==2) {
			ActInputPage.showInputPage();
		}
		else if(choice==3) {
			FoodSearchPage.getFood();
		}
		
    	
    	
		
		
    }
}
