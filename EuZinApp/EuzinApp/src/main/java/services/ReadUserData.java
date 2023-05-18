package services;

import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;

public class ReadUserData {
    public static void readAllUserData() throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Query query = dbFirestore.collection("users");

        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        QuerySnapshot snapshot = querySnapshot.get();

        for (QueryDocumentSnapshot document : snapshot) {
            System.out.println("User ID: " + document.getId());
            System.out.println("Name: " + document.getString("name"));
            // You can retrieve other fields using document.getXXX("fieldName") methods
            System.out.println("------------------------------");
        }
    }
}
