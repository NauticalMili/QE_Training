package com.example;

public class Activity12 {
    public static void main(String[] args) {
        try {
            exceptionTest("Will print to console");
            exceptionTest("");
        } catch (CustomException e) {
            System.out.println("There is Exception Message : " + e.getMessage());
        }

    }

    public static void exceptionTest(String str) throws CustomException {
        if (str == null || str.isEmpty()) {
            throw new CustomException("String is Empty");
        }

        System.out.println(str);
    }
}