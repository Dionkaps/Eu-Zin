package com.ceid.EuzinApp;

public class Review {
	public String comment;
    public int rating;

    public Review(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }
	public static void checkReview(String selectedNut, String comment, int rating) {
		if(comment instanceof String && rating>=0 && rating<=5) {
			showSuccessMessage(selectedNut,comment,rating);
		}
		else {
			showError(selectedNut);
		}
	}
	
	public static void showSuccessMessage(String selectedNut, String comment, int rating) {
		System.out.println("\nReview submited successfully");
		Nutritionist.updateNutrRating(selectedNut,comment,rating);
	}
	
	public static void showError(String selectedNut) {
		System.out.println("/nYou made a typo try again");
		ReviewPage.showReviewPage(selectedNut);
	}
}
