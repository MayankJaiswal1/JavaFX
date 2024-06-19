package buttonPAge;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MonthButton extends Application{

    public void start(Stage buttonStage){

        Label l1 = new Label();
        Button jan = new Button("January");
        jan.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("January");
                l1.setText(jan.getText());
            }
        });

        Label l2 = new Label();
        Button feb = new Button("February");
        feb.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("February");
                l2.setText(feb.getText());
            }
        });

        Label l3 = new Label();
        Button march = new Button("March");
        march.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("March");
                l3.setText(march.getText());
            }
        });

        Label l4 = new Label();
        Button april = new Button("April");
        april.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("April");
                l4.setText(april.getText());
            }
        });

        Label l5 = new Label();
        Button may = new Button("May");
        may.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("May");
                l5.setText(may.getText());
            }
        });

        Label l6 = new Label();
        Button june = new Button("June");
        june.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("June");
                l6.setText(june.getText());
            }
        });

        Label l7 = new Label();
        Button july = new Button("July");
        july.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("July");
                l7.setText(july.getText());
            }
        });

        Label l8 = new Label();
        Button aug = new Button("August");
        aug.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("August");
                l8.setText(aug.getText());
            }
        });

        Label l9 = new Label();
        Button sep = new Button("September");
        sep.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("September");
                l9.setText(sep.getText());
            }
        });

        Label l10 = new Label();
        Button oct = new Button("Octomber");
        oct.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("Octomber");
                l10.setText(oct.getText());
            }
        });

        Label l11 = new Label();
        Button nov = new Button("November");
        nov.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("November");
                l11.setText(nov.getText());
            }
        });

        Label l12 = new Label();
        Button dec = new Button("December");
        dec.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
                System.out.println("December");
                l12.setText(dec.getText());
            }
        });

        VBox vb = new VBox(10,jan,feb,march,april,may,june,july,aug,sep,oct,nov,dec,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12);
        //vb.setPrefSize(200, 200);
        vb.setAlignment(Pos.TOP_LEFT);
        vb.setStyle("-fx-background-color: Gold ");
        //vb.setBorder(2);

        Scene sc = new Scene(vb,1200,800);
        sc.setFill(Color.BEIGE);

        
        buttonStage.setScene(sc);
        buttonStage.show();
    }
    
}

