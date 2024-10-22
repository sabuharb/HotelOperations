package com.pluralsight;

public class Room {
    private boolean isOccupied;
    private boolean isDirty;
    private int numberOfBeds;
    private double price;

    // Constructor to initialize the room
    public Room(int numberOfBeds. double price) {
        this.isOccupied = false;
        this.isDirty = true; //Rooms start dirty by default and need to be cleaned
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    // Boolean getter for checking if the room is occupied

    public boolean isOccupied() {
        return isOccupied;
    }

    // Boolean getter for checking if the room is dirty

    public boolean isDirty() {
        return isDirty;
    }

    // Setter for dirty status (Used by Housekeeping to clean the room)

    public void setDirty(boolean dirty) {
        this.isDirty = dirty;
    }


    // Setter for Occupancy (Used when a guest checks in/out)

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    //Derived using a calculator getter to check if the room is available
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    // Getter for the number of beds

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // getter for the price of the room

    public double getPrice() {
        return price;
    }
}

