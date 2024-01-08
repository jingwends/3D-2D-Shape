//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//Sphere Class

import java.util.Scanner; // Import the Scanner class for user input

public class Sphere extends ThreeDimensionalShape { // Define a class named Sphere that inherits from ThreeDimensionalShape

    // Define a protected instance variable to store the sphere's radius
    protected double radius;

    // Override the readShape method to read the sphere's radius from the provided scanner
    @Override
    public void readShape(Scanner scanner) {
        System.out.println("Enter the sphere's radius:"); // Prompt the user to enter the radius
        radius = scanner.nextDouble(); // Read the radius value from the scanner
    }

    // Override the computeSurfaceArea method to calculate the surface area of the sphere
    @Override
    public double computeSurfaceArea() {
        // Calculate and return the surface area of the sphere
        return 4.0 * Math.PI * radius * radius;
    }

    // Override the computeVolume method to calculate the volume of the sphere
    @Override
    public double computeVolume() {
        // Calculate and return the volume of the sphere
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Override the displayShape method to display the sphere's information
    @Override
    public void displayShape() {
        System.out.println("Shape: Sphere"); // Display the shape type
        System.out.println("Radius: " + radius); // Display the sphere's radius
        System.out.println("Surface Area: " + computeSurfaceArea()); // Display the sphere's surface area
        System.out.println("Volume: " + computeVolume()); // Display the sphere's volume
        System.out.println();
    }
}