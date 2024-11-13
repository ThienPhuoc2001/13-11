module sample.questionnaire {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.questionnaire to javafx.fxml;
    exports sample.questionnaire;
}