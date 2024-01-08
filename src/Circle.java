//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//Circle Class

import java.util.Scanner; // Import the Scanner class for user input

public class Circle extends TwoDimensionalShape { // Define a class named Circle that inherits from TwoDimensionalShape

    // Define a protected instance variable to store the circle's radius
    protected double radius;


    // Override the readShape method to read the circle's radius from the provided scanner
    @Override
    public void readShape(Scanner scanner) {
        System.out.println("Enter the circle's radius:"); // Prompt the user to enter the radius
        radius = scanner.nextDouble(); // Read the radius value from the scanner
    }

    // Override the computeArea method to calculate the area of the circle
    @Override
    public double computeArea() {
        return Math.PI * radius * radius; // Calculate and return the circle's area
    }

    // Override the computePerimeter method to calculate the perimeter of the circle
    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius; // Calculate and return the circle's perimeter
    }

    // Override the displayShape method to display the circle's information
    @Override
    public void displayShape() {
        System.out.println("Shape: Circle"); // Display the shape type
        System.out.println("Radius: " + radius); // Display the circle's radius
        System.out.println("Area: " + computeArea()); // Display the circle's area
        System.out.println("Perimeter: " + computePerimeter()); // Display the circle's perimeter
        System.out.println();
    }
}