package buttonPAge;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorfulWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Colorful Window");

        Button colorButton = new Button("Change Color");
        colorButton.setStyle("-fx-font-size: 20px;  -fx-padding: 10px; -fx-background-color:Lime;");

        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(colorButton);

        Scene scene = new Scene(root, 500, 500);

        colorButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Color randomColor = getRandomColor();
                root.setStyle("-fx-background-color: " + toRgbString(randomColor) + ";");
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Color getRandomColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    private String toRgbString(Color color) {
        int red = (int) (color.getRed() * 255);
        int green = (int) (color.getGreen() * 255);
        int blue = (int) (color.getBlue() * 255);
        return String.format("rgb(%d, %d, %d)", red, green, blue);
    }
}

