module com.example.test2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.fasterxml.jackson.databind;

    opens com.example.test2 to javafx.fxml;
    exports com.example.test2;
}