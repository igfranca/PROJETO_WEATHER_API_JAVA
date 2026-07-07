module com.weatherapi.projeto_weather_api_java {
  requires javafx.controls;
  requires javafx.fxml;
  requires org.json;
  requires java.net.http;


  opens com.weatherapi.projeto_weather_api_java to javafx.fxml;
  exports com.weatherapi.projeto_weather_api_java;
}