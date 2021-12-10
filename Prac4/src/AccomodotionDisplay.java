import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

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
    public void initialize() {
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
        location_label.setPrefWidth(300);
        my_rtype.setWrapText(true);
        my_rtype.setPrefWidth(300);
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

}