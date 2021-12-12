import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Mall {

    @FXML
    private TextField input_text;

    @FXML
    private Label my_label;
    @FXML
    private Button submit_btn;
    static String name_it = " ";

    public static void setItem(String item) {
        name_it = item;
    }

    public static String getName() {
        return name_it;
    }

    static String location_it = " ";

    public static void setlocation(String item) {
        location_it = item;
    }

    public static String getlocation() {
        return location_it;
    }

    @FXML
    void GetMallsBtn(ActionEvent event) {
        String Location = input_text.getText();
        setlocation(Location);
        String name = JavaPostgreSql.getmalls(Location);
        setItem(name);
        if (name.trim().length() > 1) {
            MallInfo.initialize();
            System.out.println(name);
        } else {
            my_label.setText("Enter Correct Spelling");
        }
    }

}
