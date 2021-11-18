import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class second implements Initializable {

    @FXML
    private ImageView but1im;

    @FXML
    private Button obut1;

    @FXML
    private ImageView but1im12;

    @FXML
    private ImageView but1im13;
    @FXML
    private Label testlabel;

    private void init() {
        String name = nextcon.get_name();
        set_stage(new Stage());
        testlabel.setText("Welcome To The Navi Mumbai " + name);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();
    }

    public static Stage arg0;

    public void set_stage(Stage arg1) {
        arg0 = arg1;
        arg0.getIcons().add(new Image("file:Images/t1.jpg"));

    }

    public static Stage get_stage() {
        return arg0;
    }

    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        Stage arg0 = get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Education.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();

    }

    @FXML
    void onSubmitbtnClick1(ActionEvent event) throws IOException {
        Stage arg0 = get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Transportation.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

    @FXML
    void onSubmitbtnClick3(ActionEvent event) throws IOException {
        Stage arg0 = get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Hospital.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

    @FXML
    void onSubmitbtnClick4(ActionEvent event) throws IOException {
        Stage arg0 = get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Police.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

    @FXML
    void onSubmitbtnClick5(ActionEvent event) throws IOException {
        System.out.println("--->>>");
        Stage arg0 = get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Accomendation.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

    @FXML
    void onSubmitbtnClick6(ActionEvent event) throws IOException {
        System.out.println("--->>>");
        Stage arg0 = get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Banks.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

}
