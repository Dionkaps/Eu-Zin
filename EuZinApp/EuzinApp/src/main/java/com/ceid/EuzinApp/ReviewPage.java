package com.ceid.EuzinApp;

import java.util.Scanner;

public class ReviewPage {

	public static void showReviewPage(String selectedNut) {
		System.out.println("\nFill the data below to review the Nutritionist: " + selectedNut);
		fillReviewForm(selectedNut);
	}
	
	public static void fillReviewForm(String selectedNut) {
		int ratingScore = 0;
		boolean flag = false;
		do {
		try {
			Scanner rating = new Scanner(System.in);
			System.out.println("\nRate " + selectedNut + " from a scale of 0 to 5");
			ratingScore = rating.nextInt();
			flag = true;
		} catch (Exception e) {
			System.out.println("You didn't type an integer");
		}
		}while(flag == false);
		
		Scanner comment = new Scanner(System.in);
		System.out.println("\nLeave a comment for " + selectedNut);
		String userComment = comment.nextLine();
		
		Review.checkReview(selectedNut,userComment,ratingScore);
	}
}
