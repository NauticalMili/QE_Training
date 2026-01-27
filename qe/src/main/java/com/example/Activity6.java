package com.example;

public class Activity6 {
    public static void main(String[] args) {
        Plane plane = new Plane(10);

        plane.onboard("Milind");
        plane.onboard("Vivaan");
        plane.onboard("Bob");

        System.out.println("Take-off time: " + plane.takeOff());

        System.out.println("Current passengers: " + plane.getPassengers());

        try {
            System.out.println("Plane is in flight...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Flight interrupted!");
        }

        plane.land();
        System.out.println("Landing successful.");
        System.out.println("Last time landed: " + plane.getLastTimeLanded());

        System.out.println("Passengers after landing: " + plane.getPassengers());
    }
}