package ru.shafigullina.task5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class ListController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data =dataListView.getItems();
        int n = data.get(0);
       double s = 1;
       double a=1;
       double b=1;
       for(int k=2; k <= n;k++) {
           s += a*(1.0/2*(Math.sqrt(b)+1.0/2*Math.sqrt(a)))*b*(2*Math.pow(a,2)+b);

       }
        answerLabel.setText(String.valueOf(s));
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;

        }
        if(dataListView.getItems().size()>=10)
            dataListView.getItems().clear();
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(0,x);
            if(x<=0){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Введены некорректные данные");
                alert.showAndWait();
            }
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

}

