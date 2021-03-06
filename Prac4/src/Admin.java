import java.io.IOException;

import javax.swing.event.ChangeListener;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Admin {
    @FXML
    private TextField address_input;

    @FXML
    private Label address_label;

    @FXML
    private ChoiceBox<String> choice;

    @FXML
    private Pane address_pane;

    @FXML
    private TextField cno_input;

    @FXML
    private Label cno_label;

    @FXML
    private TextField cost_input;

    @FXML
    private Label cost_label;

    @FXML
    private Pane cost_pane;
    @FXML
    private Pane cno_pane;

    @FXML
    private TextField locality_input;

    @FXML
    private Label locality_label;

    @FXML
    private Pane locality_pane;

    @FXML
    private Button my_submit;

    @FXML
    private Circle mycircle;

    @FXML
    private Label mylabel;

    @FXML
    private TextField name_input;

    @FXML
    private Label name_label;

    @FXML
    private Pane name_pane;

    @FXML
    private TextField rating_input;

    @FXML
    private Label rating_label;

    @FXML
    private Pane rating_pane;

    @FXML
    private TextField roomtype_input;

    @FXML
    private Label roomtype_label;

    @FXML
    private Pane roomtype_pane;

    @FXML
    private TextField sector_input;

    @FXML
    private Label sector_label;

    @FXML
    private Pane sector_pane;

    @FXML
    private TextField type_input;

    @FXML
    private Label type_label;

    @FXML
    private Pane type_pane;

    public void remove_all() {
        this.name_input.visibleProperty().set(false);
        this.address_input.visibleProperty().set(false);
        this.cno_input.visibleProperty().set(false);
        this.cost_input.visibleProperty().set(false);
        this.locality_input.visibleProperty().set(false);
        this.rating_input.visibleProperty().set(false);
        this.roomtype_input.visibleProperty().set(false);
        this.sector_input.visibleProperty().set(false);
        this.type_input.visibleProperty().set(false);

        this.cost_pane.visibleProperty().set(false);
        this.address_pane.visibleProperty().set(false);
        this.cno_pane.visibleProperty().set(false);
        this.locality_pane.visibleProperty().set(false);
        this.name_pane.visibleProperty().set(false);
        this.rating_pane.visibleProperty().set(false);
        this.roomtype_pane.visibleProperty().set(false);
        this.sector_pane.visibleProperty().set(false);
        this.type_pane.visibleProperty().set(false);

        this.cno_label.setText("");
        this.cost_label.setText("");
        this.locality_label.setText("");
        this.name_label.setText("");
        this.rating_label.setText("");
        this.roomtype_label.setText("");
        this.sector_label.setText("");
        this.type_label.setText("");
        this.address_label.setText("");

    }

    public void make_education() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Contact");
        rating_label.setText("Board");
        roomtype_label.setText("Stream");
        type_label.setText("Type");
        locality_label.setText("Locality");
        sector_label.setText("Sector");
        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        rating_input.visibleProperty().set(true);
        roomtype_input.visibleProperty().set(true);
        type_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        sector_pane.visibleProperty().set(true);
        roomtype_pane.visibleProperty().set(true);
        rating_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        name_pane.visibleProperty().set(true);
        type_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
    }

    public void make_restaurent() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Contact");
        rating_label.setText("Rating");
        type_label.setText("Type");
        locality_label.setText("Locality");
        sector_label.setText("Sector");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        rating_input.visibleProperty().set(true);
        type_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        rating_pane.visibleProperty().set(true);
        type_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    public void make_banks() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Contact");

        locality_label.setText("Locality");
        sector_label.setText("Sector");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);

        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    public void make_accomodotion() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Contact");
        rating_label.setText("Rating");
        roomtype_label.setText("Room Type");
        type_label.setText("Type");
        locality_label.setText("Locality");
        sector_label.setText("Sector");
        cost_label.setText("Cost");
        this.cost_pane.visibleProperty().set(true);

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        rating_input.visibleProperty().set(true);
        roomtype_input.visibleProperty().set(true);
        type_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);
        cost_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        rating_pane.visibleProperty().set(true);
        roomtype_pane.visibleProperty().set(true);
        type_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);

    }

    public void make_cinema() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Contact");
        rating_label.setText("Web");
        locality_label.setText("Locality");
        sector_label.setText("Sector");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        rating_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        rating_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    public void make_flight() {
        remove_all();
        name_label.setText("Airline");
        address_label.setText("Flight No");
        cno_label.setText("Departure");
        rating_label.setText("Arrival");
        locality_label.setText("Departure Time");
        sector_label.setText("Arrival Time");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        rating_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        rating_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    public void make_hospital() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Contact");
        locality_label.setText("Locality");
        sector_label.setText("Sector");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    public void make_police_station() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Contact");
        locality_label.setText("Locality");
        sector_label.setText("Sector");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    public void make_mall() {
        remove_all();
        name_label.setText("Name");
        address_label.setText("Address");
        cno_label.setText("Time");
        locality_label.setText("Locality");
        sector_label.setText("Sector");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        cno_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        cno_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    public void make_bus() {
        remove_all();
        name_label.setText("Departure");
        address_label.setText("Arrival");
        locality_label.setText("Bus No");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);

        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
    }

    public void make_train() {
        remove_all();
        name_label.setText("Departure");
        address_label.setText("Arrival");
        locality_label.setText("Train No");
        sector_label.setText("Dep Time");

        name_input.visibleProperty().set(true);
        address_input.visibleProperty().set(true);
        locality_input.visibleProperty().set(true);
        sector_input.visibleProperty().set(true);
        name_pane.visibleProperty().set(true);
        address_pane.visibleProperty().set(true);
        locality_pane.visibleProperty().set(true);
        sector_pane.visibleProperty().set(true);
    }

    @FXML
    public void initialize() {
        make_accomodotion();
        Image image = new Image("https://avatars.dicebear.com/api/avataaars/" + JavaPostgreSql.get_String() + ".png");
        mycircle.setFill(new ImagePattern(image));
        mycircle.setStroke(javafx.scene.paint.Color.BLACK);
        mylabel.setText(SignupForm.get_str());
        mylabel.setPrefWidth(200);
        JavaPostgreSql.getAllTablename();
        ObservableList<String> my_lists = FXCollections.observableArrayList(JavaPostgreSql.get_table_name());
        choice.setValue("accomodation");

        choice.setItems(my_lists);

        choice.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    String name = (choice.getItems().get((Integer) new_val));
                    if (name.equals("education")) {
                        make_education();
                    } else if (name.equals("banks")) {
                        make_banks();
                    } else if (name.equals("accomodation")) {
                        make_accomodotion();
                    } else if (name.equals("cinema")) {
                        make_cinema();
                    } else if (name.equals("hospital")) {
                        make_hospital();
                    } else if (name.equals("mall")) {
                        make_mall();
                    } else if (name.equals("police_station")) {
                        make_police_station();
                    } else if (name.equals("restaurant")) {
                        make_restaurent();
                    } else if (name.equals("bus")) {
                        make_bus();
                    } else if (name.equals("train")) {
                        make_train();
                    } else if (name.equals("flight")) {
                        make_flight();
                    }
                });
    }

    @FXML
    void submitbtn(ActionEvent event) {
        try {

            if (choice.getValue().equals("banks")) {
                System.out.println("name " + name_input.getText());
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_contact(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())) {
                    JavaSQLInsert.insert_Banks(name_input.getText(), address_input.getText(), sector_input.getText(),
                            cno_input.getText(),
                            locality_input.getText());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }
            } else if (choice.getValue().equals("education")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_contact(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())
                        && Validate.validate_info(rating_input.getText())
                        && Validate.validate_info(roomtype_input.getText())
                        && Validate.validate_info(type_input.getText())) {
                    JavaSQLInsert.insert_education(name_input.getText(), locality_input.getText(),
                            address_input.getText(),
                            cno_input.getText(),
                            sector_input.getText(), type_input.getText(), rating_input.getText(),
                            roomtype_input.getText());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }
            } else if (choice.getValue().equals("accomodation")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_contact(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())
                        && Validate.validate_rating(rating_input.getText())
                        && Validate.validate_info(roomtype_input.getText())
                        && Validate.validate_info(type_input.getText())) {
                    JavaSQLInsert.insert_accomodation(name_input.getText(), locality_input.getText(),
                            address_input.getText(),
                            cno_input.getText(), sector_input.getText(), type_input.getText(), cost_input.getText(),
                            roomtype_input.getText(), rating_input.getText());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }

            } else if (choice.getValue().equals("cinema")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_contact(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())
                        && Validate.validate_url(rating_input.getText())) {
                    JavaSQLInsert.insert_cinema(name_input.getText(), address_input.getText(), cno_input.getText(),
                            rating_input.getText(),
                            locality_input.getText(), sector_input.getText());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }

            } else if (choice.getValue().equals("hospital")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_contact(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())) {
                    JavaSQLInsert.insert_hospital(name_input.getText(), address_input.getText(), cno_input.getText(),
                            locality_input.getText(), sector_input.getText());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }

            } else if (choice.getValue().equals("mall")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_time(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())) {

                    JavaSQLInsert.insert_mall(name_input.getText(), address_input.getText(), cno_input.getText(),
                            locality_input.getText(), sector_input.getText());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }
            } else if (choice.getValue().equals("police_station")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_contact(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())) {
                    JavaSQLInsert.insert_police_station(name_input.getText(), address_input.getText(),
                            cno_input.getText(),
                            locality_input.getText(), sector_input.getText());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }
            } else if (choice.getValue().equals("restaurant")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_address(address_input.getText())
                        && Validate.validate_contact(cno_input.getText())
                        && Validate.validate_location(locality_input.getText())
                        && Validate.validate_sector(sector_input.getText())
                        && Validate.validate_rating(rating_input.getText())
                        && Validate.validate_info(type_input.getText())) {
                    JavaSQLInsert.insert_restaurant(name_input.getText(), address_input.getText(), cno_input.getText(),
                            locality_input.getText(), sector_input.getText(), rating_input.getText(),
                            type_input.getText());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }

            } else if (choice.getValue().equals("bus")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_info(address_input.getText())
                        && Validate.priceRegex(locality_input.getText())) {
                    JavaSQLInsert.insert_bus(name_input.getText(), address_input.getText(), locality_input.getText());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }
            } else if (choice.getValue().equals("train")) {
                if (Validate.validate_info(name_input.getText()) && Validate.validate_info(address_input.getText())
                        && Validate.priceRegex(locality_input.getText())
                        && Validate.validate_time(sector_input.getText())) {
                    JavaSQLInsert.insert_train(locality_input.getText(), sector_input.getText(), name_input.getText(),
                            address_input.getText());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }
            } else if (choice.getValue().equals("flight")) {
                if (Validate.validate_info(name_input.getText()) && Validate.isEmpty(address_input.getText())
                        && Validate.validate_time(locality_input.getText())
                        && Validate.validate_time(sector_input.getText())
                        && Validate.validate_info(cno_input.getText())
                        && Validate.validate_info(rating_input.getText())) {
                    JavaSQLInsert.insert_flight(name_input.getText(), address_input.getText(), cno_input.getText(),
                            rating_input.getText(), locality_input.getText(),
                            sector_input.getText());

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Success");
                    alert.setHeaderText("success");
                    alert.setContentText("Data inserted successfully");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Error");
                    alert.setContentText("Please enter valid information");
                    alert.showAndWait();
                }
            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Not Able TO Insert");
            alert.showAndWait();
        }
    }

    @FXML
    void backbtnclick(ActionEvent event) throws IOException {
        Stage arg0 = App.get_stage();
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene sc = new Scene(root);
        arg0.setScene(sc);
        arg0.setTitle("Smart City");
        arg0.show();
    }
}
