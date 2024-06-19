package buttonPAge;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MultioperationButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage buttonStage) {
        buttonStage.setTitle("Operations");

        Label text = new Label("Enter Number:");
        Label result = new Label();
        TextField tx = new TextField();
        tx.setMaxHeight(200);
        tx.setMaxWidth(200);

        // ComboBox for selecting operation
        ComboBox<String> operationBox = new ComboBox<>();
        operationBox.getItems().addAll("Square", "Square Root", "Reverse", "Factorial");
        operationBox.setValue("Square"); // default value

        Button executeButton = new Button("Execute");
        executeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String inputText = tx.getText();
                String selectedOperation = operationBox.getValue();
                if (isValidInteger(inputText)) {
                    int number = Integer.parseInt(inputText);
                    switch (selectedOperation) {
                        case "Square":
                            int square = number * number;
                            result.setText("Square: " + square);
                            break;
                        case "Square Root":
                            double sqrt = Math.sqrt(number);
                            result.setText("Square Root: " + sqrt);
                            break;
                        case "Reverse":
                            int reverse = reverseNumber(number);
                            result.setText("Reverse: " + reverse);
                            break;
                        case "Factorial":
                            long factorial = factorial(number);
                            result.setText("Factorial: " + factorial);
                            break;
                        default:
                            result.setText("Invalid Operation");
                    }
                } else {
                    result.setText("Enter valid integer");
                }
            }
        });

        VBox vb = new VBox(10, text, tx, operationBox, executeButton, result);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: Gold");

        Scene sc = new Scene(vb, 500, 500);
        sc.setFill(Color.BEIGE);

        buttonStage.setScene(sc);
        buttonStage.show();
    }

    private boolean isValidInteger(String inputText) {
        try {
            Integer.parseInt(inputText);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    private long factorial(int number) {
        if (number < 0) {
            return -1; // Factorial is not defined for negative numbers
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

