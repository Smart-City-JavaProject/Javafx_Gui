import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Bus {
    ObservableList<String> my_list = FXCollections.observableArrayList("Kharghar", "Nerul", "Panvel");
    ObservableList<String> my_list1 = FXCollections.observableArrayList("Nerul", "Panvel", "Kharghar");
    @FXML
    private ChoiceBox<String> choiceboc;

    @FXML
    private ChoiceBox<String> choiceboc1;
    @FXML
    private Button submitbtn;

    @FXML
    public void initialize() {
        choiceboc.setValue("Kharghar");
        choiceboc.setItems(my_list);
        choiceboc1.setValue("Nerul");
        choiceboc1.setItems(my_list1);
    }

    public static Stage arg0 = second.get_stage();

    @FXML
    void BusSubmit(ActionEvent event) throws IOException {

        String from = choiceboc1.getValue();
        String to = choiceboc.getValue();
        System.out.println(from + " " + to);

    }

}
