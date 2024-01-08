//Name: Jingwen Chen
//Class COSC 5340
//Date: Nov.29th, 2023
//Java OOP Programming Assignment
//ThreeDimensionalShape class

import java.util.Scanner;

public abstract class ThreeDimensionalShape extends Shape{ // Define an abstract class named ThreeDimensionalShape that inherits from Shape
    public abstract double computeSurfaceArea(); // Define an abstract method to compute the surface area of the three-dimensional shape
    public abstract double computeVolume(); // Define an abstract method to compute the volume of the three-dimensional shape
    public abstract void readShape(Scanner scanner); // Define an abstract method to read the information of the three-dimensional shape

    public abstract void displayShape(); // Define an abstract method to display the information of the three-dimensional shape

}
