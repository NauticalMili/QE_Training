package com.example;

public class Activity1 {
    public static void main(String[] args) {
        car carName = new car();
        carName.make = 2014;
        carName.color = "Black";
        carName.transmission = "Manual";

        carName.displayCharacteristics();
        carName.accelerate();
        carName.brake();

    }
}