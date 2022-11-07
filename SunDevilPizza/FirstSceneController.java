package SunDevilPizza;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FirstSceneController implements Initializable, ControlledScreen {

    ScreensController myController;

 

    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }

    
    @FXML
    void goToEmployeeLogin(ActionEvent event) {
       myController.setScreen(ScreensFramework.employeeLoginID);
    }


    @FXML
    void goToPizzaSelection(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }
}
