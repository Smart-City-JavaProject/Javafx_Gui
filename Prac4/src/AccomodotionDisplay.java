import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AccomodotionDisplay {

    @FXML
    private Label Nearplaces_label;

    @FXML
    private Label contact_id;

    @FXML
    private ImageView imag_v;

    @FXML
    private Label location_label;

    @FXML
    private Label name_label;

    @FXML
    private Label sector_label;

    @FXML
    private Label my_rent;

    @FXML
    private Label my_rtype;

    @FXML
    private Label my_rate;
    @FXML
    private Button give_feed;

    @FXML
    private Button show_btn;
    static Stage my_st;

    public void setStage(Stage stage) {
        my_st = stage;
    }

    public static Stage getStage() {
        return my_st;
    }

    @FXML
    public void initialize() {
        setStage(new Stage());
        String sector = AccomodationInfo.get_String();
        String location = AccomodationInfo.get_loc();
        String name12 = AccomodationInfo.get_name();
        String contact = AccomodationInfo.get_contact();
        String rent = AccomodationInfo.get_rent();
        String roomtype = AccomodationInfo.get_roomtype();
        String rating = AccomodationInfo.get_rating();
        name_label.setText(name12);
        sector_label.setText(sector);
        location_label.setText(location);
        contact_id.setText(contact);
        my_rent.setText(rent);
        my_rtype.setText(roomtype);
        my_rate.setText(rating);
        location_label.setWrapText(true);
        location_label.setPrefWidth(400);
        my_rtype.setWrapText(true);
        my_rtype.setPrefWidth(400);
        try {
            String near = JavaPostgreSql.get_near_place("accomodation", sector.trim(),
                    Accomendation.getlocation().trim());
            if (near.length() > 0) {
                Nearplaces_label.setText(near);
            } else {
                Nearplaces_label.setText("No Near Places");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    void give_feed_click(ActionEvent event) throws IOException {
        Stage arg0 = getStage();
        Parent root = FXMLLoader.load(getClass().getResource("Feedback.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }

    @FXML
    void show_feed_click(ActionEvent event) throws IOException {
        ShowFeedBack.initialize();
    }

}