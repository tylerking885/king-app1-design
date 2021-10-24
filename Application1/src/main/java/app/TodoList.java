/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Tyler King
 */

package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;


public class TodoList extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root =
                FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TodoList.fxml")));

        // attach scene graph to scene
        Scene scene = new Scene(root);

        // displayed in window's title bar
        stage.setTitle("Todo List");

        // attach scene to stage
        stage.setScene(scene);
        
        // display the stage
        stage.show();
    }

    public static void main(String[] args) {
        // create To do list object and call its start method
        launch(args);
    }
}