import java.io.File;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DisplayInfoSchool {

    @FXML
    private Label Nearplaces_label;

    @FXML
    private ImageView imag_v;

    @FXML
    private Label location_label;

    @FXML
    private  Label name_label;

    @FXML
    private Label sector_label;
    @FXML
    public void initialize() {
        String sector = SchoolInfo.get_String();
        String location = SchoolInfo.get_loc();
        String name12 = SchoolInfo.get_name();
        name_label.setText(name12);
        sector_label.setText(sector);
        location_label.setText(location);
        location_label.setWrapText(true);
        location_label.setPrefWidth(300);

        File file = new File("Images/school-icon-png-14043.png");
        Image image = new Image(file.toURI().toString());
        imag_v.setImage(image);

    }
}
