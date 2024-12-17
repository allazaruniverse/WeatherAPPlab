package org.example;

import java.io.File;
import java.io.Reader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherReader wra = new WeatherReader();
        String filepath = "/Users/sique/IdeaProjects/WeatherAPPlab/weather.txt";
        wra.processWeatherFile(filepath);

        }
    }
