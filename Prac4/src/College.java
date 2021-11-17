import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class College {
    ObservableList<String> my_list = FXCollections.observableArrayList("Engineering", "Medical", "Commerce");
    @FXML
    private ChoiceBox<String> choiceboc;
    @FXML
    private Label my_label;
    @FXML
    private TextField inputbox;

    @FXML
    private Button submitbtn;

    @FXML
    public void initialize() {
        choiceboc.setValue("Engineering");
        choiceboc.setItems(my_list);

    }

    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        System.out.println(inputbox.getText());
        System.out.println(choiceboc.getValue());
        String name_sc = JavaPostgreSql.getschools(choiceboc.getValue().toString(), inputbox.getText().toString());
        School.setItem(name_sc);
        System.out.println(name_sc);
        String name = School.getName();
        System.out.println("Here We Go " + name);
        String lines[] = name.split("\n");
        System.out.println("--->>> " + lines.length);
        if (lines.length > 1) {
            SchoolInfo.initialize();
        } else {
            my_label.setText("Enter Correct Spelling");
        }
        // SchoolInfo.initialize();
    }

}
