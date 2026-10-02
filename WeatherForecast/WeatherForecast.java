
/**
 * Write a description of class WeatherForecast here.
 * To get the forecast of the weather
 * @author Vinesh Konchada
 * @version 10/2/2026
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class WeatherForecast
{
    //define an enum(enumerated type) for fixed weather categories
    public enum WeatherType {
        Sunny,
        Cloudy,
        Rainy,
        Foggy,
        Windy,
        Snowy
    }
    
    public static void main(String[] args) {
        // Create a counter variable to count the number of rainy days
        int rainyDays = 0;
        
        //Array of all possible enum constants
        WeatherType[] options = WeatherType.values();
        
        //Header parts
        //Initializer (int day =1)
        //Condition (day <= 7)
        //Mutator (day++)
        for (int day = 1; day <= 7; day++) {
            // Pick a random index from 0 to the length of our enum
            int rndIndex = (int) (Math.random() * options.length);
            WeatherType today = options[rndIndex];
            
            // Day #: Weather
            System.out.println("Day "+day+": "+today);
            
            //Enums are compared using == because they are ints in the background
            if (today == WeatherType.Rainy) {
                rainyDays++;
            }
        }
        
        System.out.println("They are " + rainyDays + " days of rain in the forecast.");

        System.out.println("All Supported Weather Types:");
        
        //Enhanced for loop (for-each loop)
        //iterates directly through EVERY element in the WeatherType.value
        for (WeatherType w: WeatherType.values()) {
            System.out.println("Category: "+ w);
        }
        
        
        
        for (int i = 3; i <= 99; i+=3) {
            System.out.println(i);
        }
    }
}
