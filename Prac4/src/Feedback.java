import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Feedback implements Initializable {

    @FXML
    private TextArea feedback_input;

    @FXML
    private ImageView img_view;

    @FXML
    private TextField name_input;

    @FXML
    private Button ref_btn;

    @FXML
    private Button submit_btn;
    public static String num = 0.6709606409289153 + "";

    private void init() {
        // String name = nextcon.get_name();
        System.out.println("name");
        File file = new File("src/t1.jpg");
        Image image = new Image("https://avatars.dicebear.com/api/avataaars/" + num + ".png");
        img_view.setImage(image);
        // set_stage(new Stage());
        // testlabel.setText("Welcome To The Navi Mumbai " + name);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();
    }

    @FXML
    void refreshbtnclick(ActionEvent event) {
        num = Math.random() + " ";
        Image image = new Image("https://avatars.dicebear.com/api/avataaars/" + num + ".png");
        img_view.setImage(image);
    }

    @FXML
    void submit_click(ActionEvent event) {
        int id = Integer.parseInt(AccomodationInfo.get_acco_id().trim());
        String name = name_input.getText();
        String feedback = feedback_input.getText();
        System.out.println(id + " " + name + " " + feedback + " " + num + " ");
        try {

            JavaPostgreSql.feedback(name, feedback, id, num);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText("Feedback Submitted");
            alert.setContentText("Thank You For Your Feedback");
            alert.showAndWait();
        } catch (Exception e) {
            System.out.println("--->> " + e.getMessage());
        }
    }
}
