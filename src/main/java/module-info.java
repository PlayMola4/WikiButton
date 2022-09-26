module com.example.wikibutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wikibutton to javafx.fxml;
    exports com.example.wikibutton;
}