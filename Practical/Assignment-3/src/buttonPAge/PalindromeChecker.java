package buttonPAge;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PalindromeChecker extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Palindrome Checker");

        Label promptLabel = new Label("Enter a String:");
        promptLabel.setFont(new Font(20));

        TextField inputField = new TextField();
        inputField.setMaxWidth(300);

        Button checkButton = new Button("Check Palindrome");

        Label resultLabel = new Label();
        resultLabel.setFont(new Font(18));

        checkButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String inputText = inputField.getText();
                if (isPalindrome(inputText)) {
                    resultLabel.setText("The string is a palindrome.");
                    resultLabel.setTextFill(Color.GREEN);
                } else {
                    resultLabel.setText("The string is not a palindrome.");
                    resultLabel.setTextFill(Color.RED);
                }
            }
        });

        VBox vbox = new VBox(10, promptLabel, inputField, checkButton, resultLabel);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color: LightBlue;");
        vbox.setPadding(new javafx.geometry.Insets(20));

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // private boolean isPalindrome(String str) {
    //     String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
    //     int length = cleanedStr.length();
    //     for (int i = 0; i < length / 2; i++) {
    //         if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //OR
    private boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
}
