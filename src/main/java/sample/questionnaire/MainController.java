package sample.questionnaire;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML

    public void openQuestionWindow() {

        try {
            FXMLLoader loader = new FXMLLoader(MainController.class.getResource("QuestionWindow.fxml"));
            AnchorPane root = loader.load();

            Stage questionStage = new Stage();
            questionStage.setTitle("Ditmemay");

            Scene scene = new Scene(root);
            questionStage.setScene(scene);
            questionStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}