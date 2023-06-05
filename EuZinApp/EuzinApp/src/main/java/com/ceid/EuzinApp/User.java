package com.ceid.EuzinApp;
import java.util.ArrayList;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class User {
	
	ArrayList<FoodList> foodList = new ArrayList();
	ArrayList<Map<String, String>> appointmentData = new ArrayList<>();
	double totCalories;
	double totCarbs;
	double totFat;
	double totProtein;
	double balance;


	public User(ArrayList<FoodList> foodList, ArrayList<Map<String, String>> appointmentData, double totCalories,
			double totCarbs, double totFat, double totProtein, double balance) {
		super();
		this.foodList = foodList;
		this.appointmentData = appointmentData;
		this.totCalories = totCalories;
		this.totCarbs = totCarbs;
		this.totFat = totFat;
		this.totProtein = totProtein;
		this.balance = balance;
	}

	public static void addFoodDailyMeals(String name, double calories, double carbs, double fat, double protein) {
		User user = EuZin.testUser;
		user.foodList.add(new FoodList(name,calories,carbs,fat,protein));
		
		FoodList.getFoodData2(calories,carbs,fat,protein);
	}
	
	public static void addFoodDailyCons(double calories, double carbs, double fat, double protein) {
		User user = EuZin.testUser;
		user.totCalories = calories;
		user.totCarbs = carbs;
		user.totFat = fat;
		user.totProtein = protein;
		
		ArrayList<FoodList> foodList1 = new ArrayList();
		foodList1 = user.foodList;
		
		DailyListsPage.showLists(foodList1);
	}
	
	public static void getLists() {
		
		ArrayList<FoodList> foodList1 = new ArrayList();
		foodList1 = EuZin.testUser.foodList;
		
		DailyListsPage.showLists(foodList1);
	}
	
	public static void calculateCal(double caloriesBurnt, Activities act, int timeSpent) {
		double totCaloriesBurned = (caloriesBurnt * timeSpent)/60;
		updateDailyList(totCaloriesBurned);
	}
	
	public static void updateDailyList(double totCaloriesBurned) {
		double tempCal = EuZin.testUser.totCalories - totCaloriesBurned;
		
		EuZin.testUser.totCalories = tempCal;
		
		getCalBurnt(totCaloriesBurned);
	}
	
	public static void getCalBurnt(double totCaloriesBurned) {
		CaloriesBurntPage.showCalBurnt(totCaloriesBurned);
	}
	
	public static void addAppointment(String appTime, String nutName, String searchDay) {
		
		Map<String, String> appointment1 = new HashMap<String, String>();
        appointment1.put("Nutritionist: ", nutName);
        appointment1.put("Day: ", searchDay);
        appointment1.put("Time: ", appTime);
        
        getMyAppointmentData(appointment1);
	}
	
	public static void getMyAppointmentData(Map<String, String> appointment1) {
		User user = EuZin.testUser;
		
		user.appointmentData.add(appointment1);
		MyAppointmentPage.showMyAppointPage();
	}
	
	public static void checkAppointments(String selectedNut) {
		User user = EuZin.testUser;
		boolean found = false;
		
		for (Map<String, String> appointment : user.appointmentData) {
            if (appointment.containsValue(selectedNut)) {
                System.out.println("Matching appointment found");
                found = true;
                ReviewPage.showReviewPage(selectedNut);
                break;
            }
        }
		//Enallaktiki Roi1
		if(found == false) {
			showError();
		}
	}
	
	public static void showError() {
		System.out.println("\nYou haven't made an appointment with this Nutritionist in the past so you can't review him\n");
		Nutritionist.getNutrNames(2);
	}
	
	public static void getBalance(HashSet<String> uniqueShopNames) {
		double balance;
		User user = EuZin.testUser;
		
		balance = user.balance;
		
		ShoppingPage.showShopList(uniqueShopNames,balance);
	}
	
	public static void addToCart(String shopName,ArrayList<Object[]> productsAndPrices) {
		ArrayList<Object[]> userCart = new ArrayList<>();
		String userAnswer;
		do {
		System.out.println("\nChoose a product by typing its corresponding number:");
		Scanner product = new Scanner(System.in);  
		int chosenProduct = product.nextInt();
		
		Object[] productAndPrice = productsAndPrices.get(chosenProduct);
		String productName = (String) productAndPrice[0];
		double productPrice = (double)productAndPrice[1];
		
		System.out.println("\nHow many " + productName + " do you want?");
		Scanner prodAmount = new Scanner(System.in);  
		int chosenAmount = prodAmount.nextInt();
		
		userCart.add(new Object[]{productName, chosenAmount, productPrice});
		
		System.out.println("\nDo you want to choose any other products? (y/n)");
		Scanner answer = new Scanner(System.in);  
		userAnswer = answer.nextLine();
		}while(userAnswer.equals("y"));
		CheckoutPage.showConfirm(userCart);
	}
	
	public static void getCartData(ArrayList<Object[]> productList) {
		ConfirmationPage.showPurchase(productList);
	}
	
	public static void checkBalance(double totalPrice) {
		User user = EuZin.testUser;
		double userBalance = user.balance;
		if(totalPrice>userBalance) {
			TopUpBalancePage.showUpdateBalance(totalPrice);
		}
		else {
			CouponPage.showDiscPage(totalPrice);
		}
	}
	
	public static void updateBalance(double totalPrice, double amount) {
		User user = EuZin.testUser;
		double curAmount = user.balance;
		
		curAmount = curAmount + amount;
		
		user.balance = curAmount;
		
		checkBalance(totalPrice);
	}
	
	public static void calculateCost(double totalPrice) {
		double newCost = totalPrice - totalPrice*0.3;
		User.calculateBalance(newCost);
	}
	
	public static void calculateBalance(double totalPrice) {
		User user = EuZin.testUser;
		double tempBalance = user.balance;
		
		tempBalance = tempBalance - totalPrice;
		getBalance(tempBalance);
	}
	
	public static void getBalance(double newBalance) {
		User user = EuZin.testUser;
		
		user.balance = newBalance;
		
		NewBalancePage.showNewBalance();
	}
}
