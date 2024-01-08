//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//Rectangle Class

import java.util.Scanner; // Import the Scanner class for user input

public class Rectangle extends TwoDimensionalShape { // Define a class named Rectangle that inherits from TwoDimensionalShape

    // Define protected instance variables to store the rectangle's length and width
    protected double length,width;


    // Override the readShape method to read the rectangle's length and width from the provided scanner
    @Override
    public void readShape(Scanner scanner) {
        System.out.println("Enter the rectangle's length and width:"); // Prompt the user to enter the length and width
        length = scanner.nextDouble(); // Read the length value from the scanner

        width = scanner.nextDouble(); // Read the width value from the scanner
    }

    // Override the computeArea method to calculate the area of the rectangle
    @Override
    public double computeArea() {
        return length * width; // Calculate and return the rectangle's area
    }
    // Override the computePerimeter method to calculate the perimeter of the rectangle
    @Override
    public double computePerimeter() {
        return 2 * (length+width); // Calculate and return the rectangle's perimeter
    }

    // Override the displayShape method to display the rectangle's information
    @Override
    public void displayShape() {
        System.out.println("Shape: rectangle"); // Display the shape type
        System.out.println("Length: " + length); // Display the rectangle's length
        System.out.println("Width: " + width); // Display the rectangle's Width
        System.out.println("Area: " + computeArea()); // Display the rectangle's area
        System.out.println("Perimeter: " + computePerimeter()); // Display the rectangle's perimeter
        System.out.println();
    }
}