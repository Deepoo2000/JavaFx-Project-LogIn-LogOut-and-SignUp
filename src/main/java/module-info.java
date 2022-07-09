module com.example.spider {
    requires javafx.controls;
    requires javafx.fxml;
    requires fontawesomefx;


    opens com.example.spider to javafx.fxml;
    exports com.example.spider;
}