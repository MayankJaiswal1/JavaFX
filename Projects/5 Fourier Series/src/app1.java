package Fourier;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FourierSeries extends Application {
    private static final int WINDOW_WIDTH = 900;
    private static final int WINDOW_HEIGHT = 900;
    private static final int NUM_HARMONICS = 100;
    private static final int AMPLITUDE = 500;
    private static final double PERIOD = 200;
    private double time = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Fourier Series");
        Group root = new Group();
        Image logoImage = new Image("core2web1.png");
        ImageView logoView = new ImageView(logoImage);
        logoView.setFitHeight(80);
        logoView.setPreserveRatio(true);
        double yAxis = 15;
        double xAxis = 15;
        logoView.setLayoutX(xAxis);
        logoView.setLayoutY(yAxis);
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.BLACK);

        primaryStage.setScene(scene);
        primaryStage.show();

        // Add animation code here

        // Create button container
        HBox buttonContainer = new HBox();
        buttonContainer.setTranslateX(10);
        buttonContainer.setTranslateY(WINDOW_HEIGHT - 40);
        Button restartButton = new Button("Restart");
        restartButton.setStyle("-fx-color:GREEN;-fx-font-weight:bold;-fx-font-size:22;");
        
        restartButton.setOnAction(event -> {
            // Reset time and clear lines
            time = 0;
            root.getChildren().removeIf(node -> node instanceof Line);
            // Restart animation
            // Add animation code here
        });

        // Create About button and window
        Stage aboutStage = new Stage();
        aboutStage.setTitle("About");
        aboutStage.initModality(Modality.APPLICATION_MODAL);
        aboutStage.setWidth(400);
        aboutStage.setHeight(300);
        Button aboutButton = new Button("About");
        aboutButton.setStyle("-fx-color: BLUE; -fx-font-weight: bold; -fx-font-size: 22;");
        HBox aboutButtonContainer = new HBox(10);
        aboutButtonContainer.setAlignment(Pos.BOTTOM_LEFT);
        aboutButtonContainer.getChildren().add(aboutButton);
        aboutButton.setOnAction(event -> aboutStage.showAndWait());

        buttonContainer.getChildren().addAll(restartButton, aboutButtonContainer);
        root.getChildren().addAll(logoView, buttonContainer);

        // Add animation timer
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                time += 0.0001;
                // Add animation code here
            }
        }.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
