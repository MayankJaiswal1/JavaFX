package javafiles.imagePage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ImagePage extends Application{

    @Override
    public void start(Stage imaStage)  {
        
        imaStage.setTitle("Image Window");
        imaStage.setWidth(1800);
        imaStage.setHeight(1000);
        imaStage.setX(0);
        imaStage.setY(0);

        Image img = new Image("assets/images/pr.png");

        ImageView iv = new ImageView(img);
        iv.setFitWidth(600);
        iv.setPreserveRatio(true);

        Label j1 = new Label("Project");
        j1.setFont(new Font(40));
        j1.setAlignment(Pos.CENTER);
        j1.setLayoutY(0);
        j1.setPrefHeight(200);

        VBox vb1 = new VBox(15, iv);
        vb1.setPrefHeight(200);
        vb1.setPrefWidth(1000);
        vb1.setStyle("-fx-background-color:Gold");
        
        VBox vb2 = new VBox(15, j1);
        vb2.setPrefHeight(200);
        vb2.setPrefWidth(1000);
        vb2.setStyle("-fx-background-color:Gold");
        vb2.setAlignment(Pos.CENTER);

        HBox hb = new HBox(15, vb1, vb2);
        hb.setPrefHeight(200);
        hb.setPrefWidth(1000);
        hb.setStyle("-fx-background-color:Gold");

        Group gr = new Group(hb);

        Scene sc = new Scene(gr, 1800, 1000, Color.LAVENDER);

        imaStage.setScene(sc);
        imaStage.show();
    }
    
}
