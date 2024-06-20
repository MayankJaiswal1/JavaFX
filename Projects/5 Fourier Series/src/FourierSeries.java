//package Fourier;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
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
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT, Color.BLACK);

        Image logoImage = new Image("core2web1.png");
        ImageView logoView = new ImageView(logoImage);
        logoView.setFitHeight(80);
        logoView.setPreserveRatio(true);
        logoView.setLayoutX(15);
        logoView.setLayoutY(15);

        primaryStage.setScene(scene);

        for (int i = 0; i < NUM_HARMONICS; i++) {
            int n = 2 * i + 1;
            double radius = AMPLITUDE * (4 / (n * Math.PI));

            Line line = new Line();
            line.setStroke(Color.BLANCHEDALMOND);
            root.getChildren().add(line);

            final int index = i;
            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    double x = WINDOW_WIDTH / 2;
                    double y = WINDOW_HEIGHT / 2;

                    for (int j = 0; j < n; j++) {
                        int Term = j * 2 + 1;
                        double prevX = x;
                        double prevY = y;
                        x += radius * Math.cos(Term * time);
                        y += radius * Math.sin(Term * time);
                        line.setStartX(prevX);
                        line.setStartY(prevY);
                        line.setEndX(x);
                        line.setEndY(y);
                    }
                }
            }.start();
        }

        primaryStage.show();

        HBox buttonContainer = new HBox();
        buttonContainer.setTranslateX(10);
        buttonContainer.setTranslateY(WINDOW_HEIGHT - 40);

        Button restartButton = new Button("Restart");
        restartButton.setStyle("-fx-color:GREEN;-fx-font-weight:bold;-fx-font-size:22;");

        restartButton.setOnAction(event -> {
            time = 0;
            root.getChildren().removeIf(node -> node instanceof Line);

            for (int i = 0; i < NUM_HARMONICS; i++) {
                int n = 2 * i + 1;
                double radius = AMPLITUDE * (4 / (n * Math.PI));
                Line line = new Line();
                line.setStroke(Color.BLANCHEDALMOND);
                root.getChildren().add(line);

                final int index = i;
                new AnimationTimer() {
                    @Override
                    public void handle(long now) {
                        double x = WINDOW_WIDTH / 2;
                        double y = WINDOW_HEIGHT / 2;

                        for (int j = 0; j < n; j++) {
                            int jTerm = j * 2 + 1;
                            double prevX = x;
                            double prevY = y;
                            x += radius * Math.cos(jTerm * time);
                            y += radius * Math.sin(jTerm * time);
                            line.setStartX(prevX);
                            line.setStartY(prevY);
                            line.setEndX(x);
                            line.setEndY(y);
                        }
                    }
                }.start();
            }
        });

        Stage aboutStage = new Stage();
        aboutStage.setTitle("About");
        aboutStage.initModality(Modality.APPLICATION_MODAL);
        aboutStage.setWidth(400);
        aboutStage.setHeight(300);
        VBox aboutLayout = new VBox(10);
        aboutLayout.setAlignment(Pos.CENTER);
        Text aboutText = new Text(
                "Fourier Transform:\n"
                        + "The Fourier transform is a mathematical transformation used to\n"
                        + "decompose\n"
                        + "a function into its constituent frequencies. It's widely used in\n"
                        + "signal\n"
                        + "processing and image analysis.\n\n"
                        + "Golden Ratio:\n"
                        + "The golden ratio is a special number approximately equal to\n"
                        + "1.618.\n"
                        + "It appears in various fields such as art, architecture, and\n"
                        + "nature."
        );
        aboutText.setTextAlignment(TextAlignment.JUSTIFY);
        aboutLayout.getChildren().addAll(aboutText);
        Scene aboutScene = new Scene(aboutLayout);
        aboutStage.setScene(aboutScene);

        Button aboutButton = new Button("About");
        aboutButton.setStyle("-fx-color: BLUE; -fx-font-weight: bold; -fx-font-size: 22;");
        HBox aboutButtonContainer = new HBox(10);
        aboutButtonContainer.setAlignment(Pos.BOTTOM_LEFT);
        aboutButtonContainer.getChildren().add(aboutButton);

        aboutButton.setOnAction(event -> {
            aboutStage.showAndWait();
        });

        buttonContainer.getChildren().addAll(restartButton, aboutButtonContainer);
        root.getChildren().addAll(logoView, buttonContainer);

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                time += 0.0001;
            }
        }.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
