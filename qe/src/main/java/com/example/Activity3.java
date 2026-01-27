package com.example;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2488467;
        double VenusSeconds = 6.61519726;
        double MarsSeconds = 1.8888158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447495;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        double years = seconds / EarthSeconds;
        System.out.println("Age On Earth: " + (years));
        System.out.println("Age On Mercury: " + (years / MercurySeconds));
        System.out.println("Age On Venus: " + (years / VenusSeconds));
        System.out.println("Age On Mars: " + (years / MarsSeconds));
        System.out.println("Age On Jupiter: " + (years / JupiterSeconds));
        System.out.println("Age On Saturn: " + (years / SaturnSeconds));
        System.out.println("Age On Uranus: " + (years / UranusSeconds));
        System.out.println("Age On Neptune: " + (years / NeptuneSeconds));
    }
}

// 1 s Earth -> x seconds on planet X
// 100