package me.atyre.utils;

import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RequestUtil {
    public static Object get(URL url, String key) {
        Object object = null;
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            String line;

            int responseCode = connection.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("There was an error with the response. Response Code: " + responseCode);
            } else {
                InputStream stream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder responseBuilder = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    responseBuilder.append(line);
                }

                JSONObject jsonObject = new JSONObject(responseBuilder.toString());
                object = jsonObject.get(key);

                connection.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void post(URL url, String jsonString) {
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            OutputStream os = connection.getOutputStream();
            os.write(jsonString.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
