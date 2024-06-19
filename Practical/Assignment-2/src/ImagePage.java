import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ImagePage extends Application {

    @Override
    public void start(Stage imaStage) {
        
        imaStage.setTitle("ImageView Example");
        imaStage.setWidth(1800);
        imaStage.setHeight(1000);
        imaStage.setX(0);
        imaStage.setY(0);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        //Java
        Image javaImage = new Image(getClass().getResourceAsStream("assets/images/java.png"));
        ImageView javaImageView = new ImageView(javaImage);
        javaImageView.setFitWidth(150);
        javaImageView.setFitHeight(150);
        javaImageView.setPreserveRatio(true);

        Label javaLabel = new Label("Java");
        javaLabel.setFont(new Font(20));
        javaLabel.setTextFill(Color.BLACK);

        VBox javaBox = new VBox(10, javaImageView, javaLabel);
        javaBox.setAlignment(Pos.CENTER);
        javaBox.setStyle("-fx-background-color: cyan;");
        javaBox.setPadding(new Insets(10));
        javaBox.setPrefSize(200, 200);
        gridPane.add(javaBox, 0, 0);

        // Spring
        Image springImage = new Image(getClass().getResourceAsStream("assets/images/spring.png"));
        ImageView springImageView = new ImageView(springImage);
        springImageView.setFitWidth(150);
        springImageView.setFitHeight(150);
        springImageView.setPreserveRatio(true);

        Label springLabel = new Label("Spring");
        springLabel.setFont(new Font(20));
        springLabel.setTextFill(Color.BLACK);

        VBox springBox = new VBox(10, springImageView, springLabel);
        springBox.setAlignment(Pos.CENTER);
        springBox.setStyle("-fx-background-color: cyan;");
        springBox.setPadding(new Insets(10));
        springBox.setPrefSize(150, 150);
        gridPane.add(springBox, 1, 0);

        // Python
        Image pythonImage = new Image(getClass().getResourceAsStream("assets/images/python.+png"));
        ImageView pythonImageView = new ImageView(pythonImage);
        pythonImageView.setFitWidth(150);
        pythonImageView.setFitHeight(150);
        pythonImageView.setPreserveRatio(true);

        Label pythonLabel = new Label("Python");
        pythonLabel.setFont(new Font(20));
        pythonLabel.setTextFill(Color.BLACK);

        VBox pythonBox = new VBox(10, pythonImageView, pythonLabel);
        pythonBox.setAlignment(Pos.CENTER);
        pythonBox.setStyle("-fx-background-color: orange;");
        pythonBox.setPadding(new Insets(10));
        pythonBox.setPrefSize(150, 150);
        gridPane.add(pythonBox, 0, 1);

        // React
        Image reactImage = new Image(getClass().getResourceAsStream("assets/images/react.jpg"));
        ImageView reactImageView = new ImageView(reactImage);
        reactImageView.setFitWidth(150);
        reactImageView.setFitHeight(150);
        reactImageView.setPreserveRatio(true);

        Label reactLabel = new Label("React");
        reactLabel.setFont(new Font(20));
        reactLabel.setTextFill(Color.BLACK);

        VBox reactBox = new VBox(10, reactImageView, reactLabel);
        reactBox.setAlignment(Pos.CENTER);
        reactBox.setStyle("-fx-background-color: orange;");
        reactBox.setPadding(new Insets(10));
        reactBox.setPrefSize(150, 150);
        gridPane.add(reactBox, 1, 1);

        // C
        Image cImage = new Image(getClass().getResourceAsStream("assets/images/c.png"));
        ImageView cImageView = new ImageView(cImage);
        cImageView.setFitWidth(150);
        cImageView.setFitHeight(150);
        cImageView.setPreserveRatio(true);

        Label cLabel = new Label("C");
        cLabel.setFont(new Font(20));
        cLabel.setTextFill(Color.BLACK);

        VBox cBox = new VBox(10, cImageView, cLabel);
        cBox.setAlignment(Pos.CENTER);
        cBox.setStyle("-fx-background-color: teal;");
        cBox.setPadding(new Insets(10));
        cBox.setPrefSize(150, 150);
        gridPane.add(cBox, 0, 2);

        // Flutter
        Image flutterImage = new Image(getClass().getResourceAsStream("assets/images/flutter-logo.png"));
        ImageView flutterImageView = new ImageView(flutterImage);
        flutterImageView.setFitWidth(150);
        flutterImageView.setFitHeight(150);
        flutterImageView.setPreserveRatio(true);

        Label flutterLabel = new Label("Flutter");
        flutterLabel.setFont(new Font(20));
        flutterLabel.setTextFill(Color.BLACK);

        VBox flutterBox = new VBox(10, flutterImageView, flutterLabel);
        flutterBox.setAlignment(Pos.CENTER);
        flutterBox.setStyle("-fx-background-color: teal;");
        flutterBox.setPadding(new Insets(10));
        flutterBox.setPrefSize(150, 150);
        gridPane.add(flutterBox, 1, 2);

        // CPP
        Image cppImage = new Image(getClass().getResourceAsStream("assets/images/c++.jpg"));
        ImageView cppImageView = new ImageView(cppImage);
        cppImageView.setFitWidth(150);
        cppImageView.setFitHeight(150);
        cppImageView.setPreserveRatio(true);

        Label cppLabel = new Label("CPP");
        cppLabel.setFont(new Font(20));
        cppLabel.setTextFill(Color.BLACK);

        VBox cppBox = new VBox(10, cppImageView, cppLabel);
        cppBox.setAlignment(Pos.CENTER);
        cppBox.setStyle("-fx-background-color: darkorange;");
        cppBox.setPadding(new Insets(10));
        cppBox.setPrefSize(150, 150);
        gridPane.add(cppBox, 0, 3);

        // Node
        Image nodeImage = new Image(getClass().getResourceAsStream("assets/images/node.png"));
        ImageView nodeImageView = new ImageView(nodeImage);
        nodeImageView.setFitWidth(150);
        nodeImageView.setFitHeight(150);
        nodeImageView.setPreserveRatio(true);

        Label nodeLabel = new Label("Node");
        nodeLabel.setFont(new Font(20));
        nodeLabel.setTextFill(Color.BLACK);

        VBox nodeBox = new VBox(10, nodeImageView, nodeLabel);
        nodeBox.setAlignment(Pos.CENTER);
        nodeBox.setStyle("-fx-background-color: darkorange;");
        nodeBox.setPadding(new Insets(10));
        nodeBox.setPrefSize(150, 150);
        gridPane.add(nodeBox, 1, 3);

        Scene scene = new Scene(gridPane, 400, 800);
        imaStage.setScene(scene);
        imaStage.show();
    }

}











