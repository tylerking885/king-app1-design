/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Tyler King
 */

package app;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class LocalEvent implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    // Variables used in the To do list.
    private LocalDate date;
    private String description;
    private boolean completed = false;

    // Getters and Setters for date, description, and completed.
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getCompleted(){
        return completed;
    }

    public void setCompleted() {
        this.completed= true;
    }

    // LocalEvent Constructor:
    public LocalEvent(LocalDate date, String description){
        this.setDate(date);
        this.setDescription(description);
    }

    public LocalEvent(LocalDate date, String description, boolean completed){
        this.setDate(date);
        this.setDescription(description);
        this.completed = completed;
    }

    // Overriding toString method so Display message is in a format that makes sense.
    @Override
    public String toString(){ return "At: " + this.getDate() + ": " + this.getDescription();}
}
