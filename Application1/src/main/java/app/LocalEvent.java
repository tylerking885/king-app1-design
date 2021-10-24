/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Tyler King
 */

package app;

import java.time.LocalDate;

public class LocalEvent {

    // Variables used in the To do list.
    private LocalDate date;
    private String description;

    // Getters and Setters for date and description.
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

    // LocalEvent Constructor:
    public LocalEvent(LocalDate date, String description){
        this.setDate(date);
        this.setDescription(description);
    }

    // Overriding toString method so Display message is in a format that makes sense.
    @Override
    public String toString(){
        return "At: " + this.getDate() + " " + this.getDescription();
    }
}
