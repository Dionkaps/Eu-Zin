package com.ceid.EuzinApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

public class CaloriesBurntAPI {
	
	public static void checkAct(String activity) throws ParseException {
		String baseUrl = "https://api.api-ninjas.com/v1/caloriesburned";
        String apiKey = "KtRvg12d4WRIg7mButvU4A==flgkQk3IoD8CCw05";

        try {
            String encodedActivity = URLEncoder.encode(activity, "UTF-8");
            URL url = new URL(baseUrl + "?activity=" + encodedActivity);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Api-Key", apiKey);

            int responseCode = connection.getResponseCode();

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    responseCode == HttpURLConnection.HTTP_OK ? connection.getInputStream() : connection.getErrorStream()
            ));

            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();
            
            if(!response.toString().equals("[]")) {
                 JSONParser parser = new JSONParser();

                 //Parse the JSON array
				 JSONArray jsonArray = (JSONArray) parser.parse(response.toString());

				 //Create an ArrayList to store the activities
				 ArrayList<Activities> activitiesList = new ArrayList<>();

				 //Iterate over the JSON array
				 for (Object obj : jsonArray) {
				     JSONObject jsonObj = (JSONObject) obj;

				     //Extract the values
				     String name = (String) jsonObj.get("name");
				     long caloriesPerHour = (Long) jsonObj.get("calories_per_hour");

				     //Create an Activities object and add it to the list
				     Activities activity1 = new Activities(name, (int) caloriesPerHour);
				     activitiesList.add(activity1);
				 }
				 Activities.saveActivity(activitiesList);
				 
            }
            else if(response.toString().equals("[]")) { //Enallaktiki Roi
            	ActInputPage.showError();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
