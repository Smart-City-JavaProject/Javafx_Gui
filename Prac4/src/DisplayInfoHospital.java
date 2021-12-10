import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class DisplayInfoHospital {

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
    public void initialize() {
        String sector = HospitalInfo.get_String();
        String location = HospitalInfo.get_loc();
        String name12 = HospitalInfo.get_name();
        String contact = HospitalInfo.get_contact();
        name_label.setText(name12);
        sector_label.setText(sector);
        location_label.setText(location);
        contact_id.setText(contact);
        location_label.setWrapText(true);
        location_label.setPrefWidth(300);
        try {
            String near = JavaPostgreSql.get_near_place("hospital", sector.trim(), Hospital.getlocation());
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
