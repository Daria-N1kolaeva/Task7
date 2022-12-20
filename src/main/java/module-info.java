module com.example.task77 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task77 to javafx.fxml;
    exports com.example.task77;
}