//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//TestShapes class (main class)

import java.util.Scanner; // Import the Scanner class for user input

public class TestShapes { // Create a class named TestShapes
    //create a getShape method to help decide appropriate dynamically-allocated TwoDimensionalShape or TwoDimensionalShape object
    public static Shape getShape(Scanner scanner){
        System.out.println("Enter a shape:"); // Prompt the user to enter their choice
        // Display options for shape selection
        System.out.println("1 for Circle");
        System.out.println("2 for Square");
        System.out.println("3 for Rectangle");
        System.out.println("4 for Cube");
        System.out.println("5 for Sphere");
        System.out.println("6 for Cylinder");

        int choice = scanner.nextInt(); // Read the user's choice as an integer

        Shape shape = null; // Initialize a variable to hold the selected shape object

        switch (choice) { // Use a switch statement to handle different choices
            case 1: // If the choice is 1, create a Circle object
                shape = new Circle();
                break;

            case 2: // If the choice is 2, create a Square object
                shape = new Square();
                break;

            case 3: // If the choice is 3, create a Rectangle object
                shape = new Rectangle();
                break;

            case 4: // If the choice is 4, create a Cube object
                shape = new Cube();
                break;

            case 5: // If the choice is 5, create a Sphere object
                shape = new Sphere();
                break;

            case 6: // If the choice is 6, create a Cylinder object
                shape = new Cylinder();
                break;

            default: // If the choice is not a valid option
                System.out.println("Invalid choice. Please enter a number from 1 to 6."); // Display an error message
                return null; // Return null for invalid choice
        }
        return shape;

    }

    public static void processShape(Shape shape, Scanner scanner) { // Define a method to process the selected shape
        if (shape != null) { //If shape is not null
            shape.readShape(scanner); // Read the shape's data using the provided scanner
            shape.displayShape(); // Display the shape's information
        } else {
            return; // terminate
        }
    }

        public static void main (String[] args) { // Define the main method
            Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
            while (true) {
                Shape shape = getShape(scanner);
                if (shape == null) {
                    break; // Exit the loop and program if null is returned
                }
                processShape(shape, scanner); // Process the selected shape using the defined method
            }

            scanner.close(); // Close the Scanner object to prevent resource leaks
        }
    }