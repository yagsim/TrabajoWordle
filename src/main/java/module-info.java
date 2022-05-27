module com.example.trabajowordle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.trabajowordle to javafx.fxml;
    exports com.example.trabajowordle;
}