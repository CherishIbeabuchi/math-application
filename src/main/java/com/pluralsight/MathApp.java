package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Create a salary
        int bobSalary = 50000;

        //Create a salary
        int garySalary = 65000;

        //Store the higher salary
        int highestSalary = Math.max(bobSalary, garySalary);

        //print the sentence with the highest salary
        System.out.println("The highest salary is " + highestSalary);

        // A line for separation
        System.out.println();


        //Print a nice Header
        System.out.println("~~ #2 lowest vehicle price ~~");

        //Creating variables to represent vehicles prices
        double carPrice = 65789.50;
        double truckPrice = 75346.98;

        //store the lowest vehicle price
        double lowestPrice = Math.min(carPrice, truckPrice);

        //Print out a
        System.out.println("The lowest vehicle price is " + lowestPrice);

        //A blank line for separation
        System.out.println();

        // Find and display the area of a circle who radius is 7.25

        System.out.println("-- #3 area of a circle with a radius of 7.25 --");

        //variables to represent radius and area
        double radius = 7.25;
        double area = Math.PI * radius * radius; //Math.pow(radius, 2);

        //print out a sentence with the area of a circle
        System.out.println("The area of a circle with radius " + radius + " is " + Math.round(area));

        //print a blank line for separation
        System.out.println();

        //Find and display the square root a variable after it is set to 5.0

        //just a header for my question
        System.out.println("~~ #4 square root of 5.0 ~~");

        //create variable to work with
        double numberToGetSquareRootOf = 5.0;

        //print out the result
        System.out.println( "The square root of " + numberToGetSquareRootOf + " is " + Math.round( Math.sqrt(numberToGetSquareRootOf)));

        System.out.println();

        //just printing a visual header
        System.out.println("~~ #5 distance between the points (5,10) and (85,50)~~");

        //Variables for coordinates and distance
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));

        //display the result
        System.out.println("The distance between ("+x2+") and ("+y1+", "+y2+")) is " + distance);

        //print a blank line for separation
        System.out.println();

        //just printing a visual header
        System.out.println("~~ #6 display the absolute (positive) value of a variable");

        //create the variables
        double randomNumber = -3.8;

        //display the result
        System.out.println(randomNumber + " is a random number between 0 and 1");

        //print a blank line for separation
        System.out.println();

        //just printing a visual header
        System.out.println("~~ #8 Minutes and milliseconds in 24 days");

        //create variables
        int numDays = 24;
        int hoursInDay = 24;
        int minutesPerHour = 60;

        //calc minutes
        double totalMinutes = numDays * hoursInDay * minutesPerHour;

        //convert to long to get a human readable number (typecasting)
        long totalMilliseconds = (long) totalMinutes * 60 * 1000;

        System.out.println("There are " +totalMinutes+" minutes in " + numDays+ " days");
        System.out.println("There are " +totalMilliseconds+" milliseconds in " + numDays);





    }
}
