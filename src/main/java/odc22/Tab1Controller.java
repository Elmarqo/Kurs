package odc22;

import javafx.fxml.FXML;

public class Tab1Controller {

    private String message = "TAB1 Controller";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @FXML
    public void giveInfo(){
        System.out.println(message);
    }
}
