import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccomodationInfo {
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

    static String contact = "";

    public static void set_contact(String s) {
        contact = s;
    }

    public static String get_contact() {
        return contact;
    }

    static String set_rent = "";

    public static void set_rent(String s) {
        set_rent = s;
    }

    public static String get_rent() {
        return set_rent;
    }

    static String roomtype = "";

    public static void set_roomtype(String s) {
        roomtype = s;
    }

    public static String get_roomtype() {
        return roomtype;
    }

    static String rating = "";

    public static void set_rating(String s) {
        rating = s;
    }

    public static String get_rating() {
        return rating;
    }

    static Stage stage = second.get_stage();

    static void onSubmitbtnClick() throws IOException {
        Class currentClass = new Object() {
        }.getClass().getEnclosingClass();
        Parent root = FXMLLoader.load(currentClass.getResource("AccomodotionDisplay.fxml"));
        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.setTitle("Smart City");
        stage.show();

    }

    public static void initialize() {
        String name = Accomendation.getName();
        System.out.println("Here We Go " + name);
        String lines[] = name.split("\n");
        String sector = JavaPostgreSql.get_String();
        String lines1[] = sector.split("\n");
        String location = JavaPostgreSql.get_loc();
        String lines2[] = location.split("\n");
        String contact = JavaPostgreSql.get_mobile_no();
        String contact1[] = contact.split("\n");
        String rent = JavaPostgreSql.get_cost();
        String rent1[] = rent.split("\n");
        String roomtype = JavaPostgreSql.get_roomtype();
        String roomtype1[] = roomtype.split("\n");
        String rating = JavaPostgreSql.get_ratings();
        String rating1[] = rating.split("\n");
        try {
            ;
            stage.setTitle("Smart City");
            VBox vbox = new VBox();
            for (int i = 0; i < lines.length; i++) {
                HBox hbox = new HBox();
                Label label = new Label(lines[i]);
                Label label12 = new Label(lines1[i]);
                Button bt = new Button("Show Info");

                final int t1 = i;
                bt.setOnAction(value -> {
                    System.out.println("----->>>>> " + t1);
                    set_string(lines1[t1]);
                    set_loc(lines2[t1]);
                    set_name(lines[t1]);
                    set_contact(contact1[t1]);
                    set_rent(rent1[t1]);
                    set_roomtype(roomtype1[t1]);
                    set_rating(rating1[t1]);
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