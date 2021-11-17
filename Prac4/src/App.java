import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static Stage arg0;

    public void set_stage(Stage arg1) {
        arg0 = arg1;
    }

    public static Stage get_stage() {
        return arg0;
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        set_stage(arg0);
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene sc = new Scene(root);
        sc.getStylesheets().add(getClass().getResource("myc.css").toExternalForm());
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }
}