// @Override
// public void start(Stage imaStage) {
    
//     imaStage.setTitle("ImageView Example");
//     imaStage.setWidth(800);
//     imaStage.setHeight(800);
//     imaStage.setX(0);
//     imaStage.setY(0);

//     GridPane gridPane = new GridPane();
//     gridPane.setAlignment(Pos.CENTER);
//     gridPane.setPadding(new Insets(10));
//     gridPane.setHgap(10);
//     gridPane.setVgap(10);

//     // Manually creating each VBox and adding it to the GridPane

//     // Java
//     Image javaImage = new Image(getClass().getResourceAsStream("assets/images/java.png"));
//     ImageView javaImageView = new ImageView(javaImage);
//     javaImageView.setFitWidth(150);
//     javaImageView.setFitHeight(150);
//     javaImageView.setPreserveRatio(true);

//     Label javaLabel = new Label("Java");
//     javaLabel.setFont(new Font(20));
//     javaLabel.setTextFill(Color.BLACK);

//     VBox javaBox = new VBox(10, javaImageView, javaLabel);
//     javaBox.setAlignment(Pos.CENTER);
//     javaBox.setStyle("-fx-background-color: cyan;");
//     javaBox.setPadding(new Insets(10));
//     javaBox.setPrefSize(200, 200);
//     gridPane.add(javaBox, 0, 0);

//     // Spring
//     Image springImage = new Image(getClass().getResourceAsStream("assets/images/spring.png"));
//     ImageView springImageView = new ImageView(springImage);
//     springImageView.setFitWidth(150);
//     springImageView.setFitHeight(150);
//     springImageView.setPreserveRatio(true);

//     Label springLabel = new Label("Spring");
//     springLabel.setFont(new Font(20));
//     springLabel.setTextFill(Color.BLACK);

//     VBox springBox = new VBox(10, springImageView, springLabel);
//     springBox.setAlignment(Pos.CENTER);
//     springBox.setStyle("-fx-background-color: cyan;");
//     springBox.setPadding(new Insets(10));
//     springBox.setPrefSize(200, 200);
//     gridPane.add(springBox, 1, 0);

//     // Python
//     Image pythonImage = new Image(getClass().getResourceAsStream("assets/images/python.png"));
//     ImageView pythonImageView = new ImageView(pythonImage);
//     pythonImageView.setFitWidth(150);
//     pythonImageView.setFitHeight(150);
//     pythonImageView.setPreserveRatio(true);

//     Label pythonLabel = new Label("Python");
//     pythonLabel.setFont(new Font(20));
//     pythonLabel.setTextFill(Color.BLACK);

