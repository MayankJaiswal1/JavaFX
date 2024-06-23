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

public class SquareButton extends Application{

    public void start(Stage buttonStage){
        buttonStage.setTitle("Square & Root");

        Label text = new Label("Enter Number");
        Label input = new Label();
        Label result = new Label();
        TextField tx = new TextField();
        tx.setMaxHeight(200);
        tx.setMaxWidth(200);

        Button squarebutton = new Button("Square");
        squarebutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                String inputText = tx.getText();
                if (isValidInteger(inputText)) {
                    int number = Integer.parseInt(inputText);
                    int square = number * number;
                    result.setText("Square: " + square);
                } else {
                    result.setText("Enter valid integer");
                }
            }
        });

        Button squarerootbutton = new Button("Square Root");
        squarerootbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                String inputText = tx.getText();
                if (isValidInteger(inputText)) {
                    int number = Integer.parseInt(inputText);
                    double sqrt = Math.sqrt(number);
                    result.setText("Square Root: " + sqrt);
                } else {
                    result.setText("Enter valid integer");
                }
            }
        });

        VBox vb = new VBox(10,text,tx,squarebutton,squarerootbutton,input,result);
        //vb.setPrefSize(200, 200);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: Gold ");

        Scene sc = new Scene(vb,500,500);
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
}

