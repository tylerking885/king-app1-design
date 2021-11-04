/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Tyler King
 */

package app;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import app.util.EventSerializer;
import javafx.stage.FileChooser;
import javafx.stage.Window;

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
    public ComboBox<String> cbMenu;

    ObservableList<String> menuList = FXCollections.observableArrayList("Load", "Save");

    FileChooser fileChooser = new FileChooser();

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
            fileChooser.setInitialDirectory(new File("C:\\users"));
            cbMenu.setItems(menuList);
            var events = EventSerializer.deserialize();
            eventList.getItems().addAll(events);
        }catch(Exception e)  {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("TodoFX");
            alert.setHeaderText("Events could not be loaded from file system");
        }
    }

    public void comboChanged(ActionEvent event) {

        int selectionIndex = cbMenu.getSelectionModel().getSelectedIndex();

        if (selectionIndex == 1) {
            Window stage = cbMenu.getScene().getWindow();
            fileChooser.setTitle("Save Dialog");
            fileChooser.setInitialFileName("mytodo");
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("text file", "*.txt"));

            try {
                File file = fileChooser.showSaveDialog(stage);
                fileChooser.setInitialDirectory(file.getParentFile());
                saveFile("todo.txt", file);
            } catch (Exception ex) {

            }
        }
        else if (selectionIndex == 0){
            Window stage = cbMenu.getScene().getWindow();
            fileChooser.setTitle("Load Dialog");

            try {
                File file = fileChooser.showOpenDialog(stage);
                fileChooser.setInitialDirectory(file.getParentFile());
            } catch (Exception ex) {

            }
        }
    }
    public void saveFile(String File, File file) {
        // TODO: code for saving a txt file.
    }

    public void openFile(){
        // TODO: code for opening a txt file.
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

        // TODO: code for editing event.
    }

    @FXML
    void done(ActionEvent event) {
        // TODO: code for marking event completed.
    }
}