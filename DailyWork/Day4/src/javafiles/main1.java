package javafiles;

import javafiles.imagePage.ImagePage;
import javafx.application.Application;
//import javafiles.imagePage.ImagePage;

public class main1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Application.launch(ImagePage.class, args);
       // Application.launch(ImagePage.class, args);
    }

}



























// package main;

// import java.io.IOException;

// import javafx.application.Application;
// import javafx.geometry.Pos;
// import javafx.scene.Group;
// import javafx.scene.Scene;
// import javafx.scene.image.Image;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
// import javafx.scene.paint.Color;
// import javafx.scene.text.Font;
// import javafx.scene.text.Text;
// import javafx.stage.Stage;

// public class App extends Application {
    
//     //Text title = null;
//     //Text java = null;
//     //Text python = null;

//     public static void main(String[] args)throws IOException{
//         System.out.println("Hello, World!");
//         launch(args);
//     }

//     public void start(Stage primaryStage){
//         primaryStage.setTitle("Programming Language");
//         primaryStage.setHeight(800);
//         primaryStage.setWidth(1200);
//         primaryStage.setResizable(false);
//         primaryStage.centerOnScreen();
//         primaryStage.getIcons().add(new Image("assets/images/logo.jpg"));

//         Text txt = new Text(10,10, "Good Evening");
//         //txt.setFill(new Color(100));
//         txt.setFont(new Font(12));
        
//         Text title = new Text(250,10 , "Have a nice Day");
//         title.setFont(new Font(12));
//         title.setFill(Color.ORANGE);
        
//         Text cpp = new Text(10,100,"CPP");
//         Text java = new Text(10,150,"Java");
//         Text python = new Text(10,200,"python");

//         Text App = new Text(150,100,"App");
//         Text Web = new Text(150,150,"Web");
//         Text Backend = new Text(150,200,"Backend");

//         VBox vb1 = new VBox(20,cpp, java ,python);
//         vb1.setAlignment(Pos.CENTER);
//         vb1.setLayoutX(80);
//         vb1.setLayoutY(120);
        
//         VBox vb2 = new VBox(20,App, Web, Backend);
//         vb1.setAlignment(Pos.CENTER);
//         vb1.setLayoutX(120);
//         vb1.setLayoutY(120);

//         HBox hb = new HBox(50 ,vb1,vb2);
//         hb.setLayoutX(180);
//         hb.setLayoutY(300);
        
//         Group gr = new Group(hb,vb1,vb2,txt,title);
        
//         Scene sc = new Scene(gr);
//         //sc.setFill(Color.CYAN);
//         primaryStage.setScene(sc);
//         primaryStage.show();


//     }
// }


























 


    

