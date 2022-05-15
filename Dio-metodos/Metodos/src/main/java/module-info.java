module com.example.metodos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metodos to javafx.fxml;
    exports com.example.metodos;
}