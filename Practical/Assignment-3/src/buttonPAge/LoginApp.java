package buttonPAge;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginApp extends Application {

    private static final String FIXED_LOGIN_ID = "admin";
    private static final String FIXED_PASSWORD = "password123";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        Label loginLabel = new Label("Login ID:");
        TextField loginField = new TextField();
        loginField.setMaxHeight(200);
        loginField.setMaxWidth(200);

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        passwordField.setMaxHeight(200);
        passwordField.setMaxWidth(200);

        Button loginButton = new Button("Login");
        Label result = new Label();

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String enteredLoginID = loginField.getText();
                String enteredPassword = passwordField.getText();

                if (FIXED_LOGIN_ID.equals(enteredLoginID) && FIXED_PASSWORD.equals(enteredPassword)) {
                    showWelcomeWindow();
                } else {
                    result.setText("Invalid login ID or password");
                }
            }
        });

        VBox loginBox = new VBox(10, loginLabel, loginField, passwordLabel, passwordField, loginButton, result);
        loginBox.setAlignment(Pos.CENTER);
        loginBox.setStyle("-fx-background-color: LightGray");

        Scene loginScene = new Scene(loginBox, 300, 200);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    private void showWelcomeWindow() {
        Stage welcomeStage = new Stage();
        welcomeStage.setTitle("Welcome");

        Label welcomeLabel = new Label("You are welcome");
        welcomeLabel.setFont(new javafx.scene.text.Font(24));
        VBox welcomeBox = new VBox(20, welcomeLabel);
        welcomeBox.setAlignment(Pos.CENTER);
        welcomeBox.setStyle("-fx-background-color: LightGreen");

        Scene welcomeScene = new Scene(welcomeBox, 300, 200);
        welcomeStage.setScene(welcomeScene);
        welcomeStage.show();
    }
}
