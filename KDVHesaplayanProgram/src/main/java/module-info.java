module com.example.kdvhesaplayanprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kdvhesaplayanprogram to javafx.fxml;
    exports com.example.kdvhesaplayanprogram;
}