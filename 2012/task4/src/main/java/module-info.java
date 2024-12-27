module ru.shafigullina.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shafigullina.task4 to javafx.fxml;
    exports ru.shafigullina.task4;
}