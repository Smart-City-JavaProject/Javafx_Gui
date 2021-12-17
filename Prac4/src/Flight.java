import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Flight {
    ObservableList<String> my_list = FXCollections.observableArrayList(JavaPostgreSql.getnameflight().split("\n"));
    ObservableList<String> my_list1 = FXCollections.observableArrayList("Mumbai");
    @FXML
    private ChoiceBox<String> tobox;

    @FXML
    private ChoiceBox<String> frombox;
    @FXML
    private Button submitbtn;
    public static Stage arg0 = second.get_stage();

    @FXML
    public void initialize() {
        tobox.setValue(my_list.get(0).toString());
        tobox.setItems(my_list);
        frombox.setValue("Mumbai");
        frombox.setItems(my_list1);
    }

    static String name = "";

    public static void set_name(String name_val) {
        name = name_val;
    }

    public static String getName() {
        return name;
    }

    static String from = "";

    public static void set_from(String name_val) {
        from = name_val;
    }

    public static String getfrom() {
        return from;
    }

    static String to = "";

    public static void set_to(String name_val) {
        to = name_val;
    }

    public static String getto() {
        return to;
    }

    @FXML
    void FlightSubmit(ActionEvent event) throws SQLException {
        String from = frombox.getValue();
        String to = tobox.getValue();
        set_from(from);
        set_to(to);
        String name = JavaPostgreSql.getFlight(from, to);
        System.out.println("name is " + name);
        set_name(name);
        FlightInfo.initialize();
    }

}
