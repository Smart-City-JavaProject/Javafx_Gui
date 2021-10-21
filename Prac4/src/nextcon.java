import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class nextcon {

    @FXML
    private Button Submitbtn;

    @FXML
    private TextField inputbox;

    @FXML
    private Label labeltext;

    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        try {
            FileWriter writer = new FileWriter("MyFile.txt");
            writer.write(inputbox.getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage arg0 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Second.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
        
    }

}
