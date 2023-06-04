package com.ceid.EuzinApp;

import java.util.List;
import java.util.Scanner;

public class SelectedPostPage {
	
	public static void showSelectedPost(Posts selectedPost) {
		System.out.println("\nTitle: " + selectedPost.postTitle);
    	System.out.println("Author: " + selectedPost.postAuthor);
    	System.out.println("Body: " + selectedPost.postBody);
    	System.out.println("Likes: " + selectedPost.like);
    	System.out.println("Dislikes: " + selectedPost.dislike);

    	List<String> comments = selectedPost.postComments;
    	if (comments != null && !comments.isEmpty()) {
    	    System.out.println("Comments:");
    	    for (String comment : comments) {
    	        System.out.println(comment);
    	    }
    	} else {
    	    System.out.println("~Be the first to leave a comment!~");
    	}

    	System.out.println("------------------------------");
    	
    	reviewPost(selectedPost.postId,selectedPost.like,selectedPost.dislike);
	}
	public static void reviewPost(String id, int likes, int dislikes) {
		Scanner postReview = new Scanner(System.in);
		System.out.print("\nEnter a review for the post (type like/dislike): ");
        String review = postReview.nextLine();
        
        Server.updatePostReview(id,likes,dislikes,review);
	}
}
