package com.example;

import java.util.Scanner;

public class MyBook extends Book {

    void setTitle(String s) {
        title = s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBook newNovel = new MyBook();

        String s = "Hello World";
        System.out.println("Enter Book Name");
        s = sc.nextLine();
        newNovel.setTitle(s);

        System.out.println("The title of the book is: " + newNovel.getTitle());
    }
}
