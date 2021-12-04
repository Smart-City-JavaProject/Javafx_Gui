import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Cinema {

    @FXML
    private TextField Location_text;

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
    void cinemasub(ActionEvent event) {
        String location = (Location_text.getText());
        String name = JavaPostgreSql.getcinema(location);
        System.out.println(name);
        setItem(name);
        CinemaInfo.initialize();

    }

}