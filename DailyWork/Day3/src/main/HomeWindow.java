package main;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeWindow extends Application{
    

    @Override
    public void start(Stage prStage){
        prStage.setTitle("MyStage");
        prStage.setWidth(900);
        prStage.setHeight(1000);
        prStage.setResizable(false);
        prStage.getIcons().add(new Image("assets/images/logo.jpg"));

        Text title1 = new Text(10,25,"Good evening.");
        title1.setFont(new Font(20));
        title1.setFill(Color.WHITE);

        Text title2 = new Text(500,25,"Have a nice day");
        title2.setFont(new Font(20));
        title2.setFill(Color.YELLOW);

        Text java = new Text(10,25,"Java");
        java.setFont(new Font(20));
        java.setFill(Color.YELLOW);

        Text python = new Text(10,125,"Python");
        python.setFont(new Font(20));
        python.setFill(Color.PURPLE);

        Text cpp = new Text(10,150,"CPP");
        cpp.setFont(new Font(20));
        cpp.setFill(Color.BLACK);
        
        VBox vb1 = new VBox(20,java,python,cpp);
        vb1.setAlignment(Pos.CENTER);
        vb1.setOpacity(1);
        vb1.setLayoutX(40);
        vb1.setLayoutY(120);
        
        Text web = new Text(10,25,"web");
        web.setFont(new Font(20));
        web.setFill(Color.WHITE);

        Text backend = new Text(10,125,"backend");
        
        backend.setFont(new Font(20));
        backend.setFill(Color.BLACK);

        Text app = new Text(10,150,"App");
        app.setFont(new Font(20));
        app.setFill(Color.BLACK);

        VBox vb2 = new VBox(20,web,backend,app);
        vb2.setAlignment(Pos.CENTER);
        vb2.setOpacity(1);
        vb2.setLayoutX(120);
        vb2.setLayoutY(120);

        HBox hb = new HBox(50,vb1,vb2);
        hb.setLayoutX(180);
        hb.setLayoutY(200);

        Group gr = new Group(hb,title1,title2);

        
        Scene sc = new Scene(gr);
        sc.setFill(Color.BROWN);
        prStage.setScene(sc);

        prStage.show();
    }
}
