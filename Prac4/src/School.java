import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class School{
    ObservableList <String> my_list = FXCollections.observableArrayList("ICSE","CBSE","State Board");
    @FXML
    private ChoiceBox<String> choiceboc;

    @FXML
    private TextField inputbox;

    @FXML
    private Button submitbtn;
    @FXML
    public void initialize() {
        // ChoiceBox cb = new ChoiceBox();
        // cb.getItems().addAll("item1", "item2", "item3");
        choiceboc.setValue("State Board");
        choiceboc.setItems(my_list);

    }

}
