package buttonPAge;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MultipleButton2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage buttonStage) {

        Label l1 = new Label("Core2Web.in");
        l1.setPadding(new Insets(100, 0, 0, 0)); // Add padding to the top

        Button cns = createButton("CNS");
        Button os = createButton("OS");
        Button dbms = createButton("DBMS");
        Button java = createButton("Java");
        Button dsa = createButton("DSA");
        Button javafxBtn = createButton("JavaFX");

        HBox hbox1 = new HBox(10, cns, os, dbms);
        HBox hbox2 = new HBox(10, java, dsa, javafxBtn);
        hbox1.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);

        Button nextBtn = new Button("Next");
        nextBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                openNextPage(); // Open next page
            }
        });

        VBox vb = new VBox(20, l1, hbox1, hbox2, nextBtn);
        vb.setAlignment(Pos.CENTER);
        vb.setStyle("-fx-background-color: Gold ");

        Scene sc = new Scene(vb, 500, 500);
        sc.setFill(Color.BEIGE);

        buttonStage.setScene(sc);
        buttonStage.show();
    }

    private Button createButton(String text) {
        Button button = new Button(text);
        button.setStyle("-fx-font-size: 15px; -fx-background-color:LightBlue; -fx-font-weight:bold;");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // Change button background color to green when clicked
                button.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                System.out.println(text);
            }
        });
        return button;
    }

    private void openNextPage() {
        Stage nextStage = new Stage();
        // Create the data for the pie chart
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Agriculture", 17.32),
                        new PieChart.Data("Industry", 29.02),
                        new PieChart.Data("Services", 53.66),
                        new PieChart.Data("Construction", 8.71),
                        new PieChart.Data("Other", 4.29));

        // Create the pie chart
        PieChart chart = new PieChart(pieChartData);
        chart.setTitle("India GDP by Sector");

        // Create a layout container (VBox) to hold the pie chart
        VBox vbox = new VBox(chart);

        // Set up the scene
        Scene scene = new Scene(vbox, 500, 500);

        // Set the scene and show the stage
        nextStage.setScene(scene);
        nextStage.setTitle("Pie Chart");
        nextStage.show();

        // Animate the pie chart
        animatePieChart(chart);
    }

    private void animatePieChart(PieChart chart) {
        // Create a Timeline for animating the pie chart
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, event -> {
                    // Rotate the pie chart
                    chart.setStartAngle(chart.getStartAngle() + 1);
                }),
                new KeyFrame(Duration.millis(15))
        );
        timeline.setCycleCount(Timeline.INDEFINITE); // Repeat indefinitely

        // Stop the animation when a particular section is reached
        chart.getData().forEach(data -> {
            data.getNode().setOnMouseEntered(event -> {
                timeline.stop(); // Stop the animation
                // Display percentage
                System.out.println(data.getName() + ": " + String.format("%.2f", data.getPieValue()) + "%");
            });
        });

        // Start the animation
        timeline.play();
    }

}