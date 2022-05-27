module com.example.trabajowordle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;

    opens com.example.trabajowordle to javafx.fxml;
    exports com.example.trabajowordle;
}