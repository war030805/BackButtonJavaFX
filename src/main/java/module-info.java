module kdg.be.backbutton {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens kdg.be.backbutton to javafx.fxml;
}