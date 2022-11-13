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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
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


    private Processing_Agent processorAgent;
    private Chef_Agent chefAgent;
    private int[] idlist;
    private String[] idStrings;
    private String orderID;

    @FXML
    public void processOrder(ActionEvent event) throws IOException
    {
        int id = Integer.parseInt(orderID);
        if(processorAgent != null)
        {
            if (processorAgent.getOrderStatus(id)==0)
            {
                processorAgent.updateStatus(id, 1);
                processorAgent.saveOrders();
            }
        }
    }

    @FXML
    private ChoiceBox<String> orderIDready;
    @FXML
    private ChoiceBox<String> orderIDnotReady;
    @FXML
    public void refreshProcessor(ActionEvent event) throws IOException
    {
        processorAgent = new Processing_Agent("vien", 123);
        idlist = processorAgent.getIdList();
        idStrings = new String[idlist.length];

        for (int i = 0; i < idlist.length; ++i)
        {
            idStrings[i] = String.format("%d", idlist[i]);
        }

        orderIDready.getItems().addAll(idStrings);
        orderIDready.setOnAction(this::getID);
    }

    public void getID(ActionEvent event)
    {
        orderID = orderIDready.getValue();
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
    private String[] hours = {"9AM", "10AM", "11AM", "12PM", "1PM", "2PM", "3PM", "4PM", 
                                "5PM", "6PM", "7PM", "8PM", "9PM", "10PM", "11PM"};
    boolean pressed = true;

    String pizzaType, hr, mi;
    String topping[] = new String[4];

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
            pizzaType = pizzaType1.getText();
        }
        else if (pizzaType2.isSelected()) {
            pizzaChoice.setText(pizzaType2.getText());
            pizzaType = pizzaType2.getText();
        }
        else if (pizzaType3.isSelected()) {
            pizzaChoice.setText(pizzaType3.getText());
            pizzaType = pizzaType3.getText();
        }
        
    } 

    @FXML 
    private Label total;
    @FXML
    public void getTopping(ActionEvent event) {

        if (pressed) {
            minute.getItems().addAll(minutes);
            minute.setOnAction(this::getMinute);
            hour.getItems().addAll(hours);
            hour.setOnAction(this::getHour);
            pressed = false;
        }

        if (topping1.isSelected()) {
            topping[0] = topping1.getText();
        }
        else 
            topping[0] = null;

        if (topping2.isSelected()) {
            topping[1] = topping2.getText();
        }
        else
            topping[1] = null;

        if (topping3.isSelected()) {
            topping[2] = topping3.getText();
        }
        else
            topping[2] = null;

        if (topping4.isSelected()) {
            topping[3] = topping4.getText();
        }
        else
            topping[3] = null;
        //Intialize Order
    } 

    @FXML
    public void getHour(ActionEvent event) {
        hr = hour.getValue();
    }

    @FXML
    public void getMinute(ActionEvent event) {
        mi = minute.getValue();
    }

    @FXML
    public void calculatePrice(ActionEvent event)
    {
        Pizza myPizza = new Pizza(pizzaType, topping, hr+mi);
        total.setText(String.format("%.2f", myPizza.getPizzaPrice()));
    }

    @FXML
    private TextField asuriteID;
    @FXML
    private Label noticeText;
    private float barFloat;
    @FXML
    public void switchToOrderStatusScene(ActionEvent event) throws IOException {
        Stage mainWindow = (Stage) asuriteID.getScene().getWindow();
        String passwordStudent = asuriteID.getText();

         //Validate Password
        if (ASU_Student.verifyASUID(passwordStudent))
        {
            String order = "1111 " + "0 " + pizzaType + " " + topping[0] + " " + topping[1] + " " + topping[2] + " " + topping[3] 
                    + " " + hr + mi + " " + passwordStudent;

            WriteToFile.addNewOrder(order);
            barFloat = 33;

            Parent root = FXMLLoader.load(getClass().getResource("OrderStatusScene.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else{
            noticeText.setText("Invalid password");
        }
        
    }

    @FXML 
    private ProgressBar bar;
    @FXML
    public void refreshProgress(ActionEvent event) throws IOException
    {
        bar.setProgress(barFloat);
    }
}
