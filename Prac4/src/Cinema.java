import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Cinema {

    @FXML
    private TextField Location_text;

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
    void cinemasub(ActionEvent event) {
        String location = (Location_text.getText());
        String name = JavaPostgreSql.getcinema(location);
        System.out.println(name);
        setlocation(location);
        if (name.trim().length() > 1) {
            setItem(name);
            CinemaInfo.initialize();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Not Able to find the Cinema");
            alert.showAndWait();
        }

    }

}