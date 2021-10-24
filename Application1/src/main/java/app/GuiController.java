/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Tyler King
 */

package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class GuiController implements Initializable {
    @FXML
    Button addButton;

    @FXML
    Button deleteButton;

    @FXML
    Button editButton;

    @FXML
    Button markButton;

    @FXML
    Button displayMarkButton;

    @FXML
    Button displayNoMarkButton;

    @FXML
    TextField descriptionTextField;

    @FXML
    DatePicker datePicker;

    @FXML
    ListView<LocalEvent> eventList;

    ObservableList<LocalEvent> list = FXCollections.observableArrayList();

    @FXML
    private void addEventHandler() {
        // Declare a new event variable and set it to the Local Event object
        // constructed from the Local event Class variables.

        // Add the variable to the list.

        // Set the DatePicker to a local date.

        // Set the text field with an empty string value.
    }

    public Object[] getEvents(){

        // Return the eventList, an object array.

        // Made null to silence errors.
        return null;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Initialize list with previous entries.
    }

    @FXML
    private void deleteEvent() {
        // Determine the users selected choice in the event list.
        // Delete the correct entry from the event list.
    }

    @FXML
    private void editEvent() {
        // Determine the users selected choice in the event list.
        // Edit the correct entry from the event list.
    }

    @FXML
    private void markEntriesComplete(){
        // Determine the users selected choices in the event list.
        // display a check for completed entries.
    }

    @FXML
    private void displayCompletedTasks(){
        // Display only the tasks that the user previously checked for completion.
    }

    @FXML
    private void displayNonCompletedTasks(){
        // Display only the tasks that the user did not check for completion.
    }
}
