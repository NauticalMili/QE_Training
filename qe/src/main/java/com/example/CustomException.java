package com.example;

public class CustomException extends Exception {
    private String message;

    public CustomException(String mess) {
        this.message = mess;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
