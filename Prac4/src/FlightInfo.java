import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlightInfo {
    static String sector = "";

    public static void set_string(String s) {
        sector = s;
    }

    public static String get_String() {
        return sector;
    }

    static String location = "";

    public static void set_loc(String s) {
        location = s;
    }

    public static String get_loc() {
        return location;
    }

    static String name = "";

    public static void set_name(String s) {
        name = s;
    }

    public static String get_name() {
        return name;
    }

    static String set_arrtimes = "";

    public static void set_arrtime(String s) {
        set_arrtimes = s;
    }

    public static String get_arrtime() {
        return set_arrtimes;
    }

    static Stage stage = second.get_stage();

    static void onSubmitbtnClick() throws IOException {
        System.out.println("po");
        try {

            Class currentClass = new Object() {
            }.getClass().getEnclosingClass();
            Parent root = FXMLLoader.load(currentClass.getResource("FlightDisplay.fxml"));
            Scene sc = new Scene(root);
            stage.setScene(sc);
            stage.setTitle("Smart City");
            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void initialize() {
        String name = Flight.getName();
        System.out.println("Here We Go " + name);
        String lines[] = name.split("\n");
        String sector = JavaPostgreSql.get_String();
        String lines1[] = sector.split("\n");
        String location = JavaPostgreSql.get_loc();
        String lines2[] = location.split("\n");
        String arrtime = JavaPostgreSql.get_mobile_no();
        String lines3[] = arrtime.split("\n");
        try {
            stage.setTitle("Smart City");
            VBox vbox = new VBox();
            System.out.println("Flight Info");
            for (int i = 0; i < lines.length; i++) {
                HBox hbox = new HBox();
                Label label = new Label(lines[i]);
                Label label12 = new Label(lines2[i]);
                Label label13 = new Label(lines3[i]);
                System.out.println("---->>>  " + name);
                Button bt = new Button("Show Info");

                final int t1 = i;
                bt.setOnAction(value -> {
                    System.out.println("----->>>>> " + t1);
                    set_string(lines1[t1]);
                    set_loc(lines2[t1]);
                    set_name(lines[t1]);
                    set_arrtime(lines3[t1]);
                    System.out.println("--->> " + get_name());
                    System.out.println("--->> " + get_loc());
                    System.out.println("--->> " + get_String());
                    try {
                        onSubmitbtnClick();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                hbox.getChildren().add(label);
                hbox.getChildren().add(label12);
                hbox.getChildren().add(label13);
                hbox.getChildren().add(bt);
                hbox.setSpacing(20);
                vbox.getChildren().add(hbox);
            }
            Scene scene = new Scene(vbox, 600, 400);
            stage.setScene(scene);
            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}