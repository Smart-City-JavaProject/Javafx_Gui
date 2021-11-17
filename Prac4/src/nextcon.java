import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class nextcon {

    @FXML
    private Button Submitbtn;

    @FXML
    private TextField inputbox;

    @FXML
    private Pane mypane;
    @FXML
    private Label labeltext;
    static String name = " ";

    public void set_name(String n) {
        name = n;
    }

    public static String get_name() {
        return name;
    }

    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        set_name(inputbox.getText());
        Stage arg0 = App.get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("Second.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();

    }

}
