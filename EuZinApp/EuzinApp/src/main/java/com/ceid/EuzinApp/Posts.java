package com.ceid.EuzinApp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;

public class Posts {
    public String postTitle;
    public String postId;
    public String postAuthor;
    public List<String> postComments;
    public int like;
    public int dislike;

    public Posts(String postTitle, String postId, String postAuthor, List<String> comments, int like, int dislike) {
        this.postTitle = postTitle;
        this.postId = postId;
        this.postAuthor = postAuthor;
        this.postComments = comments;
        this.like = like;
        this.dislike = dislike;
    }

    public static void fetchPostData( ArrayList<Posts> postsArray) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Query query = dbFirestore.collection("posts");

        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        QuerySnapshot snapshot = querySnapshot.get();
        
        // Create an array to store the posts

        for (QueryDocumentSnapshot document : snapshot) {
            // Read the post data from Firestore
            String postId = document.getId();
            String title = document.getString("title");
            String author = document.getString("author");
            Long likes = document.getLong("likes");
            Long dislikes = document.getLong("dislikes");
            List<String> comments = (List<String>) document.get("comments");

            // Create a new Posts object and add it to the array
            Posts post = new Posts(title, postId, author, comments, likes.intValue(), dislikes.intValue());
            postsArray.add(post);
        }
        
    }

    public static void getPostsNames(ArrayList<String> postTitles) {
    	for (Posts post : Server.postsArray) {
    	    
    	    postTitles.add(post.postTitle);

    	   
    	}
    }

    public void getPostText() {
        
    }
}
