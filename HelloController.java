package org.example.amnashouqifinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void submit(ActionEvent event) {
        welcomeText.setText("Thanks for your submission!");
    }

}