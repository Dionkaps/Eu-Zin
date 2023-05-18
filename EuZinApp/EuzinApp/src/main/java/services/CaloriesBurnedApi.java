package services;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class CaloriesBurnedApi {

    public static void fetch(String activity) {
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

            System.out.println("Response: " + response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
