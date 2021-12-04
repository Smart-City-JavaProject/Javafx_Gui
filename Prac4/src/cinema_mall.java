import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class cinema_mall {

    @FXML
    private Button cinema_btn;

    @FXML
    private Button mall_btn;

    Stage arg0 = second.get_stage();

    @FXML
    void onSubmitbtnClick1(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Mall.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();

    }

    @FXML
    void onSubmitbtnClick2(ActionEvent event) throws IOException {
        System.out.println('l');

    }

}
