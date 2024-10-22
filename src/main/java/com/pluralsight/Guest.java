package com.pluralsight;

public class Guest {
    private String name;
    private Room assignedRoom;

    // Constructor to create a new guest
    public Guest(String name) {
        this.name = name;
    }

    // Assigns a room to the guest
    void setAssignedRoom(Room cuarto) {
        this.assignedRoom = cuarto;
        assignedRoom.setOccupied(true); // Mark room as occupied
    }

    // Getter for the assigned room
    Room getAssignedRoom() {
        return assignedRoom;
    }

    // Checkout method to leave the room
    void checkout() {
        if (assignedRoom != null) {
            assignedRoom.setOccupied(false); // Mark room as not occupied
            assignedRoom.setDirty(true); // Mark room as dirty
            System.out.println(name + " has checked out.");
        } else {
            System.out.println(name + " has no assigned room.");
        }
    }
}
