import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Restaurent {

    @FXML
    private TextField input_btn;

    @FXML
    private Button sub_btn;

    @FXML
    void onSubmitbtnClick(ActionEvent event) throws IOException, SQLException {
        System.out.println(input_btn.getText());
        String name_sc = JavaPostgreSql.getrestaurents(input_btn.getText().toString());
        Accomendation.setItem(name_sc);
        System.out.println("--->. " + name_sc);
        RestaurentInfo.initialize();

    }
}
