package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    Label outputField;


    String firstDigit = "";
    String secondDigit = "";
    String operator = "";
    private String output;

    public void changeTheme(ActionEvent actionEvent) {
        Scene scene = outputField.getScene();
        if (scene.getStylesheets().contains("defaultTheme.css")){
            scene.getStylesheets().clear();
            scene.getStylesheets().add("darkTheme.css");
        } else {
            scene.getStylesheets().clear();
            scene.getStylesheets().add("defaultTheme.css");
        }
    }

    public void processDelete(ActionEvent actionEvent) {
        output = outputField.getText();
        if (output.length() <= 1){
            firstDigit = output = "0";
        } else {
            if (!Character.isDigit(output.charAt(output.length() - 1))) {
                operator = "";
            } else if (!operator.isEmpty()){
                secondDigit = secondDigit.substring(0,output.length() - 1);
            } else {
                firstDigit = firstDigit.substring(0,output.length() - 1);
            }
            output = output.substring(0,output.length() - 1);
        }
        outputField.setText(output);
    }

    public void processClear(ActionEvent actionEvent) {
        outputField.setText("0");
        firstDigit = secondDigit = operator = "";
    }

    public void processDigit(ActionEvent actionEvent) {
        output = outputField.getText();
        if (output.equals("0")) {
            firstDigit = output = ((Button) actionEvent.getSource()).getText();
        } else {
            output = output + ((Button)actionEvent.getSource()).getText();
            if (operator.isEmpty()){
                firstDigit = output;
            } else {
                secondDigit += output.charAt(output.length() - 1);
            }
        }
        outputField.setText(output);

        System.out.println("first: " + firstDigit + "    operator: " + operator + "    second: " + secondDigit);
    }
    //TODO add percentage method
    public void processSign(ActionEvent actionEvent) {
        output = outputField.getText();
        if (operator.isEmpty() || output.matches(".*[\\+\\-÷x]")){
            operator = ((Button)actionEvent.getSource()).getText();
            output = output.matches(".*[\\+\\-÷x]") ? output.substring(0, output.length() - 1) + operator : output + operator;
        }
        outputField.setText(output);
    }

    public void processEquals(){
        if (!(firstDigit.isEmpty() || secondDigit.isEmpty())){
            output = ComputationHandler.compute(operator, firstDigit, secondDigit);
            output = output.matches(".*\\.0$") ? output.substring(0, output.length() - 2) : output;
            firstDigit = output;
            secondDigit = operator = "";
            outputField.setText(output);
        }
    }
    public  void processDot(ActionEvent actionEvent){
        output = outputField.getText();
        if (Character.isDigit(output.charAt(output.length() - 1))){
            if (operator.isEmpty()){
                if (!firstDigit.contains(".")){
                    output += ".";
                    firstDigit += ".";
                }
            } else {
                if (!secondDigit.contains(".")){
                    output += ".";
                    secondDigit += ".";
                }
            }
        }
        outputField.setText(output);
    }
}
