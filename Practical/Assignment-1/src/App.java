import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    public void start(Stage primaryStage){


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


        
        // primaryStage.setWidth(600);
        // primaryStage.setHeight(450);
        // primaryStage.setTitle("C2W_Assignment-1");
        // Label c2w = new Label("Super -X 2024 By Core2web");
        // c2w.setFont(new Font(25));
        // c2w.setAlignment(Pos.BASELINE_CENTER);
        // c2w.setTextFill(Color.AQUA);


        // Group gr = new Group(c2w);
        // Scene sc = new Scene(gr);
        // sc.setFill(Color.YELLOW);
        // primaryStage.setScene(sc);
        // primaryStage.show();
    }
}
