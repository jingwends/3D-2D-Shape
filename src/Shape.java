//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//Shape class


import java.util.Scanner; // Import the Scanner class for user input


// Define an abstract class named Shape
public abstract class Shape {

    // Define an abstract method to read shape data from the provided scanner
    public abstract void readShape(Scanner scanner);

    // Define an abstract method to display the shape's information
    public abstract void displayShape();
}