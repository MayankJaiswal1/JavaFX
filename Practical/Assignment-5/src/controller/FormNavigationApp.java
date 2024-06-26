package controller;

import dataAccess.FormPage1;
import dataAccess.FormPage2;
import dataAccess.FormPage3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FormNavigationApp extends Application{
    private Stage primaryStage;
    private Scene page1Scene, page2Scene, page3Scene;

    private FormPage1 page1;
    private FormPage2 page2;
    private FormPage3 page3;

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;

        page1 = new FormPage1(this);
        page2 = new FormPage2(this);
        page3 = new FormPage3(this);

        page1Scene = new Scene(page1.getView(), 400, 300);
        page2Scene = new Scene(page2.getView(), 400, 300);
        page3Scene = new Scene(page3.getView(), 400, 300);

        primaryStage.setScene(page1Scene);
        primaryStage.setTitle("Form Navigation");
        primaryStage.show();
    }   
    
    public void navigateToPage1(){
        page2.setField2Value(page2.getField2Value());
        page1.setField1Value(page1.getField1Value());
        primaryStage.setScene((page1Scene));
    }

    public void navigateToPage2(){
        page1.setField1Value(page1.getField1Value());
        page3.setField3Value(page3.getField3Value());
        primaryStage.setScene((page2Scene));
    }

    public void navigateToPage3(){
        page2.setField2Value(page2.getField2Value());
        primaryStage.setScene((page3Scene));
    }

}

     
