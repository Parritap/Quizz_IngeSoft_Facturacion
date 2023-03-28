package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/Funcionalidad.fxml")));
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("FUNCIONALIDAD");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // In this app, we will use a singleton to access the domain
    public static void main(String[] args) {
        Singleton.getInstance();
        launch(args);
    }


}
