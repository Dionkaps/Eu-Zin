package com.ceid.EuzinApp;

import java.util.Scanner;

public class CommentPage {
	public static void showCommentPage() {
		System.out.println("\nPlease enter a comment:");
		commentPost();
	}
	public static void commentPost() {
		Scanner postComment = new Scanner(System.in);
        String comment = postComment.nextLine();
        Server.updatePostComments(comment);
	}
}
