import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Restaurent {

    @FXML
    private TextField input_btn;

    @FXML
    private Label my_label;
    @FXML
    private Button sub_btn;
    public static String name = "";

    public void set_name(String names) {
        name = names;
    }

    public static String get_name() {
        return name;
    }

    public static String location = "";

    public void set_location(String names) {
        location = names;
    }

    public static String get_location() {
        return location;
    }

    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException, SQLException {
        System.out.println(input_btn.getText());
        String name_sc = JavaPostgreSql.getrestaurents(input_btn.getText().toString());
        set_name(name_sc);
        set_location(input_btn.getText().toString());
        System.out.println("--->. " + name_sc);
        if (name_sc.trim().length() > 1) {
            RestaurentInfo.initialize();

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Not Able to find the Restaurent");
            alert.showAndWait();
        }

    }
}
