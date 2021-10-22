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


public class TodoList extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root =
                FXMLLoader.load(getClass().getResource("TodoList.fxml"));

        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Todo List"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage
    }

    public static void main(String[] args) {
        // create To do list object and call its start method
        launch(args);
    }
}

