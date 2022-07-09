package com.example.spider;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignUp {
    @FXML
    private Button SignUp;

    @FXML
    private TextField FirstNameUp;

    @FXML
    private TextField LastNameUp;

    @FXML
    private TextField EmailUp;

    @FXML
    private PasswordField PasswordUp;
    @FXML
    private Label Print;
    @FXML
    void GoToLogOut(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
         if(FirstNameUp.getText().equals("ahmed")&&LastNameUp.getText().equals("eldeeb")
          && EmailUp.getText().equals("ahmed123")&&PasswordUp.getText().equals("123")){
                 Print.setText("Success!");
                 m.changeScene("hello-view.fxml");
         }
         if(FirstNameUp.getText().isEmpty() || LastNameUp.getText().isEmpty()
         || EmailUp.getText().isEmpty() || PasswordUp.getText().isEmpty()){
             Print.setText("Enter Your Info");
         }
         else {
             Print.setText("Enter a Valid Info");
         }
    }
}
