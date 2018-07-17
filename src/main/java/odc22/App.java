package odc22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/odc22/MainScreen.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane,800,550);
        primaryStage.setTitle("fx:include");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
