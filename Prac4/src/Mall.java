import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Mall {

    @FXML
    private TextField input_text;

    @FXML
    private Button submit_btn;
    static String name_it = " ";

    public static void setItem(String item) {
        name_it = item;
    }

    public static String getName() {
        return name_it;
    }

    @FXML
    void GetMallsBtn(ActionEvent event) {
        String Location = input_text.getText();
        String name = JavaPostgreSql.getmalls(Location);
        setItem(name);
        MallInfo.initialize();
        System.out.println(name);
    }

}
