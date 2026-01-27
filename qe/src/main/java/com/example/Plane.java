package com.example;

import java.util.*;

class Plane {

    private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeLanded;
    private Date currentDate;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passengerName) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passengerName);
        } else {
            System.out.println("Plane is full!");
        }
    }

    public Date takeOff() {
        return new Date();
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }
}
