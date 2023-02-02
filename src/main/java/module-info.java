module com.aprendizaje.simplecrud.mensajes_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.aprendizaje.simplecrud.mensajes_app to javafx.fxml;
    exports com.aprendizaje.simplecrud.mensajes_app;
}