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
    public static String saveUserDetails(String name) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("users").document();
        
        // Create a Map to represent the user details
        Map<String, Object> userDetails = new HashMap<>();
        userDetails.put("name", name);
        
        ApiFuture<WriteResult> writeResult = documentReference.set(userDetails);
        System.out.println("Data uploaded to the server!");
        
        return writeResult.get().getUpdateTime().toString();
        
    }
}
