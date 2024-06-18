package javafiles.home;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyPane extends Application {
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("Pane");
        primaryStage.setWidth(1200);
        primaryStage.setHeight(800);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("assets/images/logo.jpg"));

        BorderPane borderPane = new BorderPane();
        
        Label top = new Label("Top");
        top.setFont(new Font(25));

        Label bottom = new Label("Bottom");
        bottom.setFont(new Font(25));

        Label Right = new Label("Right");
        Right.setFont(new Font(25));

        Label Left = new Label("Left");
        Left.setFont(new Font(25));

        Label center = new Label("Center");
        center.setFont(new Font(25));

        borderPane.setTop(top);
        borderPane.setCenter(center);
        borderPane.setBottom(bottom);
        borderPane.setRight(Right);
        borderPane.setLeft(Left);

        Label Java = new Label("Java");
        Java.setFont(new Font(50));

        Label DSA = new Label("Dsa");
        DSA.setFont(new Font(30));

        Label OS = new Label("OS");
        OS.setFont(new Font(50));

        Label DBMS = new Label("DBMS");
        DBMS.setFont(new Font(50));

        Pane pane = new Pane(Java,DSA,OS, DBMS);
        pane.setOpacity(1);
        pane.setVisible(true);

        Label l1 = new Label(" From Core to Core");
        l1.setFont(new Font(20));

        Label l2 = new Label("-----------------                      ");
        l2.setFont(new Font(20));

        //StackPane.getChildren().addAll(l1,l2);

        

        Scene sc = new Scene(borderPane, 300 ,300);

        Scene scene = new Scene(pane, 1200 ,800);
        primaryStage.setScene(scene);
        primaryStage.setScene(sc);
        sc.setFill(Color.AQUA);
        primaryStage.setTitle("Borderpane");
        primaryStage.show();   
    }
    
    Label lb = new Label();
}
