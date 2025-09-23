package dk.easv.questionaire;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class QuestionWindowController {

    @FXML
    private Label participantLabel;

    public void setParticipantName(String name) {
        participantLabel.setText("Name of the participant: " + name);
    }
}