import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Signup {

    @FXML
    private Button signinbtn;

    @FXML
    private Button signupbtn;

    @FXML
    private Button backbtn;

    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    void signinclick(ActionEvent event) throws IOException {
        Stage arg0 = App.get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Signin.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

    @FXML
    void signupclick(ActionEvent event) throws IOException {
        Boolean check = JavaPostgreSql.user_check(username.getText(), password.getText());
        if (check) {
            Stage arg0 = App.get_stage();
            Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
            Scene sc = new Scene(root);
            arg0.setScene(sc);
            arg0.setTitle("Smart City");
            arg0.show();
        } else {
            System.out.println("Wrong credentials");
        }
    }

    @FXML
    void backbtnclick(ActionEvent event) throws IOException {
        Stage arg0 = App.get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

}
