import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class ShowFeedBack implements Initializable {
    @FXML
    private HBox my_hbox;
    @FXML
    private VBox my_vbox;
    static Stage stage = AccomodotionDisplay.getStage();

    // This Is An Amazing Place To Visit
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        // ImageView img_view = new ImageView();
        // Image image = new
        // Image("https://avatars.dicebear.com/api/avataaars/0.6709606409289153.png");
        // img_view.setImage(image);
        // Label label = new Label("Welcome To The Navi Mumbai ");

        // stage.setTitle("Smart City");
        // VBox vbox = new VBox();
        // HBox hbox = new HBox();

        // hbox.getChildren().add(label);
        // hbox.getChildren().add(img_view);
        // hbox.setSpacing(20);
        // vbox.getChildren().add(hbox);

        // Scene scene = new Scene(vbox, 600, 400);
        // stage.setScene(scene);
        // stage.show();

    }

    public static void initialize() {
        JavaPostgreSql.get_feedback(Integer.parseInt(AccomodationInfo.get_acco_id().trim()));
        String names[] = JavaPostgreSql.get_feed_name().split("\n");
        String feedbacks[] = JavaPostgreSql.get_feed_feedback().split("&&&");
        String images[] = JavaPostgreSql.get_feed_imgstr().split("\n");
        VBox vbox = new VBox();
        if (JavaPostgreSql.get_feed_name().trim().length() == 0) {
            Label label = new Label("No FeedBack Yet");
            label.setTextAlignment(TextAlignment.CENTER);
            vbox.getChildren().add(label);
        } else {

            for (int i = 0; i < names.length; i++) {

                ImageView img_view = new ImageView();
                Image image = new Image("https://avatars.dicebear.com/api/avataaars/" + images[i] + ".png?size=90");
                img_view.setImage(image);
                Label label = new Label(feedbacks[i]);
                Label name_label = new Label(names[i]);
                System.out.println("---->>> " + feedbacks[i]);
                label.setWrapText(true);
                label.setPrefWidth(1500);
                if (i % 2 != 0) {
                    label.setStyle(
                            "-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #ffffff;-fx-font-family: \"Segoe UI\";");
                    label.setTextAlignment(TextAlignment.JUSTIFY);

                    name_label.setStyle(
                            "-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #ffffff; -fx-font-family: \"Segoe UI\";");
                    name_label.setTextAlignment(TextAlignment.CENTER);
                } else {

                    label.setStyle(
                            "-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #000000;-fx-font-family: \"Segoe UI\";");
                    label.setTextAlignment(TextAlignment.JUSTIFY);

                    name_label.setStyle(
                            "-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: #000000; -fx-font-family: \"Segoe UI\";");
                    name_label.setTextAlignment(TextAlignment.CENTER);
                }
                stage.setTitle("Smart City");
                HBox hbox = new HBox();
                VBox vbox1 = new VBox();
                vbox1.setPadding(new Insets(10, 0, 0, 10));
                Circle cc = new Circle(40);
                cc.setFill(new ImagePattern(image));
                if (i % 2 != 0) {

                    cc.setStroke(javafx.scene.paint.Color.WHITE);
                } else {

                    cc.setStroke(javafx.scene.paint.Color.BLACK);
                }
                label.setPadding(new Insets(30, 0, 0, 0));
                name_label.setPadding(new Insets(5, 0, 0, 25));
                vbox1.getChildren().add(cc);
                vbox1.getChildren().add(name_label);
                // vbox1.setMaxHeight(600);
                // vbox1.setMaxWidth(300);
                // vbox1.setPadding(new Insets(10, 100, 0, 10));
                hbox.getChildren().add(vbox1);
                hbox.getChildren().add(label);
                if (i % 2 != 0) {

                    hbox.setStyle("-fx-background-color: #000000;");
                } else {
                    hbox.setStyle("-fx-background-color: #ffffff;");

                }
                // hbox.setMaxWidth(200);
                hbox.setSpacing(100);
                vbox.getChildren().add(hbox);
                // vbox.setSpacing(40);
            }

        }
        ScrollPane sp = new ScrollPane();
        sp.setContent(vbox);
        Scene scene = new Scene(sp, 880, 500);
        stage.setScene(scene);
        stage.show();
    }

}
