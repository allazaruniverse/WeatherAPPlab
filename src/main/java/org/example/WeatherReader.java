package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WeatherReader {
        /*
        Step 1: Method to check if the file exists, if file does not exists it throws and
        will throw a WeatherFileNotFoundException
        */


    public void checkFileExists(File file) throws WeatherFileNotfoundException {
        if (!file.exists()) {
            throw new WeatherFileNotfoundException("Weather File not Found!" + file.getAbsolutePath());
        }
    }

    /*
    Step 2: Method to read file using Scanner methods and display the file content
    In this method catch the FileNotFoundException only
    */
    public void readFile(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Weather File Not Found!");
        }
    }

    /*
    Step 3: Method to process the file by combining both tasks.
    In this method catch the WeatherFileNotFoundException only
    */
    public void processWeatherFile(String filePath) {
        File file = new File(filePath);
        try {
            checkFileExists(file);
            readFile(file);
        } catch (WeatherFileNotfoundException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}

