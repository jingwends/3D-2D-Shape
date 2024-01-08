//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//Square Class

import java.util.Scanner; // Import the Scanner class for user input

public class Square extends TwoDimensionalShape { // Define a class named Square that inherits from TwoDimensionalShape

    // Define a protected instance variable to store the square's side length
    protected double side;


    // Override the readShape method to read the square's side length from the provided scanner
    @Override
    public void readShape(Scanner scanner) {
        System.out.println("Enter the square's side length:"); // Prompt the user to enter the side length
        side = scanner.nextDouble(); // Read the side length value from the scanner
    }

    // Override the computeArea method to calculate the area of the square
    @Override
    public double computeArea() {
        return side * side; // Calculate and return the square's area
    }

    // Override the computePerimeter method to calculate the perimeter of the square
    @Override
    public double computePerimeter() {
        return 4 * side; // Calculate and return the square's perimeter
    }

    // Override the displayShape method to display the square's information
    @Override
    public void displayShape() {
        System.out.println("Shape: Square"); // Display the shape type
        System.out.println("Side Length: " + side); // Display the square's side length
        System.out.println("Area: " + computeArea()); // Display the square's area
        System.out.println("Perimeter: " + computePerimeter()); // Display the square's perimeter
        System.out.println();
    }
}