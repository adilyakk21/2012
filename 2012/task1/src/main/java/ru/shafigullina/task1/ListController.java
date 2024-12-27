package ru.shafigullina.task1;

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
    private TextArea answerTextArea;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int n = data.get(0);
        int max = 0;
        boolean hZo = false;
        for (int i = 1; i <= n; i++) {

            int score = data.get(i);
            if (score > max) {
                max = score;
            }

            if (score == 0) {
                hZo = true;
            }

        }
        answerTextArea.setText(max + "\n" + (hZo ? "YES" : "NO"));
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        if(dataListView.getItems().size()>=1000)
            dataListView.getItems().clear();
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());

            dataListView.getItems().add(x);
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
