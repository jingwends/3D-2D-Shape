//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//Cube Class

import java.util.Scanner; // Import the Scanner class for user input

public class Cube extends ThreeDimensionalShape { // Define a class named Cube that inherits from ThreeDimensionalShape

    // Define a protected instance variable to store the cube's side length
    protected double side;


    // Override the readShape method to read the cube's side length from the provided scanner
    @Override
    public void readShape(Scanner scanner) {
        System.out.println("Enter the cube's side length:"); // Prompt the user to enter the side length
        side = scanner.nextDouble(); // Read the side length value from the scanner
    }

    // Override the computeSurfaceArea method to calculate the surface area of the cube
    @Override
    public double computeSurfaceArea() {
        // Calculate and return the surface area of the cube
        return 6 * side * side;
    }

    // Override the computeVolume method to calculate the volume of the cube
    @Override
    public double computeVolume() {
        // Calculate and return the volume of the cube
        return side * side * side;
    }

    // Override the displayShape method to display the cube's information
    @Override
    public void displayShape() {
        System.out.println("Shape: Cube"); // Display the shape type
        System.out.println("Side Length: " + side); // Display the cube's side length
        System.out.println("Surface Area: " + computeSurfaceArea()); // Display the cube's surface area
        System.out.println("Volume: " + computeVolume()); // Display the cube's volume
        System.out.println();
    }
}