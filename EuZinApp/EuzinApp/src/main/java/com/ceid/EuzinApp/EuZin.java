package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
	public static Nutritionist nutritionist1;
	public static Nutritionist nutritionist2;
	static ArrayList<String> postTitles = new ArrayList();
	static ArrayList<FoodList> foodList = new ArrayList<>();
	static ArrayList<Nutritionist> nutritionists = new ArrayList<>();
	static ArrayList<Map<String, String>> appointmentData = new ArrayList<>();
	static ArrayList<Review> reviews = new ArrayList<>();
	static ArrayList<Object[]> shopInventory = new ArrayList<>();
	static ArrayList<String> couponCodes = new ArrayList<>();
	
    public static void main( String[] args ) throws InterruptedException, ExecutionException, ParseException
    {	
    	Gym.gym_array[0] = new Gym("Yava", "Weights" , "Korinthou 17", 25);
		Gym.gym_array[1] = new Gym("FitPlan", "Weights" , "Karaiskaki 32", 35);
		Gym.gym_array[2] = new Gym("TopForm", "Weights" , "Katerinis 16", 30);
		
		Gym.gym_array[3] = new Gym("Dolph", "Swimming" , "Miaouli 117", 40);
		Gym.gym_array[4]= new Gym("DiveNGo", "Swimming" , "Votsi 12", 45);
		
		Gym.gym_array[5] = new Gym("SofiasClub", "Group dancing" , "Korinthou 157", 20);
		Gym.gym_array[6] = new Gym("IntenseD", "Group dancing" , "Votsi 157", 23);
		Gym.gym_array[7] = new Gym("PowerUp", "Group dancing" , "Diakou 157", 35);
		
		
		
		Gym.gym_array[8] = new Gym("NatureFitness", "Group running" , "Korinthou 100", 35);
		Gym.gym_array[9] = new Gym("RunCity", "Group running" , "Mezonos 38", 45);
		
		Gym.gym_array[10] = new Gym("BeastCity ", "TRX" , "Korinthou 169", 35);
		Gym.gym_array[11] = new Gym("NonStop", "TRX" , "Papanikolaou 190", 25);
		Gym.gym_array[12] = new Gym("FitCity", "TRX" , "Ag.Nikolaou 6", 50);
    	
    	reviews.add(new Review("Great nutritionist!", 5));
    	reviews.add(new Review("Could be better.", 2));
    	reviews.add(new Review("Excellent service.", 4));
    	
    	foodList.add(new FoodList("apple", 12, 32, 1, 2));
		foodList.add(new FoodList("tost", 122, 50, 17, 26));
		foodList.add(new FoodList("tsoureki", 312, 35, 11, 32));
		foodList.add(new FoodList("yogurt", 122, 60, 12, 12));
		
		EuZin.testUser = new User(foodList,appointmentData,568.0,177.0,65.0,72.0,200); //Test User init
		
		Map<String, String> appointment1 = new HashMap<>();
        appointment1.put("Nutritionist: ", "Kap Kap");
        appointment1.put("Day: ", "Monday");
        appointment1.put("Time: ", "10:00");
        testUser.appointmentData.add(appointment1);
		
        //Creating the first test object
        String name1 = "Kap Kap";
        String email1 = "kap.kap@example.com";
        String bio1 = "Experienced nutritionist specializing in weight management.";
        int phone1 = 123456789;

        ArrayList<Map<String, ArrayList<String>>> schedule1 = new ArrayList<>();

        Map<String, ArrayList<String>> mondaySchedule1 = new HashMap<>();
        ArrayList<String> mondayTimes1 = new ArrayList<>();
        mondayTimes1.add("8:30");
        mondayTimes1.add("11:00");
        mondayTimes1.add("15:30");
        mondaySchedule1.put("Monday", mondayTimes1);

        Map<String, ArrayList<String>> tuesdaySchedule1 = new HashMap<>();
        ArrayList<String> tuesdayTimes1 = new ArrayList<>();
        tuesdayTimes1.add("9:00");
        tuesdayTimes1.add("13:30");
        tuesdayTimes1.add("16:00");
        tuesdaySchedule1.put("Tuesday", tuesdayTimes1);

        schedule1.add(mondaySchedule1);
        schedule1.add(tuesdaySchedule1);

        nutritionist1 = new Nutritionist(name1, email1, bio1, phone1, schedule1, reviews);


        //Creating the second test object
        String name2 = "Peter Peterson";
        String email2 = "peter.son@example.com";
        String bio2 = "Certified nutritionist passionate about holistic health.";
        int phone2 = 987654321;

        ArrayList<Map<String, ArrayList<String>>> schedule2 = new ArrayList<>();

        Map<String, ArrayList<String>> wednesdaySchedule2 = new HashMap<>();
        ArrayList<String> wednesdayTimes2 = new ArrayList<>();
        wednesdayTimes2.add("10:00");
        wednesdayTimes2.add("14:30");
        wednesdayTimes2.add("17:00");
        wednesdaySchedule2.put("Wednesday", wednesdayTimes2);

        Map<String, ArrayList<String>> thursdaySchedule2 = new HashMap<>();
        ArrayList<String> thursdayTimes2 = new ArrayList<>();
        thursdayTimes2.add("9:30");
        thursdayTimes2.add("12:00");
        thursdayTimes2.add("16:30");
        thursdaySchedule2.put("Thursday", thursdayTimes2);

        schedule2.add(wednesdaySchedule2);
        schedule2.add(thursdaySchedule2);

        nutritionist2 = new Nutritionist(name2, email2, bio2, phone2, schedule2, reviews);
        
        nutritionists.add(nutritionist1);
        nutritionists.add(nutritionist2);
        
        //Add shop information, products, and prices
        shopInventory.add(new Object[]{"Shop A", "Product 1", 10.90});
        shopInventory.add(new Object[]{"Shop A", "Product 2", 19.90});
        shopInventory.add(new Object[]{"Shop B", "Product 3", 7.90});
        shopInventory.add(new Object[]{"Shop B", "Product 4", 5.90});
        
        //Adding coupon codes to the ArrayList
        couponCodes.add("SAVE10");
        couponCodes.add("25OFF");
        couponCodes.add("FREESHIP");
        couponCodes.add("SUMMER20");
        couponCodes.add("BOGO50");
        
        System.out.println("\nWelcome To EuZin\n\nLogin");
        
        Scanner loginName = new Scanner(System.in);  
		System.out.println("\nInsert your username");
		String logName = loginName.nextLine();
		
		Scanner loginPass = new Scanner(System.in);  
		System.out.println("\nInsert your password");
		String logPass = loginPass.nextLine();
        
        Scanner nameInput = new Scanner(System.in);  
		System.out.println("\n\nType the corresponding number for what you want to do:\n1. Forum (Anagnwsi kai aksiologisi anartisewn xristi)"
				+ "\n2. Calories Burnt Calculator (Athlisi kai ipologismos thermidwn) \n3. Search/Add Meal (Anazitisi kai prosthiki fagitou)"
				+ "\n4. Nutritionist Appointment/Rating (Rantevou me diatrfologo/Aksiologisi diatrofologou) \n5. Buy gym equipment/Payment (Agora Epoaggelmatikou eksoplismou / Plirwmi paraggelias)"
				+ "\n6. "
				+ "Gym Registration (Eggrafi se gimnastirio)");
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
		else if(choice==4) {
			Nutritionist.getNutrNames(0);
		}
		else if(choice==5) {
			ShopsAndProducts.getShopData();
		}
		else if(choice==6) {
			Gym.getPrograms();
		}
		
    }
}
