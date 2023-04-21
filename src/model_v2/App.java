package model_v2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App  extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/verificarFactura.fxml")));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Verificar Factura");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // In this app, we will use a singleton to access the domain
    public static void main(String[] args) {
        launch(args);
    }
}
