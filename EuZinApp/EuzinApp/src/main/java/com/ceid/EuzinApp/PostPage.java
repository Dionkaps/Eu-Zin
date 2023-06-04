package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.Scanner; 

public class PostPage {
	
	public static void showPostsPage() {
		int count =0;
		System.out.println("Choose a post from below by typing the corresponding number");
		for (String post : EuZin.postTitles) {
    	    System.out.println(count+". Title: " + post);
    	    count++;
    	}
		selectPost();
	}
	
	public static void selectPost() {
		Scanner postInput = new Scanner(System.in);
		System.out.print("\nEnter post number: ");
        int number = postInput.nextInt();
        
        Posts.getPostText(number);
	}
}