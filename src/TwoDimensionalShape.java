//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//TwoDimensionalShape class

import java.util.Scanner;

// Define an abstract class named TwoDimensionalShape that inherits from Shape
public abstract class TwoDimensionalShape extends Shape {

    // Define an abstract method to compute the area of the two-dimensional shape
    public abstract double computeArea();

    // Define an abstract method to compute the perimeter of the two-dimensional shape
    public abstract double computePerimeter();

    public abstract void readShape(Scanner scanner); // Define an abstract method to read the information of the two-dimensional shape

    public abstract void displayShape(); // Define an abstract method to display the information of the two-dimensional shape
}