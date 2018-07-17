package odc22;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    private String messageMainCTRL = "Tu Twoj mainController";

    public String getMessageMainCTRL() {
        return messageMainCTRL;
    }

    @FXML
    private Tab1Controller tab1CTRLController;

    @FXML
    private Tab2Controller tab2CTRLController;

    @FXML
    private Button mainButton;

    @FXML
    public void initialize() {
    }

    @FXML
    public void giveInfo() {
        System.out.println(getMessageMainCTRL());
        tab1CTRLController.setMessage("Przejęta kontrola nad TAB1");
        tab2CTRLController.setMessage("Przejęta kontrola nad TAB2");
    }
}
