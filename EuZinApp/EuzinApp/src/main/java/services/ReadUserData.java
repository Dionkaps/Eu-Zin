package services;

import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;

public class ReadUserData {
    public static void readAllUserData() throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Query query = dbFirestore.collection("posts");

        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        QuerySnapshot snapshot = querySnapshot.get();

        for (QueryDocumentSnapshot document : snapshot) {
            System.out.println("Post ID: " + document.getId());
            System.out.println("Title: " + document.getString("title"));
            System.out.println("Author: " + document.getString("author"));
            System.out.println("Likes: " + document.getLong("likes")); // Use getLong() for integer fields
            System.out.println("DisLikes: " + document.getLong("dislikes")); 
            System.out.println("------------------------------");
        }
    }
}
