package com.example.chat;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainContronller {
  @FXML
  protected void buttonBack(ActionEvent event) {

    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      //css
      scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
      Stage homeStage = new Stage();
      homeStage.setTitle("Pham Thanh Tung 22021128!");
      homeStage.setScene(scene);
      // Close
      Node source = (Node) event.getSource();
      Stage currentStage = (Stage) source.getScene().getWindow();
      currentStage.close();
      // Show
      homeStage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  @FXML
  protected void buttonLestGo(ActionEvent event) {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("mess.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      //css
      scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
      Stage homeStage = new Stage();
      homeStage.setTitle("Pham Thanh Tung 22021128!");
      homeStage.setScene(scene);
      // Close
      Node source = (Node) event.getSource();
      Stage currentStage = (Stage) source.getScene().getWindow();
      currentStage.close();
      // Show
      homeStage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @FXML
  protected void buttonCall(ActionEvent event) {

    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("call.fxml"));
      Parent root = loader.load();
      Scene scene = new Scene(root);
      //css
      scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
      Stage homeStage = new Stage();
      homeStage.setTitle("Pham Thanh Tung 22021128!");
      homeStage.setScene(scene);
      // Close
      Node source = (Node) event.getSource();
      Stage currentStage = (Stage) source.getScene().getWindow();
      currentStage.close();
      // Show
      homeStage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  @FXML
  protected void buttonPush() throws IOException {

  }
}
