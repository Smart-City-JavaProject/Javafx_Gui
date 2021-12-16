import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class SignInForm implements Initializable {

    @FXML
    private TextField email;

    @FXML
    private Circle my_circle;

    @FXML
    private PasswordField password;

    @FXML
    private Button refbtn;

    @FXML
    private Button siginbtn;

    @FXML
    private TextField username;

    @FXML
    private Button signup;

    @FXML
    private Button backbtn;

    public static String num = 0.6709606409289153 + "";

    private void init() {
        // String name = nextcon.get_name();
        System.out.println("name");
        File file = new File("src/t1.jpg");
        Image image = new Image("https://avatars.dicebear.com/api/avataaars/" + num + ".png");
        // img_view.setImage(image);
        // Circle cc = new Circle(40);
        my_circle.setFill(new ImagePattern(image));
        my_circle.setStroke(javafx.scene.paint.Color.BLACK);
        // set_stage(new Stage());
        // testlabel.setText("Welcome To The Navi Mumbai " + name);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();
    }

    @FXML
    void refclick(ActionEvent event) {
        num = Math.random() + " ";
        Image image = new Image("https://avatars.dicebear.com/api/avataaars/" + num + ".png");
        my_circle.setFill(new ImagePattern(image));
        my_circle.setStroke(javafx.scene.paint.Color.BLACK);
    }

    @FXML
    void siginclick(ActionEvent event) {
        String img_str = num;
        String email_str = email.getText();
        String password_str = password.getText();
        String username_str = username.getText();
        System.out.println(img_str + " " + email_str + " " + password_str + " " + username_str);
        try {
            if (Validate.validate_email(email_str) && Validate.isEmpty(username_str)
                    && Validate.isEmpty(password_str)) {

                JavaPostgreSql.create_user(username_str, password_str, email_str, img_str);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Success");
                alert.setContentText("Account Created Successfully");
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Error");
                alert.setContentText("Invalid Information");
                alert.showAndWait();
            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Account Already Exists");
            alert.showAndWait();
        }

    }

    @FXML
    void signupclick(ActionEvent event) throws IOException {
        Stage arg0 = App.get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("SignUpForm.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();

    }

    @FXML
    void backclick(ActionEvent event) throws IOException {
        Stage arg0 = App.get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

}
