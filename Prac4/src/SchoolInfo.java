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

public class SchoolInfo {

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

    static Stage stage = second.get_stage();

    static void onSubmitbtnClick() throws IOException {
        Class currentClass = new Object() {
        }.getClass().getEnclosingClass();
        Parent root = FXMLLoader.load(currentClass.getResource("DisplayInfoSchool.fxml"));
        Scene sc = new Scene(root);
        stage.setScene(sc);
        stage.setTitle("Smart City");
        stage.show();

    }

    public static void initialize() {
        String name = School.getName();
        System.out.println("Here We Go " + name);
        String lines[] = name.split("\n");
        String sector = JavaPostgreSql.get_String();
        String lines1[] = sector.split("\n");
        String location = JavaPostgreSql.get_loc();
        String lines2[] = location.split("\n");

        TableView<Person> table = new TableView<Person>();
        final ObservableList<Person> data = FXCollections.observableArrayList();
        final Label label = new Label("Search Results");
        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("Name");
        firstNameCol.setMinWidth(300);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, Label>("firstName"));

        TableColumn lastNameCol = new TableColumn("Sector");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, Label>("lastName"));

        TableColumn emailCol = new TableColumn("More Info");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Person, Button>("email"));

        try {
            stage.setTitle("Smart City");
            VBox vbox = new VBox();
            for (int i = 0; i < lines.length; i++) {
                Label labels = new Label(lines[i]);
                Label label12 = new Label(lines1[i]);
                Button bt = new Button("Show Info");
                data.add(new Person(labels, label12, bt));
                final int t1 = i;
                bt.setOnAction(value -> {
                    System.out.println("----->>>>> " + t1);
                    set_string(lines1[t1]);
                    set_loc(lines2[t1]);
                    set_name(lines[t1]);
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
            table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
            final VBox vbox1 = new VBox();
            vbox1.setSpacing(5);
            vbox1.setPadding(new Insets(10, 0, 0, 10));
            vbox1.getChildren().addAll(label, table);

            ((Group) scene.getRoot()).getChildren().addAll(vbox1);

            stage.setScene(scene);
            stage.setMinWidth(890);
            stage.setMinHeight(550);
            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static class Person {

        private Label firstName;
        private Label lastName;
        private Button email;

        private Person(Label fName, Label lName, Button email) {
            this.firstName = fName;
            this.lastName = lName;
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

        public Button getEmail() {
            return email;
        }

        public void setEmail(Button fName) {
            email = fName;
        }
    }
}