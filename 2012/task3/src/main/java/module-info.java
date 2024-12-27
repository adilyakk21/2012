module ru.shafigullina.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shafigullina.task3 to javafx.fxml;
    exports ru.shafigullina.task3;
}