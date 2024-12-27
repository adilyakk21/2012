module ru.shafigullina.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shafigullina.task2 to javafx.fxml;
    exports ru.shafigullina.task2;
}