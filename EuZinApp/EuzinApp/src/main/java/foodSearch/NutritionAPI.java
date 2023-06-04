package foodSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NutritionAPI {

	public static void searchFood(String query) {
		
		String baseUrl = "https://api.api-ninjas.com/v1/nutrition";
		String apiKey = "KtRvg12d4WRIg7mButvU4A==flgkQk3IoD8CCw05";
		
		try {
			String encodedQuery = URLEncoder.encode(query, "UTF-8");
			URL url = new URL(baseUrl + "?query=" + encodedQuery);
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
			
			
			if(!response.toString().equals("[]")) { //Vasiki Roi
				try {
		            JSONParser parser = new JSONParser();
		            JSONArray jsonArray = (JSONArray) parser.parse(response.toString());

		            if (jsonArray.size() > 0) {
		                JSONObject jsonObject = (JSONObject) jsonArray.get(0);
		                String name = (String) jsonObject.get("name");
		                double calories = (double) jsonObject.get("calories");
		                double fatTotal = (double) jsonObject.get("fat_total_g");
		                double protein = (double) jsonObject.get("protein_g");
		                double carbohydratesTotal = (double) jsonObject.get("carbohydrates_total_g");
		                
		                FoodList.saveFood(name,calories,carbohydratesTotal,fatTotal,protein);
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
				
			}
			
			else if(response.toString().equals("[]")) { //Enallaktiki Roi 1
				showError();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void showError() {
		System.out.println("\nThe food you searched for does not exist.");
		
		ManualInputPage.showManualAdd();
	}
}
