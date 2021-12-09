import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class FlightDisplay {

    @FXML
    private Label Arrive;

    @FXML
    private Label To;

    @FXML
    private Label To2;

    @FXML
    private Label arrive_label;

    @FXML
    private Rectangle d_s_img;

    @FXML
    private Label dep_label;

    @FXML
    private Label fl_no;

    @FXML
    private Label from_label;

    @FXML
    private ImageView imag_v;

    @FXML
    private Label name_label;

    @FXML
    private Label to_label;

    @FXML
    public void initialize() {
        String sector = FlightInfo.get_String();
        String location = FlightInfo.get_loc();
        String name12 = FlightInfo.get_name();
        String time = FlightInfo.get_arrtime();
        arrive_label.setText(time);
        dep_label.setText(sector);
        fl_no.setText(location);
        from_label.setText(sector);
        to_label.setText(sector);
        name_label.setText(name12);

        // File file = new File("Images/school-icon-png-14043.png");
        // Image image = new Image(file.toURI().toString());
        // imag_v.setImage(image);

    }

}