import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Hospital {

    @FXML
    private TextField my_input;

    @FXML
    private Button submit_btn;
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
    void onSubmitbtnClick(ActionEvent event) throws IOException, SQLException {
        String city_name = my_input.getText();
        setlocation(city_name);
        String ho = JavaPostgreSql.gethospitals(city_name);
        System.out.println(ho);
        System.out.println(JavaPostgreSql.get_String());
        System.out.println(JavaPostgreSql.get_loc());
        System.out.println("locccc --->>" + JavaPostgreSql.get_mobile_no());
        // System.out.println(choiceboc.getValue());
        // String name_sc =
        // JavaPostgreSql.getActorCount(choiceboc.getValue().toString(),inputbox.getText().toString());
        // setItem(name_sc);
        // System.out.println(name_sc);
        // my_label.setText(name_sc);
        // SchoolInfo.initialize();
        setItem(ho);
        System.out.println(ho);
        HospitalInfo.initialize();
    }
}
