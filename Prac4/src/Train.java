import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Train{
    ObservableList <String> my_list = FXCollections.observableArrayList("Kharghar","Nerul","Panvel");
    ObservableList <String> my_list1 = FXCollections.observableArrayList("Nerul","Panvel","Kharghar");
    @FXML
    private ChoiceBox<String> choiceboc;

    @FXML
    private ChoiceBox<String> choiceboc1;
    @FXML
    private Button submitbtn;
    @FXML
    public void initialize() {
        // ChoiceBox cb = new ChoiceBox();
        // cb.getItems().addAll("item1", "item2", "item3");
        choiceboc.setValue("Kharghar");
        choiceboc.setItems(my_list);
        choiceboc1.setValue("Nerul");
        choiceboc1.setItems(my_list1);

    }

}
