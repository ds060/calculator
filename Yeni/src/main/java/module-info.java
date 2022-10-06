module com.example.yeni {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yeni to javafx.fxml;
    exports com.example.yeni;
}