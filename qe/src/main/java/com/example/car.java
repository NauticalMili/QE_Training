package com.example;

public class car {
    String transmission;
    String color;
    int make;
    int tyres;
    int doors;

    car() {
        this.tyres = 4;
        this.doors = 4;
    }

    public void displayCharacteristics() {
        System.out.println("Color: " + color + "\nTransmission: " + transmission + "\nMake: " + make);
    }

    public void accelerate() {
        System.out.println("This car is moving forward");
    }

    public void brake() {
        System.out.println("This car has stopped.");
    }
}