package com.c2w.buttonPAge;

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
import javafx.stage.Stage;

public class TextfieldButton extends Application{

    public void start(Stage buttonStage){

        Label text = new Label("Enter Text");
        Label txshow = new Label();
        TextField tx = new TextField();
        tx.setMaxHeight(200);
        tx.setMaxWidth(200);

        Button show = new Button("Show");
        show.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println(tx.getText());
                txshow.setText(tx.getText());

            }
        });

        VBox vb = new VBox(20,text,tx,show,txshow);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: Gold ");

        Scene sc = new Scene(vb,500,500);
        sc.setFill(Color.BEIGE);

        buttonStage.setScene(sc);
        buttonStage.show();
    }
    
}
