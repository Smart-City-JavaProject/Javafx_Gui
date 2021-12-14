import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Signin {

    @FXML
    private TextField admincred;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Button siginbtn;

    @FXML
    private Button signupbtn;
    @FXML
    private Button backbtn;
    @FXML
    private TextField username;

    public static Boolean check_email(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        if (email.matches(emailRegex)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean check_if_empty(String name, String password) {
        if (name.isEmpty() || password.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    @FXML
    void siginclick(ActionEvent event) {
        System.out.println("Signin");
        Boolean check_cred = JavaPostgreSql.check_admin_credentials(admincred.getText());
        Boolean check_em = check_email(email.getText());
        if (check_cred & check_em) {
            JavaPostgreSql.create_user(username.getText(), password.getText(), email.getText(), admincred.getText());
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Success");
            alert.setContentText("User Created");
            alert.showAndWait();
        } else if (!check_em) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong Credentials");
            alert.setContentText("Email Is Not Valid");
            alert.showAndWait();
        } else if (!check_if_empty(username.getText(), password.getText())) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong Credentials");
            alert.setContentText("Username or Password is Empty");
            alert.showAndWait();
        } else if (!check_cred) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Wrong Credentials");
            alert.setContentText("Admin Credentials is Wrong");
            alert.showAndWait();
        }
    }

    @FXML
    void signupclick(ActionEvent event) throws IOException {
        Stage arg0 = App.get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();

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
