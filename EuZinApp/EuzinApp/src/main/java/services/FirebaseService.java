package services;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

public class FirebaseService {
    public static String savePostDetails(String title, String author, int likes, int dislikes) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("posts").document();
        
        // Create a Map to represent the post details
        Map<String, Object> postDetails = new HashMap<>();
        postDetails.put("title", title);
        postDetails.put("author", author);
        postDetails.put("likes", likes);
        postDetails.put("dislikes", dislikes);
        
        ApiFuture<WriteResult> writeResult = documentReference.set(postDetails);
        System.out.println("Data uploaded to the server!");
        
        return writeResult.get().getUpdateTime().toString();
    }
}
