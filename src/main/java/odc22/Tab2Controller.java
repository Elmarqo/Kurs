package odc22;

import javafx.fxml.FXML;

public class Tab2Controller {

    private String message = "TAB2 Controller";

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

