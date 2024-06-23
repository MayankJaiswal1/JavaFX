import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {

    @Override
    public void start(Stage stage) {
        // Set the title of the stage
        stage.setTitle("RadioButtonDemo");

        // Create a VBox layout
        VBox vbox = new VBox(10); // 10 is the spacing between elements

        // Create a label
        Label label = new Label("Career Option:");

        // Create radio buttons
        RadioButton radioButton1 = new RadioButton("Backend Developer");
        RadioButton radioButton2 = new RadioButton("Web Developer");
        RadioButton radioButton3 = new RadioButton("Flutter Developer");

        // Create a ToggleGroup
        ToggleGroup group = new ToggleGroup();
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);

        // Add label and radio buttons to the VBox
        vbox.getChildren().addAll(label, radioButton1, radioButton2,radioButton3);

        // Create a scene with the VBox
        Scene scene = new Scene(vbox, 300, 200);

        // Set the scene on the stage
        stage.setScene(scene);

        // Show the stage
        stage.show();
    }
    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
}


