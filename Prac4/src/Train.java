import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class Train {
    ObservableList<String> my_list = FXCollections.observableArrayList(JavaPostgreSql.getnametrain().split("\n"));
    ObservableList<String> my_list1 = FXCollections.observableArrayList(JavaPostgreSql.getnamefromtrain().split("\n"));
    @FXML
    private ChoiceBox<String> choiceboc;

    @FXML
    private ChoiceBox<String> choiceboc1;
    @FXML
    private Button submitbtn;
    public static String name = "";

    public static void set_name(String n) {
        name = n;

    }

    public static String get_name() {
        return name;
    }

    @FXML
    public void initialize() {
        choiceboc.setValue(my_list.get(0).toString());
        choiceboc.setItems(my_list);
        choiceboc1.setValue("Panvel");
        choiceboc1.setItems(my_list1);
    }

    public static String from = "";
    public static String to = "";

    public static void set_from(String from_name) {
        from = from_name;
    }

    public static String get_from() {
        return from;
    }

    public static void set_to(String to_name) {
        to = to_name;
    }

    public static String get_to() {
        return to;
    }

    @FXML
    void Trainsubmit(ActionEvent event) throws SQLException {
        String From = choiceboc1.getValue();
        String To = choiceboc.getValue();
        System.out.println(From + " --->> " + To);
        String name = JavaPostgreSql.getTrains(From, To);
        System.out.println(name);
        set_name(name);
        set_from(From);
        set_to(To);
        TrainInfo.initialize();
    }

}
