package com.ceid.EuzinApp;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class Server {
	static ArrayList<Posts> postsArray = new ArrayList<>();
	
	public static void serverInit() throws InterruptedException, ExecutionException {
		try {
            FileInputStream serviceAccount = new FileInputStream("./serviceAccount.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();
            System.out.println("Connection secured!");
            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		Posts.fetchPostData(postsArray);
	}
	
	public static void updatePostReview(String id, int likes,int dislikes, String review){
		if(review.equals("like")) {
		// Initialize Firestore
		Firestore dbFirestore = FirestoreClient.getFirestore();

		// Specify the document ID and collection
		String postId = id;
		String collection = "posts";

		// Get the document reference
		DocumentReference docRef = dbFirestore.collection(collection).document(postId);

		// Update the "likes" field
		int newLikesValue = likes+1; 
		docRef.update("likes", newLikesValue);
		}
		else if(review.equals("dislike")) {
			// Initialize Firestore
			Firestore dbFirestore = FirestoreClient.getFirestore();

			// Specify the document ID and collection
			String postId = id;
			String collection = "posts";

			// Get the document reference
			DocumentReference docRef = dbFirestore.collection(collection).document(postId);

			// Update the "likes" field
			int newDislikesValue = dislikes+1;
			docRef.update("dislikes", newDislikesValue);
			}
		else {
			System.out.println("You made a typo");
		}
		CommentPage.showCommentPage();

	}
	
	public static void updatePostComments(String comment) {
		
	}
	
	public void showCompletion() {
		
	}
}
