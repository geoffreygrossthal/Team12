


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class MainSceneController implements Initializable {
    @FXML
    private Label noticeText;

    @FXML 
    private Label pizzaChoice;

    @FXML
    private RadioButton pizzaType1, pizzaType2, pizzaType3;

    @FXML
    private Button submit;

    @FXML
    private RadioButton topping1, topping2, topping3, topping4;

    @FXML
    private TextField tfTitle;

    @FXML
    private ChoiceBox<String> hour;
    @FXML
    private ChoiceBox<String> minute;

    private String[] hours = {"9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", 
                                "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM"};
    private String[] minutes = {"00", "15", "30", "45"};

    @FXML
    public void btnOKClicked(ActionEvent event) {
        Stage mainWindow = (Stage) tfTitle.getScene().getWindow();
        String title = tfTitle.getText();
        mainWindow.setTitle(title);
    }

    @FXML
    public void getPizzaType(ActionEvent event) {
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

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        hour.getItems().addAll(hours);
        minute.getItems().addAll(minutes);
        hour.setOnAction(this::getHour);
        minute.setOnAction(this::getMinute);
    }

    public void getHour(ActionEvent event) {
        String myhour = hour.getValue();

    }

    public void getMinute(ActionEvent event) {
        String myminute = minute.getValue();
    }
}