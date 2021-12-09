import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class TrainDisplay {

    @FXML
    private Label Arrive;

    @FXML
    private Label To;

    @FXML
    private Label arrive_label;

    @FXML
    private Rectangle d_s_img;

    @FXML
    private Label fl_no;

    @FXML
    private Label from_label;

    @FXML
    private ImageView imag_v;

    @FXML
    private Label to_label;

    @FXML
    public void initialize() {
        String From = Train.get_from();
        System.out.println("FROM " + From);
        String To = Train.get_to();
        String location = TrainInfo.get_String();
        String time = TrainInfo.get_name();
        arrive_label.setText(time);
        fl_no.setText(location);
        from_label.setText(From);
        to_label.setText(To);

        // File file = new File("Images/school-icon-png-14043.png");
        // Image image = new Image(file.toURI().toString());
        // imag_v.setImage(image);

    }

}