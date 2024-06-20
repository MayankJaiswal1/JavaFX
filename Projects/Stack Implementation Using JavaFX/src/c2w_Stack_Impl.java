import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class c2w_Stack_Impl extends Application {
    private ListView<String> c2w_listView;
    private Button c2w_push_btn, c2w_pop_btn, c2w_peek_btn, c2w_search_btn;
    private TextField c2w_textField;
    private Stack<String> c2w_stack = new Stack<>();
    private Label c2w_output_label, c2w_c2w_stack_label;
    private ImageView c2w_view;
    private static int count = 0;

    public static void main(String[] c2w_stack) {
        launch(c2w_stack);
    }

    private Stage c2w_window;

    @Override
    public void start(Stage c2w_stage) {
        c2w_window = c2w_stage;
        c2w_push_btn = new Button("Push");
        c2w_push_btn.setPrefSize(100, 25);
        c2w_push_btn.setOnAction(this::c2w_methodCall);
        c2w_push_btn.setStyle("-fx-background-color: #0096FF; -fx-font-weight: bold");

        c2w_pop_btn = new Button("Pop");
        c2w_pop_btn.setPrefSize(100, 25);
        c2w_pop_btn.setOnAction(this::c2w_methodCall);
        c2w_pop_btn.setStyle("-fx-background-color: #0096FF; -fx-font-weight: bold");

        c2w_peek_btn = new Button("Peek");
        c2w_peek_btn.setPrefSize(100, 25);
        c2w_peek_btn.setOnAction(this::c2w_methodCall);
        c2w_peek_btn.setStyle("-fx-background-color: #0096FF; -fx-font-weight: bold");

        c2w_search_btn = new Button("Search");
        c2w_search_btn.setPrefSize(100, 25);
        c2w_search_btn.setOnAction(this::c2w_methodCall);
        c2w_search_btn.setStyle("-fx-background-color: #0096FF; -fx-font-weight: bold");

        c2w_textField = new TextField();
        c2w_textField.setPrefSize(100, 25);
        c2w_textField.setStyle("-fx-font-weight: bold");

        c2w_output_label = new Label();
        c2w_output_label.setStyle("-fx-font-weight: bold");

        c2w_c2w_stack_label = new Label();
        c2w_c2w_stack_label.setStyle("-fx-border-width: 2; -fx-border-color: black");
        c2w_c2w_stack_label.setPrefWidth(360);

        try {
            c2w_view = new ImageView(new Image(getClass().getResourceAsStream("/core2web.png")));
        } catch (Exception e) {
            System.out.println("Image not found: " + e.getMessage());
            c2w_view = new ImageView();
        }

        HBox c2w_hb_head = new HBox(c2w_view);
        c2w_hb_head.setStyle("-fx-padding: 20;");
        c2w_hb_head.setPrefHeight(100);

        HBox hb_btn_c2w_textField = new HBox(50, c2w_pop_btn, c2w_textField);
        HBox hb_c2w_output_label = new HBox(50, c2w_output_label);
        hb_c2w_output_label.setAlignment(Pos.CENTER);

        VBox c2w_vb_methods = new VBox(30, c2w_push_btn, hb_btn_c2w_textField, c2w_peek_btn, c2w_search_btn, hb_c2w_output_label);
        c2w_vb_methods.setPrefWidth(600);
        c2w_vb_methods.setAlignment(Pos.CENTER_LEFT);
        c2w_vb_methods.setPadding(new Insets(30));

        c2w_listView = new ListView<>();
        c2w_listView.setCellFactory(param -> new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(item);
                    setStyle("-fx-background-color: #A9C7C5; -fx-border-width: 2; -fx-border-color: #0d394f");
                }
                setAlignment(Pos.CENTER);
            }
        });
        c2w_listView.setPrefSize(50, 700);

        VBox c2w_vb_c2w_stack = new VBox(10, c2w_listView);
        c2w_vb_c2w_stack.setPadding(new Insets(0, 30, 30, 0));
        c2w_vb_c2w_stack.setPrefWidth(400);
        c2w_vb_c2w_stack.setAlignment(Pos.CENTER);

        HBox c2w_hb_impl = new HBox(10, c2w_vb_methods, c2w_vb_c2w_stack);
        c2w_hb_impl.setPrefHeight(600);

        VBox c2w_vb_screen = new VBox(10, c2w_hb_head, c2w_hb_impl);
        BorderPane c2w_root = new BorderPane(c2w_vb_screen);
        Scene c2w_scene = new Scene(c2w_root, 1000, 700);

        c2w_window.setScene(c2w_scene);
        c2w_window.setTitle("Stack Implementation");
        c2w_window.show();
    }

    public void c2w_methodCall(ActionEvent c2w_event) {
        Object c2w_source = c2w_event.getSource();
        if (c2w_source == c2w_push_btn) {
            String item = c2w_textField.getText();
            if (!item.isEmpty()) {
                c2w_stack.push(item);
                count++;
                c2w_listView.getItems().add(0, item);
                c2w_textField.clear();
            } else {
                c2w_output_label.setText("Please Enter Element");
            }
        } else if (c2w_source == c2w_pop_btn) {
            if (!c2w_stack.isEmpty()) {
                c2w_stack.pop();
                count--;
                c2w_output_label.setText(c2w_listView.getItems().get(0));
                c2w_listView.getItems().remove(0);
            } else {
                c2w_output_label.setText("Stack is Empty");
            }
        } else if (c2w_source == c2w_peek_btn) {
            if (!c2w_stack.isEmpty()) {
                c2w_output_label.setText(c2w_listView.getItems().get(0));
            } else {
                c2w_output_label.setText("Stack is Empty");
            }
        } else if (c2w_source == c2w_search_btn) {
            int search = -1;
            if (!c2w_textField.getText().isEmpty()) {
                if (!c2w_stack.isEmpty()) {
                    int i = count;
                    String[] arr = new String[count];
                    c2w_listView.getItems().toArray(arr);
                    while (--i >= 0)
                        if (arr[i].equals(c2w_textField.getText()))
                            search = i;
                    if (search != -1)
                        c2w_output_label.setText("Element found at : " + (++search));
                    else
                        c2w_output_label.setText("Element not found.");
                } else {
                    c2w_output_label.setText("Stack is Empty");
                }
                c2w_textField.clear();
            } else {
                c2w_output_label.setText("Please Enter Element");
            }
        }
    }
}
