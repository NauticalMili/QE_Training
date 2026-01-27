package com.example;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws Exception {

        File file = new File("swfile.txt");
        file.createNewFile();

        FileUtils.writeStringToFile(file, "Hello FileUtils", "UTF-8");

        File newFile = FileUtils.getFile("swfile.txt");
        String data = FileUtils.readFileToString(newFile, "UTF-8");

        System.out.println(data);
    }
}