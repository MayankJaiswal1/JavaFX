import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class C2WAssignment extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Task 1: Create a window with specified dimensions
        primaryStage.setWidth(600);
        primaryStage.setHeight(450);

        // Task 2: Change the background color from white to yellow
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: yellow;");

        // Task 3: Add text to the window
        Label label1 = new Label("Super - X 2024 By Core2web");
        root.getChildren().add(label1);

        // Task 4: Change the window name and background color
        primaryStage.setTitle("C2W_Assignment_1");
        root.setStyle("-fx-background-color: orange;");

        Scene scene = new Scene(root, 600, 450);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Task 5: Create a window with your favorite color background and your name
        Stage favoriteWindow = new Stage();
        favoriteWindow.setTitle("Favorite Color Window");
        //favoriteWindow.initStyle("-fx-background-color: Lime;");
        StackPane favoritePane = new StackPane();
        favoritePane.setStyle("-fx-background-color: blue;");  // Replace 'blue' with your favorite color
        Label favoriteLabel = new Label("M");
        favoriteLabel.setTextFill(Color.WHITE);
        favoritePane.getChildren().add(favoriteLabel);
        Scene favoriteScene = new Scene(favoritePane, 600, 450);
        favoriteWindow.setScene(favoriteScene);
        favoriteWindow.show();

        // Task 6: Add various colored text to the window
        Label label2 = new Label("Red Text");
        label2.setTextFill(Color.RED);
        Label label3 = new Label("Green Text");
        label3.setTextFill(Color.GREEN);
        Label label4 = new Label("Blue Text");
        label4.setTextFill(Color.BLUE);

        favoritePane.getChildren().addAll(label2, label3, label4);

        // Task 7: Change the alignment of text
        favoritePane.setAlignment(Pos.CENTER);

        // Task 8: Create a window with your name, hobbies, and programming languages
        Stage infoWindow = new Stage();
        infoWindow.setTitle("Info Window");
        StackPane infoPane = new StackPane();
        infoPane.setStyle("-fx-background-color: Green;");
        Label infoLabel = new Label("Name: M\nHobbies: Reading, Coding\nLanguages: Java, Python");
        infoPane.getChildren().add(infoLabel);
        Scene infoScene = new Scene(infoPane, 600, 450);
        infoWindow.setScene(infoScene);
        infoWindow.show();

        // Task 9: Create a window with specified dimensions and colors
        Stage customWindow = new Stage();
        customWindow.setTitle("Custom Window");
        StackPane customPane = new StackPane();
        customPane.setStyle("-fx-background-color: AQUA;");
        Label customLabel = new Label("Custom Text");
        customLabel.setTextFill(Color.MAROON);
        customPane.getChildren().add(customLabel);
        Scene customScene = new Scene(customPane, 1100, 800);
        customWindow.setScene(customScene);
        customWindow.show();
    }
}
