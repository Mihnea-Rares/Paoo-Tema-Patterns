package org.example;

import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//homework2.1
public class Config {

    private static Config instance = null;
    private JSONObject data;

    // Private constructor to prevent instantiation
    private Config() {}

    // Static method to get the single instance
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    // Method to load data from the configuration file
    private void loadData() {
        if (data == null) {
            try {
                String content = new String(Files.readAllBytes(Paths.get("config.json")));
                data = new JSONObject(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Public method to get color
    public String getColor() {
        loadData();
        return data.getString("color");
    }

    // Public method to get weight
    public int getWeight() {
        loadData();
        return data.getInt("weight");
    }


}





