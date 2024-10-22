package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        // Create a few Cuartos
        Room cuarto1 = new Room(2, 100.00);
        Room cuarto2 = new Room(1, 80.00);

        // Create Huespedes
        Guest huesped1 = new Guest("Safi Abu Harb");
        Guest huesped2 = new Guest("Asali Abu Harb");

        // Assign rooms to Huespedes
        huesped1.assignRoom(cuarto1);
        huesped2.assignRoom(cuarto2);

        //Recamarera limpia Cuarto1 after check out
        huesped1.checkout();
        Housekeeping servicioLimpieza = new Housekeeping();
        servicioLimpieza.cleanRoom(cuarto1);

        // Check if the room is available
        System.out.println("Room 1 available: " + cuarto1.isAvailable());
    }



}

