package dk.easv.questionaire;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class QuestionWindowController implements Initializable {

    @FXML
    private Label participantLabel;

    @FXML
    private Button calculateScoreButton;

    @FXML
    private Text scoreText;

    private ToggleGroup question1Group = new ToggleGroup();
    private ToggleGroup question2Group = new ToggleGroup();
    private ToggleGroup question3Group = new ToggleGroup();
    private ToggleGroup question4Group = new ToggleGroup();
    private ToggleGroup question5Group = new ToggleGroup();
    private ToggleGroup question6Group = new ToggleGroup();
    private ToggleGroup question7Group = new ToggleGroup();
    private ToggleGroup question8Group = new ToggleGroup();
    private ToggleGroup question9Group = new ToggleGroup();

    @FXML
    private RadioButton q1Disagree;
    @FXML
    private RadioButton q1Neutral;
    @FXML
    private RadioButton q1Agree;

    @FXML
    private RadioButton q2Disagree;
    @FXML
    private RadioButton q2Neutral;
    @FXML
    private RadioButton q2Agree;

    @FXML
    private RadioButton q3Disagree;
    @FXML
    private RadioButton q3Neutral;
    @FXML
    private RadioButton q3Agree;

    @FXML
    private RadioButton q4Disagree;
    @FXML
    private RadioButton q4Neutral;
    @FXML
    private RadioButton q4Agree;

    @FXML
    private RadioButton q5Disagree;
    @FXML
    private RadioButton q5Neutral;
    @FXML
    private RadioButton q5Agree;

    @FXML
    private RadioButton q6Disagree;
    @FXML
    private RadioButton q6Neutral;
    @FXML
    private RadioButton q6Agree;

    @FXML
    private RadioButton q7Disagree;
    @FXML
    private RadioButton q7Neutral;
    @FXML
    private RadioButton q7Agree;

    @FXML
    private RadioButton q8Disagree;
    @FXML
    private RadioButton q8Neutral;
    @FXML
    private RadioButton q8Agree;

    @FXML
    private RadioButton q9Disagree;
    @FXML
    private RadioButton q9Neutral;
    @FXML
    private RadioButton q9Agree;

    public void setParticipantName(String name) {
        participantLabel.setText("Name of the participant: " + name);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Set up toggle groups for each question
        setupToggleGroups();

        // Set up the calculate score button action
        calculateScoreButton.setOnAction(event -> calculateScore());
    }

    private void setupToggleGroups() {
        // q 1
        q1Disagree.setToggleGroup(question1Group);
        q1Neutral.setToggleGroup(question1Group);
        q1Agree.setToggleGroup(question1Group);

        // q 2
        q2Disagree.setToggleGroup(question2Group);
        q2Neutral.setToggleGroup(question2Group);
        q2Agree.setToggleGroup(question2Group);

        // q 3
        q3Disagree.setToggleGroup(question3Group);
        q3Neutral.setToggleGroup(question3Group);
        q3Agree.setToggleGroup(question3Group);

        // q 4
        q4Disagree.setToggleGroup(question4Group);
        q4Neutral.setToggleGroup(question4Group);
        q4Agree.setToggleGroup(question4Group);

        // q 5
        q5Disagree.setToggleGroup(question5Group);
        q5Neutral.setToggleGroup(question5Group);
        q5Agree.setToggleGroup(question5Group);

        // q 6
        q6Disagree.setToggleGroup(question6Group);
        q6Neutral.setToggleGroup(question6Group);
        q6Agree.setToggleGroup(question6Group);

        // q 7
        q7Disagree.setToggleGroup(question7Group);
        q7Neutral.setToggleGroup(question7Group);
        q7Agree.setToggleGroup(question7Group);

        // q 8
        q8Disagree.setToggleGroup(question8Group);
        q8Neutral.setToggleGroup(question8Group);
        q8Agree.setToggleGroup(question8Group);

        // q 9
        q9Disagree.setToggleGroup(question9Group);
        q9Neutral.setToggleGroup(question9Group);
        q9Agree.setToggleGroup(question9Group);
    }

    private void calculateScore() {
        int totalScore = 0;

        totalScore += getQuestionScore(question1Group);
        totalScore += getQuestionScore(question2Group);
        totalScore += getQuestionScore(question3Group);
        totalScore += getQuestionScore(question4Group);
        totalScore += getQuestionScore(question5Group);
        totalScore += getQuestionScore(question6Group);
        totalScore += getQuestionScore(question7Group);
        totalScore += getQuestionScore(question8Group);
        totalScore += getQuestionScore(question9Group);

        scoreText.setText("Score: " + totalScore);
    }

    private int getQuestionScore(ToggleGroup group) {
        RadioButton selectedButton = (RadioButton) group.getSelectedToggle();
        if (selectedButton == null) {
            return 0;
        }

        String buttonText = selectedButton.getText();
        switch (buttonText) {
            case "Agree":
                return 1;
            case "Neutral":
                return 0;
            case "Disagree":
                return -1;
            default:
                return 0;
        }
    }
}