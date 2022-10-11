
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private TextField tfTitle;

    @FXML
    void btnOKClicked(ActionEvent event) {
        Object tfTitle;
        Stage mainWindow = (Stage) tfTitle.getScene.getScene().getWindow();
        String title = tfTitle.getText();
        mainWindow.setTitle(title);
    }

}


