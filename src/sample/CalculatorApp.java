package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ui.fxml"));
        primaryStage.setTitle("Calculator");
        Scene scene = new Scene(root, 400, 500);
        scene.getStylesheets().add("defaultTheme.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) { launch(args); }
}
