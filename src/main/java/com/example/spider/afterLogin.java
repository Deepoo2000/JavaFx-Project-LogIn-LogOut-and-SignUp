package com.example.spider;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class afterLogin {

    @FXML
    private Button logout;

    @FXML
    public void UserLog(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("SignUp.fxml");
    }


}
