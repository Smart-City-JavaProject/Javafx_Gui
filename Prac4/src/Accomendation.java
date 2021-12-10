import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Accomendation {
    ObservableList<String> my_list = FXCollections.observableArrayList("Hotel", "PG");
    @FXML
    private Button my_btn;

    @FXML
    private ChoiceBox<String> my_choice_box;

    @FXML
    private TextField my_input;

    @FXML
    public void initialize() {
        my_choice_box.setValue("Hotel");
        my_choice_box.setItems(my_list);
    }

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
    void onSubmitbtnClick(ActionEvent event) throws SQLException {
        String c_box = (my_choice_box.getValue());
        String i_box = (my_input.getText());
        setlocation(i_box);
        String acc = JavaPostgreSql.getaccomendation(i_box, c_box);
        setItem(acc);
        System.out.println(acc);
        AccomodationInfo.initialize();
    }

}