import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class DisplayInfoSchool {

    @FXML
    private Label Nearplaces_label;

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
        String sector = SchoolInfo.get_String();
        String location = SchoolInfo.get_loc();
        String name12 = SchoolInfo.get_name();
        name_label.setText(name12);
        name_label.setPrefWidth(400);
        name_label.setWrapText(true);
        sector_label.setText(sector);
        location_label.setText(location);
        location_label.setPrefWidth(400);
        location_label.setWrapText(true);
        try {
            String near = JavaPostgreSql.get_near_place("education", sector.trim(), School.getlocation());
            if (near.length() > 0) {
                Nearplaces_label.setText(near);
            } else {
                Nearplaces_label.setText("No Near Places");
            }
        } catch (Exception e) {
            Nearplaces_label.setText("No Near Places");
            System.out.println(e);
        }

        // File file = new File("Images/school-icon-png-14043.png");
        // Image image = new Image(file.toURI().toString());
        // imag_v.setImage(image);

    }
}
