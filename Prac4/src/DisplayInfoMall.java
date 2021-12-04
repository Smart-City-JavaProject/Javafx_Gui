import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class DisplayInfoMall {

    @FXML
    private Rectangle d_s_img;

    @FXML
    private ImageView imag_v;

    @FXML
    private Label location_label;

    @FXML
    private Label name_label;

    @FXML
    private Label sector_label;

    @FXML
    private Label timinig_label;

    @FXML
    public void initialize() {
        try {

            String sector = MallInfo.get_String();
            String location = MallInfo.get_loc();
            String name12 = MallInfo.get_name();
            String Timing = MallInfo.get_timing();
            timinig_label.setText(Timing);
            name_label.setText(name12);
            sector_label.setText(sector);
            location_label.setText(location);
            location_label.setWrapText(true);
            location_label.setPrefWidth(300);
        } catch (Exception e) {
            System.out.println("--->>> " + e);
        }

        // File file = new File("Images/school-icon-png-14043.png");
        // Image image = new Image(file.toURI().toString());
        // imag_v.setImage(image);

    }
}
