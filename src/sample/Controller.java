package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Label outputField;

    public void changeTheme(ActionEvent actionEvent) {
        System.out.println("change");
    }
    public void processDelete(ActionEvent actionEvent) {
        System.out.println("delete");
    }
    public void processClear(ActionEvent actionEvent) {
        System.out.println("clear");

    }
    public void processDigit(ActionEvent actionEvent) {
        System.out.println("digit");

    }
    public void processSign(ActionEvent actionEvent) {
        System.out.println("sign");

    }
    public  void processDot(ActionEvent actionEvent){
        System.out.println("dot");
    }
}
