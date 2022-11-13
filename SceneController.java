
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    
    public void switchToSelectPizzaScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SelectPizzaScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
 
    public void switchToEmployeeLoginProcessorScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeLoginProcessorScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEmployeeLoginChefScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeLoginChefScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private TextField employeeIDChef;
    @FXML
    public void switchToChefScene(ActionEvent event) throws IOException {
        String passwordChef = employeeIDProcessor.getText();
        Stage mainWindow = (Stage) employeeIDChef.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("ChefScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private TextField employeeIDProcessor;
    @FXML
    public void switchToProcessorScene(ActionEvent event) throws IOException {
        Stage mainWindow = (Stage) employeeIDProcessor.getScene().getWindow();
        String passwordProcessor = employeeIDProcessor.getText();
        Parent root = FXMLLoader.load(getClass().getResource("ProcessorScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private RadioButton pizzaType1, pizzaType2, pizzaType3;
    @FXML
    private RadioButton topping1, topping2, topping3, topping4;
    @FXML 
    private Label pizzaChoice;
    @FXML
    private ChoiceBox<String> hour;
    @FXML
    private ChoiceBox<String> minute;

    private String[] minutes = {"00", "15", "30", "45"};
    private String[] hours = {"9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", 
                                "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM"};
    boolean pressed = true;

    @FXML
    public void getPizzaType(ActionEvent event) {

        if (pressed) {
            minute.getItems().addAll(minutes);
            minute.setOnAction(this::getMinute);
            hour.getItems().addAll(hours);
            hour.setOnAction(this::getHour);
            pressed = false;
        }

        if (pizzaType1.isSelected()) {
            pizzaChoice.setText(pizzaType1.getText());
        }
        else if (pizzaType2.isSelected()) {
            pizzaChoice.setText(pizzaType2.getText());
        }
        else if (pizzaType3.isSelected()) {
            pizzaChoice.setText(pizzaType3.getText());
        }
        
    } 

    @FXML 
    private Label total;
    @FXML
    public void getTopping(ActionEvent event) {

        //Calculate price total
        String temp = "11.46";
        total.setText(temp);

        if (pressed) {
            minute.getItems().addAll(minutes);
            minute.setOnAction(this::getMinute);
            hour.getItems().addAll(hours);
            hour.setOnAction(this::getHour);
            pressed = false;
        }

        if (topping1.isSelected()) {
            String top1 = topping1.getText();
        }
        if (topping2.isSelected()) {
            String top2 = topping2.getText();
        }
        if (topping3.isSelected()) {
            String top3 = topping3.getText();
        }
        if (topping4.isSelected()) {
            String top4 = topping4.getText();
        }
        //Intialize Order
    } 

    public void getHour(ActionEvent event) {
        String myHour = hour.getValue();
    }

    public void getMinute(ActionEvent event) {
        String myMinute = minute.getValue();
    }

    @FXML
    public void switchToCheckOutScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CheckOutScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private TextField asuriteID;
    @FXML
    public void switchToOrderStatusScene(ActionEvent event) throws IOException {
        Stage mainWindow = (Stage) asuriteID.getScene().getWindow();
        String passwordStudent = asuriteID.getText();
        //Validate Password
        Parent root = FXMLLoader.load(getClass().getResource("OrderStatusScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}