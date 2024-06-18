package javafiles.buttonPage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ButtonPage extends Application{

    public void start(Stage buttonStage){

        Image img = new Image("assets/images/project-management.png");
        ImageView iv = new ImageView(img);
        iv.setFitHeight(150);
        iv.setFitWidth(200);
        

        Label text = new Label("Enter email");
        Label txshow = new Label();
        TextField tx = new TextField();
        tx.setMaxHeight(200);
        tx.setMaxWidth(200);
        //tx.setAlignment(Pos.TOP_CENTER);

        Label pass = new Label("Enter Password");
        Label psshow = new Label();
        PasswordField ps = new PasswordField();
        ps.setMaxHeight(200);
        ps.setMaxWidth(200);

        Button show = new Button("Show");
        show.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println(tx.getText());
                System.out.println(ps.getText());
                txshow.setText(tx.getText());
                psshow.setText(ps.getText());

            }
        });

        VBox vb = new VBox(20,iv,text,tx,pass,ps,show,txshow,psshow);
        //vb.setPrefSize(200, 200);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: Gold ");
        //vb.setBorder(2);

        Scene sc = new Scene(vb,500,500);
        sc.setFill(Color.BEIGE);

        
        buttonStage.setScene(sc);
        buttonStage.show();
    }
    
}
