package com.pluralsight;


class Housekeeping {
    // Method to clean the room
    public void cleanRoom(Room cuarto) {
        if ((cuarto.isDirty())) {
            cuarto.setDirty(false); // Clean the Room
            System.out.println("Room has been cleaned.");
        } else {
            System.out.println("Room is already clean.");
        }
    }

    // Boolean getter to check if the room needs to be cleaned
    public boolean needsCleaning(Room cuarto) {
        return cuarto.isDirty();
    }
}
