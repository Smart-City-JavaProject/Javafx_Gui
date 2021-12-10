import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class School {
    ObservableList<String> my_list = FXCollections.observableArrayList("ICSE", "CBSE", "State Board");
    @FXML
    private ChoiceBox<String> choiceboc;
    @FXML
    private TextField inputbox;
    @FXML
    private Label my_label;
    @FXML
    private Button submitbtn;

    @FXML
    public void initialize() {
        choiceboc.setValue("State Board");
        choiceboc.setItems(my_list);

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
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        System.out.println(inputbox.getText());
        System.out.println(choiceboc.getValue());
        setlocation(inputbox.getText());
        String name_sc = JavaPostgreSql.getcolleges(choiceboc.getValue().toString(), inputbox.getText().toString());
        setItem(name_sc);
        System.out.println(name_sc);
        my_label.setText(name_sc);
        String name = School.getName();
        System.out.println("Here We Go " + name);
        String lines[] = name.split("\n");
        System.out.println("--->>> " + lines.length);
        if (lines.length > 1) {
            System.out.println('p');
            SchoolInfo.initialize();
        } else {
            my_label.setText("Enter Correct Spelling");
        }
    }

}
