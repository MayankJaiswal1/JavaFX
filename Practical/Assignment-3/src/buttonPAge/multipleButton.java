package buttonPAge;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class multipleButton extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage buttonStage){

        Label l1 = new Label("Core2Web");
        l1.setPadding(new Insets(100, 0, 0, 0)); // Add padding to the top
        
        Button show = new Button("Hello Super X");
        show.setStyle("-fx-font-size: 15px; -fx-background-color:LightBlue; -fx-font-weight:bold;");
        show.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Core2web");
            }
        });

        Button java = new Button("Core2Web java");
        java.setStyle("-fx-font-size: 15px; -fx-background-color:LightBlue; -fx-font-weight:bold;");
        java.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Java2k24");
            }
        });

        Button superx = new Button("Core2Web Super-X");
        superx.setStyle("-fx-font-size: 15px; -fx-background-color:LightBlue; -fx-font-weight:bold;");
        superx.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Superx-2024");
            }
        });

        Button dsa = new Button("Core2Web DSA");
        dsa.setStyle("-fx-font-size: 15px; -fx-background-color:LightBlue; -fx-font-weight:bold;");
        dsa.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Core2web DSA");
            }
        });

        VBox vb = new VBox(20,l1,show,java,superx,dsa);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: Gold ");

        Scene sc = new Scene(vb,500,500);
        sc.setFill(Color.BEIGE);

        buttonStage.setScene(sc);
        buttonStage.show();
    }
}
