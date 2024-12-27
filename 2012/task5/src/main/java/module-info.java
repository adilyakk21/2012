module ru.shafigullina.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.shafigullina.task5 to javafx.fxml;
    exports ru.shafigullina.task5;
}