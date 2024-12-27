module ru.shafigullina.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shafigullina.task1 to javafx.fxml;
    exports ru.shafigullina.task1;
}