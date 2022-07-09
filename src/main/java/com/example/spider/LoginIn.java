package com.example.spider;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginIn {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button button;

    @FXML
    private Label wronglogin;

    @FXML
    void UserLogin(ActionEvent event) throws IOException {
            CheckLogin();
    }
    private void CheckLogin() throws IOException {
        HelloApplication m = new HelloApplication();
        if (username.getText().equals("java") && password.getText().equals("123")) {
            wronglogin.setText("Success!");
            m.changeScene("afterLogin.fxml");
        }
        if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wronglogin.setText("Please Enter Your Info");
        } else {
            wronglogin.setText("Wrong Username or Password");
        }
    }

}
