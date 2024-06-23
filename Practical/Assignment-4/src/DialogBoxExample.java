import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DialogBoxExample extends Application{
    public static void main(String[] args)   {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)   {
        TextField textField = new TextField();
        
        Dialog<String> dialog = new Dialog<String>();
        dialog.setTitle("C2W_Dialog");

        ButtonType type = new ButtonType("Ok", ButtonData.OK_DONE);
        dialog.setContentText("Hello You Have Created A Dialogue Box");
        dialog.getDialogPane().getButtonTypes().add(type);
        
        Text txt = new Text("Click here -->");
        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        txt.setFont(font);

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("I have a great message for you!");
        alert.showAndWait();

        Alert warniAlert = new Alert(AlertType.WARNING);
        warniAlert.setTitle("Warning Dialog");
        warniAlert.setHeaderText("Look, a Warning Dialog");
        warniAlert.setContentText("Careful with the next step!");
        warniAlert.showAndWait();

        Alert Erroralert = new Alert(AlertType.ERROR);
        Erroralert.setTitle("Error Dialog");
        Erroralert.setHeaderText("Look, an Error Dialog");
        Erroralert.setContentText("Ooops, there was an error!");
        Erroralert.showAndWait();

        Alert ConfirmationBox = new Alert(AlertType.CONFIRMATION);
        ConfirmationBox.setTitle("Confirmation Dialog");
        ConfirmationBox.setHeaderText("Look, a Confirmation Dialog");
        ConfirmationBox.setContentText("Are you ok with this?");
        Optional<ButtonType> result = ConfirmationBox.showAndWait();
        if (result.get() == ButtonType.OK){
        // ... user chose OK
        } else {
        // ... user chose CANCEL or closed the dialog
        }

        //Confirmation Dialog with Custom Actions
        Alert ConfirmationBoxcustom = new Alert(AlertType.CONFIRMATION);
        ConfirmationBoxcustom.setTitle("Confirmation Dialog with Custom Actions");
        ConfirmationBoxcustom.setHeaderText("Look, a Confirmation Dialog with Custom Actions");
        ConfirmationBoxcustom.setContentText("Choose your option.");
        ButtonType buttonTypeOne = new ButtonType("One");
        ButtonType buttonTypeTwo = new ButtonType("Two");
        ButtonType buttonTypeThree = new ButtonType("Three");
        ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonData.CANCEL_CLOSE);
        ConfirmationBoxcustom.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo, buttonTypeThree,
        buttonTypeCancel);
        Optional<ButtonType> result1 = ConfirmationBoxcustom.showAndWait();
        if (result1.get() == buttonTypeOne){
        // ... user chose "One"
        } else if (result1.get() == buttonTypeTwo) {
        // ... user chose "Two"
        } else if (result1.get() == buttonTypeThree) {
        // ... user chose "Three"
        } else {
        // ... user chose CANCEL or closed the dialog
        }

        Button button = new Button("Show Dialog Box");
        button.setOnAction(e -> extracted(textField, dialog));
        HBox pane = new HBox(15);
        pane.setPadding(new Insets(50, 150, 50, 60));
        pane.getChildren().addAll(txt, button);

        Scene scene = new Scene(new Group(pane), 600, 250, Color.TEAL);
        primaryStage.setTitle("C2W_Dialog Box Demo");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }
    private void extracted(TextField textField, Dialog<String> dialog) {
        dialog.showAndWait();
    }
}
