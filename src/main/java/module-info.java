module com.example.oop_project_finalgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.oop_project_finalgui to javafx.fxml;
    exports com.example.oop_project_finalgui;
}