module com.example.jenkimsdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jenkimsdemo to javafx.fxml;
    exports com.example.jenkimsdemo;
}