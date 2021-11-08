import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Police {

    @FXML
    private TextField city_name;

    @FXML
    private Button my_btn;
    static String name_it=" ";
    public static void setItem(String item) {
        name_it = item;
    }
    public static String getName() {
        return name_it;
    }
    @FXML 
    void onSubmitbtnClick(ActionEvent event) throws SQLException{
        String city = city_name.getText();
        System.out.println(city);
        String po = JavaPostgreSql.getpolice(city);
        System.out.println(po);
        Hospital.setItem(po);
        setItem(po);
        System.out.println(po);
        HospitalInfo.initialize();
    }
}
