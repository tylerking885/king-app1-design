/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Tyler King
 */

package app;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import app.util.EventSerializer;

public class GuiController implements Initializable {

    @FXML
    Button addButton;

    @FXML
    Button deleteButton;

    @FXML
    Button deleteAllButton;

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

    @FXML
    private void addEventHandler() {

        var newEvent = new LocalEvent(datePicker.getValue(), descriptionTextField.getText());

        eventList.getItems().add(newEvent);

        datePicker.setValue(LocalDate.now());

        descriptionTextField.setText("");
    }

    public Object[] getEvents(){
        return eventList.getItems().toArray();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        try {
            var events = EventSerializer.deserialize();
            eventList.getItems().addAll(events);
        }catch(Exception e)  {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("TodoFX");
            alert.setHeaderText("Events could not be loaded from file system");
        }
    }

    @FXML
    private void deleteSelectedEvent() {
        int selectedID = eventList.getSelectionModel().getSelectedIndex();
        eventList.getItems().remove(selectedID);
    }

    @FXML
    private void deleteAllEvent() { eventList.getItems().clear(); }

    @FXML
    private void editEvent() {
        int selectedID = eventList.getSelectionModel().getSelectedIndex();
        eventList.edit(selectedID);
    }
}