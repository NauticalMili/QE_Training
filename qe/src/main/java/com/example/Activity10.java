package com.example;

import java.util.*;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("John");
        names.add("Hamilton");
        names.add("Milton");
        names.add("Steward");
        names.add("Karna");
        names.add("Rahu");

        System.out.println("The size is: " + names.size());

        names.remove("Rahu");
        if (names.contains("Pranshu"))
            System.out.println("It contains Pranshu");
        else
            System.out.println("It does not contain Pranshu");

        names.forEach(System.out::println);
    }

}
