package com.ceid.EuzinApp;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

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
	
	public void updatePostReview(){
		
	}
	
	public void updatePostComments() {
		
	}
	
	public void showCompletion() {
		
	}
}
