module com.example.vtoaula01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vtoaula01 to javafx.fxml;
    exports com.example.vtoaula01;
}