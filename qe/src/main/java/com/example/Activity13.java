package com.example;

import java.util.*;

public class Activity13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            array.add(x);
        }

        if (n > 0) {
            Random random = new Random();
            int randomIndex = random.nextInt(n);

            System.out.println("The random value is: " + array.get(randomIndex));
        } else {
            System.out.println("No elements to pick from!");
        }

        sc.close();
    }
}