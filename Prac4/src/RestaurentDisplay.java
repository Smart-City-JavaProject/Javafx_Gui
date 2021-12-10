import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class RestaurentDisplay {

    @FXML
    private Label Nearplaces_label;

    @FXML
    private Label contact_id;

    @FXML
    private ImageView imag_v;

    @FXML
    private Label location_label;

    @FXML
    private Label my_rate;

    @FXML
    private Label my_rtype;

    @FXML
    private Label name_label;

    @FXML
    private Label sector_label;

    @FXML
    public void initialize() {
        String sector = RestaurentInfo.get_String();
        String location = RestaurentInfo.get_loc();
        String name12 = RestaurentInfo.get_name();
        String contact = RestaurentInfo.get_contact();
        String roomtype = RestaurentInfo.get_roomtype();
        String rating = RestaurentInfo.get_rating();
        name_label.setText(name12);
        sector_label.setText(sector);
        location_label.setText(location);
        contact_id.setText(contact);
        my_rtype.setText(roomtype);
        my_rate.setText(rating);
        location_label.setWrapText(true);
        location_label.setPrefWidth(300);
        my_rtype.setWrapText(true);
        my_rtype.setPrefWidth(300);
        try {
            String near = JavaPostgreSql.get_near_place("restaurant", sector.trim(), Restaurent.get_location().trim());
            if (near.length() > 0) {
                Nearplaces_label.setText(near);
            } else {
                Nearplaces_label.setText("No Near Places");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}