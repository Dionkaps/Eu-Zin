package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class PostPage {
	
	public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
		ArrayList<String> postTitles = new ArrayList();
    	Server.serverInit();
    	Posts.getPostsNames(postTitles);
    	
    	for (String post : postTitles) {
    	    
    	    System.out.println("Title: " + post);
    	}    	    

    }

	public void showPostsPage() {
		
	}
	
	public void selectPost() {
		
	}
}