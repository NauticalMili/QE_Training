package com.example;

import java.util.*;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>(Map.of(
                1, "Red",
                2, "Blue",
                3, "Green",
                4, "Yellow",
                5, "Orange"));

        System.out.println(mp);
        mp.remove(3);

        if (mp.containsValue("Green"))
            System.out.println("Contains Green");
        else
            System.out.println("Doesn't contain green.");

        System.out.println("Size: " + mp.size());
    }

}
