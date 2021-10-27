import java.io.FileReader;
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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class second implements Initializable  {

    @FXML
    private ImageView but1im;

    @FXML
    private Button obut1;

    @FXML
    private Label testlabel;

    private void init() {
        String name = nextcon.get_name();
        testlabel.setText("Welcome To The Navi Mumbai "+name);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();  
    }
    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        Stage arg0 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Education.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
        
    }
    @FXML
    void onSubmitbtnClick1(ActionEvent event) throws IOException {
        Stage arg0 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Transportation.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
        
    }

}