//     VBox pythonBox = new VBox(10, pythonImageView, pythonLabel);
//     pythonBox.setAlignment(Pos.CENTER);
//     pythonBox.setStyle("-fx-background-color: orange;");
//     pythonBox.setPadding(new Insets(10));
//     pythonBox.setPrefSize(200, 200);
//     gridPane.add(pythonBox, 0, 1);

//     // React
//     Image reactImage = new Image(getClass().getResourceAsStream("assets/images/react.jpg"));
//     ImageView reactImageView = new ImageView(reactImage);
//     reactImageView.setFitWidth(150);
//     reactImageView.setFitHeight(150);
//     reactImageView.setPreserveRatio(true);

//     Label reactLabel = new Label("React");
//     reactLabel.setFont(new Font(20));
//     reactLabel.setTextFill(Color.BLACK);

//     VBox reactBox = new VBox(10, reactImageView, reactLabel);
//     reactBox.setAlignment(Pos.CENTER);
//     reactBox.setStyle("-fx-background-color: orange;");
//     reactBox.setPadding(new Insets(10));
//     reactBox.setPrefSize(200, 200);
//     gridPane.add(reactBox, 1, 1);

//     // C
//     Image cImage = new Image(getClass().getResourceAsStream("assets/images/c.png"));
//     ImageView cImageView = new ImageView(cImage);
//     cImageView.setFitWidth(150);
//     cImageView.setFitHeight(150);
//     cImageView.setPreserveRatio(true);

//     Label cLabel = new Label("C");
//     cLabel.setFont(new Font(20));
//     cLabel.setTextFill(Color.BLACK);

//     VBox cBox = new VBox(10, cImageView, cLabel);
//     cBox.setAlignment(Pos.CENTER);
//     cBox.setStyle("-fx-background-color: teal;");
//     cBox.setPadding(new Insets(10));
//     cBox.setPrefSize(200, 200);
//     gridPane.add(cBox, 0, 2);

//     // Flutter
//     Image flutterImage = new Image(getClass().getResourceAsStream("assets/images/flutter-logo.png"));
//     ImageView flutterImageView = new ImageView(flutterImage);
//     flutterImageView.setFitWidth(150);
//     flutterImageView.setFitHeight(150);
//     flutterImageView.setPreserveRatio(true);

//     Label flutterLabel = new Label("Flutter");
//     flutterLabel.setFont(new Font(20));
//     flutterLabel.setTextFill(Color.BLACK);

//     VBox flutterBox = new VBox(10, flutterImageView, flutterLabel);
//     flutterBox.setAlignment(Pos.CENTER);
//     flutterBox.setStyle("-fx-background-color: teal;");
//     flutterBox.setPadding(new Insets(10));
//     flutterBox.setPrefSize(200, 200);
//     gridPane.add(flutterBox, 1, 2);

//     // CPP
//     Image cppImage = new Image(getClass().getResourceAsStream("assets/images/c++.jpg"));
//     ImageView cppImageView = new ImageView(cppImage);
//     cppImageView.setFitWidth(150);
//     cppImageView.setFitHeight(150);
//     cppImageView.setPreserveRatio(true);

//     Label cppLabel = new Label("CPP");
//     cppLabel.setFont(new Font(20));
//     cppLabel.setTextFill(Color.BLACK);

//     VBox cppBox = new VBox(10, cppImageView, cppLabel);
//     cppBox.setAlignment(Pos.CENTER);
//     cppBox.setStyle("-fx-background-color: darkorange;");
//     cppBox.setPadding(new Insets(10));
//     cppBox.setPrefSize(200, 200);
//     gridPane.add(cppBox, 0, 3);

//     // Node
//     Image nodeImage = new Image(getClass().getResourceAsStream("assets/images/node.png"));
//     ImageView nodeImageView = new ImageView(nodeImage);
//     nodeImageView.setFitWidth(150);
//     nodeImageView.setFitHeight(150);
//     nodeImageView.setPreserveRatio(true);

//     Label nodeLabel = new Label("Node");
//     nodeLabel.setFont(new Font(20));
//     nodeLabel.setTextFill(Color.BLACK);

//     VBox nodeBox = new VBox(10, nodeImageView, nodeLabel);
//     nodeBox.setAlignment(Pos.CENTER);
//     nodeBox.setStyle("-fx-background-color: darkorange;");
//     nodeBox.setPadding(new Insets(10));
//     nodeBox.setPrefSize(200, 200);
//     gridPane.add(nodeBox, 1, 3);

//     Scene scene = new Scene(gridPane, 800, 800);
//     imaStage.setScene(scene);
//     imaStage.show();
// }

