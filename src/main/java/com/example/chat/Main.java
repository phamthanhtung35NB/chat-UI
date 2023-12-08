package com.example.chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
  protected Scene scene = null;
  public static void main(String[] args) {
    launch();
  }
  @Override
  public void start(Stage stage) throws IOException {
    Parent fxml = FXMLLoader.load(getClass().getResource("main.fxml"));
    scene = new Scene(fxml);
    scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
    stage.setTitle("Pham Thanh Tung 22021128!");
    stage.setScene(scene);
    stage.show();
  }
}
