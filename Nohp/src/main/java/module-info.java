module com.example.nohp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nohp to javafx.fxml;
    exports com.example.nohp;
}