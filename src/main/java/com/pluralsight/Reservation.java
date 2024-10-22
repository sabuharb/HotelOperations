package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePernight;
    private int numberOfNights;
    private boolean isWeekend;

    // Constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.pricePernight = roomType.equals("King") ? 139.00 : 124.00;
    }

    // Getters and Setters


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePernight() {
        return pricePernight;
    }

    public void setPricePernight(double pricePernight) {
        this.pricePernight = pricePernight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    // Derived obtener | get el total de la Reservacion (Precio sube un 10% si es fin de semana)
    public double getReservationTotal() {
        
    }
}
