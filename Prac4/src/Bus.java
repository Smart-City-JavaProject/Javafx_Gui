import java.io.IOException;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Bus {
    ObservableList<String> my_list = FXCollections.observableArrayList(JavaPostgreSql.getbusno().split("\n"));

    @FXML
    private ChoiceBox<String> Busnos;

    @FXML
    private ImageView line1;

    @FXML
    private ImageView location1;

    @FXML
    private ImageView location2;

    @FXML
    private Rectangle shape1;

    @FXML
    private Button submitbtn;

    @FXML
    public void initialize() {
        Busnos.setValue(my_list.get(0).toString());
        Busnos.setItems(my_list);
    }

    public static Stage arg0 = second.get_stage();
    public static String bus_dep = "";

    public static void set_bus_dep(String bus_deps) {
        bus_dep = bus_deps;
    }

    public static String get_bus_dep() {
        return bus_dep;
    }

    public static String bus_no = "";

    public static void set_bus_no(String bus_nos) {
        bus_no = bus_nos;
    }

    public static String get_bus_no() {
        return bus_no;
    }

    @FXML
    void BusSubmit(ActionEvent event) throws IOException, SQLException {
        String from = Busnos.getValue();
        System.out.println(from);
        String name = JavaPostgreSql.getBus(from);
        System.out.println(name);
        set_bus_dep(name);
        set_bus_no(from);
        BusInfo.initialize();

    }

}
