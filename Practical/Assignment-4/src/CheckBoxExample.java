import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application{

    @Override
    public void start(Stage primaryStage)  {
        // Set the title of the stage
        primaryStage.setTitle("Creating CheckBox");

        // Create a label
        Label label = new Label("This is a check box demo");
        // Array of checkbox labels
        String[] checkBoxLabels = {"Core2web", "Incubators", "Biencaps"};

        //VBox for vertical view of the check box
        VBox checkHBox = new VBox(20,label);
        // Create and add checkboxes to the TilePane
        for (String checkBoxLabel : checkBoxLabels) {
            CheckBox checkBox = new CheckBox(checkBoxLabel);
            // tilePane.getChildren().add(checkBox);

            //set the checkbox in VBox
            checkHBox.getChildren().add(checkBox);
        }

        // Create a scene with the TilePane
        Scene scene = new Scene(checkHBox, 300, 200);
        // Set the scene on the stage
        primaryStage.setScene(scene);
        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
    
}
