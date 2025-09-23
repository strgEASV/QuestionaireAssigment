module dk.easv.questionaire {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.questionaire to javafx.fxml;
    exports dk.easv.questionaire;
}