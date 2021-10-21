import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class second implements Initializable  {

    @FXML
    private ImageView but1im;

    @FXML
    private Button obut1;

    @FXML
    private Label testlabel;

    private void init() {
        String name="";
        try {
            FileReader reader = new FileReader("MyFile.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
                name+=(char) character;
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        testlabel.setText("Welcome To The Navi Mumbai "+name);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();
        
    }

}
