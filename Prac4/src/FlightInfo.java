import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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

        TableView<Flight_Infos> table = new TableView<Flight_Infos>();
        final ObservableList<Flight_Infos> data = FXCollections.observableArrayList();
        final Label label = new Label("Search Results");
        label.setFont(new Font("Arial", 20));
        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("Name");
        firstNameCol.setMinWidth(350);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Flight_Infos, Label>("firstName"));

        TableColumn lastNameCol = new TableColumn("Sector");
        lastNameCol.setMinWidth(140);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Flight_Infos, Label>("lastName"));

        TableColumn timecols = new TableColumn("ArrivalTime");
        timecols.setMinWidth(140);
        timecols.setCellValueFactory(
                new PropertyValueFactory<Flight_Infos, Label>("times"));

        TableColumn emailCol = new TableColumn("More Info");
        emailCol.setMinWidth(250);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Flight_Infos, Button>("email"));

        try {
            stage.setTitle("Smart City");
            System.out.println("Flight Info");
            for (int i = 0; i < lines.length; i++) {
                Label labels = new Label(lines[i]);
                Label label12 = new Label(lines2[i]);
                Label label13 = new Label(lines3[i]);
                System.out.println("---->>>  " + name);
                Button bt = new Button("Show Info");

                data.add(new Flight_Infos(labels, label12, label13, bt));

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
            }
            Scene scene = new Scene(new Group());
            table.setItems(data);
            table.setMinHeight(500);
            table.getColumns().addAll(firstNameCol, lastNameCol, timecols, emailCol);

            final VBox vbox1 = new VBox();
            vbox1.setSpacing(5);
            vbox1.setPadding(new Insets(10, 0, 0, 10));
            vbox1.getChildren().addAll(label, table);
            try {
                ((Group) scene.getRoot()).getChildren().addAll(vbox1);
            } catch (Exception e) {
                System.out.println("-->> " + e.getMessage());
            }
            stage.setScene(scene);
            stage.setMinWidth(880);
            stage.setMinHeight(500);
            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static class Flight_Infos {

        private Label firstName;
        private Label lastName;
        private Label times;
        private Button email;

        private Flight_Infos(Label fName, Label lName, Label time, Button email) {
            this.firstName = fName;
            this.lastName = lName;
            this.times = time;
            this.email = email;
        }

        public Label getFirstName() {
            return firstName;
        }

        public void setFirstName(Label fName) {
            this.firstName = fName;
        }

        public Label getLastName() {
            return lastName;
        }

        public void setLastName(Label fName) {
            lastName = fName;
        }

        public Label getTimes() {
            return times;
        }

        public void setTimes(Label fName) {
            times = fName;
        }

        public Button getEmail() {
            return email;
        }

        public void setEmail(Button fName) {
            email = fName;
        }
    }
}