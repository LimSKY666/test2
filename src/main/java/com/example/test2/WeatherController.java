package com.example.test2;

import com.example.test2.Helper.WeatherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;

public class WeatherController {
    private final WeatherService weatherService = new WeatherService();
    @FXML
    private TextField city;
    @FXML
    private Label name;
    @FXML
    private Label temp;
    @FXML
    private Label tempMax;
    @FXML
    private Label tempMin;
    @FXML
    private Label feelsLike;
    @FXML
    private Label description;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        Map<String, String> result = weatherService.get(city.getText());
        name.setText("City: " + result.get("name"));
        temp.setText("Temp: " + result.get("temp"));
        tempMax.setText("Temp max: " + result.get("temp_max"));
        tempMin.setText("Temp min: " + result.get("temp_min"));
        feelsLike.setText("Feels like: " + result.get("feels_like"));
        description.setText("Description: " + result.get("description"));
    }
}