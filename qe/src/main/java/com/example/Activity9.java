package com.example;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Milind");
        myList.add("Vivaan");
        myList.add("Pranshu");
        myList.add("Kuldeep");
        myList.add("Akaash");

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.print("\n");
        System.out.println("Third name is: " + myList.get(2));

        if (myList.contains("Pranshu"))
            System.out.println("Yes it does.");
        else
            System.out.println("No it doesn't.");

        System.out.println("Current Size: " + myList.size());

        myList.remove(2);
        System.out.println("New Size: " + myList.size());

    }

}
