//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//Cylinder Class

import java.util.Scanner; // Import the Scanner class for user input

public class Cylinder extends ThreeDimensionalShape { // Define a class named Cylinder that inherits from ThreeDimensionalShape

    // Define protected instance variables to store the cylinder's radius and height
    protected double radius, height;

    // Override the readShape method to read the cylinder's radius and height from the provided scanner
    @Override
    public void readShape(Scanner scanner) {
        System.out.println("Enter the cylinder's radius and height:"); // Prompt the user to enter the radius and height
        radius = scanner.nextDouble(); // Read the radius value from the scanner

        height = scanner.nextDouble(); // Read the height value from the scanner
    }

    // Override the computeSurfaceArea method to calculate the surface area of the cylinder
    @Override
    public double computeSurfaceArea() {
        // Calculate and return the surface area of the cylinder
        return 2.0 * Math.PI * radius * (radius + height);
    }

    // Override the computeVolume method to calculate the volume of the cylinder
    @Override
    public double computeVolume() {
        // Calculate and return the volume of the cylinder
        return Math.PI * radius * radius * height;
    }

    // Override the displayShape method to display the cylinder's information
    @Override
    public void displayShape() {
        System.out.println("Shape: Cylinder"); // Display the shape type
        System.out.println("Radius: " + radius); // Display the cylinder's radius
        System.out.println("Height: " + height); // Display the cylinder's height
        System.out.println("Surface Area: " + computeSurfaceArea()); // Display the cylinder's surface area
        System.out.println("Volume: " + computeVolume()); // Display the cylinder's volume
        System.out.println();
    }

}