package  ru.shafigullina.task3;

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
    private TextField vvodTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {

        if (vvodTextField.getText().isEmpty()) {
            return;
        }
        try {
            int n = Integer.parseInt(vvodTextField.getText().toString());
            List<Integer> data =dataListView.getItems();
            dataListView.getItems().clear();
            int sum = 0;
            if(n<=0){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Введены некорректные данные");
                alert.showAndWait();
            }
            for (int i = 1; i <= n; i+=1){
                sum+=2*i-1;
                dataListView.getItems().add(sum);
            }
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            vvodTextField.setText("");
        }
    }




    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();

    }

}
