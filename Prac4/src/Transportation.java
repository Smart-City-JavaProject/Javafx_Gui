import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Transportation {

    @FXML
    private ImageView but1im;

    @FXML
    private ImageView but1im1;

    @FXML
    private ImageView but1im2;

    @FXML
    private Label labeltext;

    @FXML
    private Button obut1;

    @FXML
    private Button obut11;

    @FXML
    private Button obut12;
    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        Stage arg0 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Bus.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

    @FXML
    void onSubmitbtnClick1(ActionEvent event) throws IOException {
        Stage arg0 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Flight.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();    }
    @FXML
    void onSubmitbtnClick3(ActionEvent event) throws IOException {
        Stage arg0 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Train.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

}