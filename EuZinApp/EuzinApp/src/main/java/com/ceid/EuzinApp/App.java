package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import services.CaloriesBurnedApi;
import services.FirebaseInit;
import services.NutritionApi;
import services.ReadPostData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
    	ArrayList<Posts> postsArray = new ArrayList<>();
    	//FirebaseInit.initialize();
        //CaloriesBurnedApi.fetch("ski");
        //NutritionApi.fetch("256g potato");
        //FirebaseService.savePostDetails("Sample Title", "John Doe",3,0);
        //System.out.println();
        //ReadPostData.readAllPostData();
    	Server.serverInit();
    	Posts.fetchPostData(postsArray);
    	
    	
    	for (Posts post : postsArray) {
    	    System.out.println("Post ID: " + post.postId);
    	    System.out.println("Title: " + post.postTitle);
    	    System.out.println("Author: " + post.postAuthor);
    	    System.out.println("Likes: " + post.like);
    	    System.out.println("Dislikes: " + post.dislike);

    	    List<String> comments = post.postComments;
    	    if (comments != null && !comments.isEmpty()) {
    	        System.out.println("Comments:");
    	        for (String comment : comments) {
    	            System.out.println(comment);
    	        }
    	    } else {
    	        System.out.println("~Be the first to leave a comment!~");
    	    }

    	    System.out.println("------------------------------");
    	}

    }
}
