package services;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;

public class ReadPostData {
    public static void readAllPostData() throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Query query = dbFirestore.collection("posts");

        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        QuerySnapshot snapshot = querySnapshot.get();

        for (QueryDocumentSnapshot document : snapshot) {
            System.out.println("Post ID: " + document.getId());
            System.out.println("Title: " + document.getString("title"));
            System.out.println("Author: " + document.getString("author"));
            System.out.println("Likes: " + document.getLong("likes"));
            System.out.println("Dislikes: " + document.getLong("dislikes"));

            // Read the comments array
            List<String> comments = (List<String>) document.get("comments");
            if (comments != null) {
                System.out.println("\nComments:");
                for (String comment : comments) {
                    System.out.println(comment);
                }
            }
            else {
            	System.out.println("\n~Be the first to leave a comment!~");
            }

            System.out.println("------------------------------");
        }
    }
}
