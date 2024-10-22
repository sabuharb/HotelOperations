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
}
