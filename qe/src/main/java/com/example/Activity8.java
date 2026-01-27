package com.example;

public class Activity8 {

    public static void exceptionTest(String input) throws CustomException {
        if (input == null)
            throw new CustomException("Error: Provided string is null.");
        else
            System.out.println("Valid input: " + input);
    }

    public static void main(String[] args) {
        try {
            exceptionTest("Non-Null String");
            exceptionTest(null);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}
