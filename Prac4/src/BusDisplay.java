import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class BusDisplay {

    @FXML
    private Label To;

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
        String From = Bus.get_bus_dep();
        System.out.println("FROM " + From);
        String To = BusInfo.get_String();
        String bus_no = Bus.get_bus_no();
        fl_no.setText(bus_no);
        from_label.setText(From);
        to_label.setText(To);

        // File file = new File("Images/school-icon-png-14043.png");
        // Image image = new Image(file.toURI().toString());
        // imag_v.setImage(image);

    }

}
