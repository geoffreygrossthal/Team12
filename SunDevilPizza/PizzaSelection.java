package SunDevilPizza;


import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class PizzaSelection extends Application {

   @Override
   public void start(Stage primaryStage) {
        
  
   Parent root;
      try {
         root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
         Scene scene = new Scene(root);
  
         primaryStage.setTitle("Sun Devil Pizza");
         primaryStage.setScene(scene);
         primaryStage.show();
      } catch (IOException e) {
      }
   }
 
   public static void main(String[] args) {
        launch(args);
   }
}