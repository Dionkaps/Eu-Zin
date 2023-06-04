package com.ceid.EuzinApp;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class CommentPage {
	public static void showCommentPage(String id) {
		System.out.println("\nPlease enter a comment:");
		commentPost(id);
	}
	public static void commentPost(String id) {
		Scanner postComment = new Scanner(System.in);
        String comment = postComment.nextLine();
        try {
			Server.updatePostComments(comment,id);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
