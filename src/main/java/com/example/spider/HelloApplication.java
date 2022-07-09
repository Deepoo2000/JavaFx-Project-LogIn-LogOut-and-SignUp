package com.example.spider;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage sta;
    @Override
    public void start(Stage stage) throws IOException {
        sta = stage;
        stage.setResizable(false);
        Parent root =FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Falcon");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }
  public void changeScene(String fxml) throws IOException {
        Parent pane1=FXMLLoader.load(getClass().getResource(fxml));
        sta.getScene().setRoot(pane1);
  }



    public static void main(String[] args) {
        launch();
    }
}
