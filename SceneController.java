
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField employeeIDChef;
    /*@FXML
    private TextField employeeIDProcesor;*/
    @FXML
    private TextField asuriteID;
 
    public void switchToSelectPizzaScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SelectPizzaScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        /*String css = this.getClass().getResource("styles.css").toExternalForm();
        scene.getStylesheets().add(css);*/
        stage.setScene(scene);
        stage.show();
    }
 
    public void switchToEmployeeLoginProcessorScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeLoginProcessorScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        /*String css = this.getClass().getResource("styles.css").toExternalForm();
        scene.getStylesheets().add(css);*/
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEmployeeLoginChefScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EmployeeLoginChefScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        /*String css = this.getClass().getResource("styles.css").toExternalForm();
        scene.getStylesheets().add(css);*/
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToChefScene(ActionEvent event) throws IOException {
        Stage mainWindow = (Stage) employeeIDChef.getScene().getWindow();
        String passwordChef = employeeIDChef.getText();
        Parent root = FXMLLoader.load(getClass().getResource("ChefScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        /*String css = this.getClass().getResource("styles.css").toExternalForm();
        scene.getStylesheets().add(css);*/
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCheckOutScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CheckOutScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        /*String css = this.getClass().getResource("styles.css").toExternalForm();
        scene.getStylesheets().add(css);*/
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToOrderStatusScene(ActionEvent event) throws IOException {
        Stage mainWindow = (Stage) asuriteID.getScene().getWindow();
        String passwordStudent = asuriteID.getText();
        Parent root = FXMLLoader.load(getClass().getResource("OrderStatusScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        /*String css = this.getClass().getResource("styles.css").toExternalForm();
        scene.getStylesheets().add(css);*/
        stage.setScene(scene);
        stage.show();
    }
}