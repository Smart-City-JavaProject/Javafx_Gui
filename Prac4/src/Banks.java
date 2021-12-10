import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Banks {

    ObservableList<String> my_list = FXCollections.observableArrayList(JavaPostgreSql.getnamebanks().split("\n"));
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
        choiceboc.setValue("Union Bank Of India");
        choiceboc.setItems(my_list);

    }

    static String name_it = " ";

    public static void setItem(String item) {
        name_it = item;
    }

    public static String getName() {
        return name_it;
    }

    static String name_location = " ";

    public static void setlocation(String item) {
        name_location = item;
    }

    public static String getlocation() {
        return name_location;
    }

    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException {
        System.out.println(inputbox.getText());
        System.out.println(choiceboc.getValue());
        String Location = inputbox.getText();
        setlocation(Location);
        System.out.println("Location " + Location);
        String name_sc = JavaPostgreSql.getbanks(inputbox.getText().toString(), choiceboc.getValue().toString());
        setItem(name_sc);
        System.out.println("--->. " + name_sc);
        BanksInfo.initialize();

    }

}