/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Tyler King
 */

package app;

import app.util.EventSerializer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class TodoList extends Application {
    private static GuiController AppController;

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(loadFXML(), 900, 120);
        stage.setScene(scene);
        stage.setTitle("Todo List");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        EventSerializer.serialize(AppController.getEvents());
        super.stop();
    }

    private static Parent loadFXML() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TodoList.class.getResource("TodoList" + ".fxml"));
        Parent parent = fxmlLoader.load();
        AppController = fxmlLoader.getController();
        return parent;
    }

    public static void main(String[] args) {
        launch();
    }

}