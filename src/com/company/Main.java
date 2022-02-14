package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Area Calculator
Create a new project in InteliJ named AreaCalculator using the Command Line App template
Create a new Java class file (File -> New -> Java Class) named Calculator
Your Calculator should have (2) properties: width and height (with assessor methods)
Your calculator should have a method named calculateArea() which:
Accepts width and height parameters
Calculates the area of the rectangle
Returns the area
In your Main class, create and instance of Calculator and test your calculateArea() method
Bonus: modify your program so that your calculator has a shape property, and modify CalaculateArea() to accept shape,
width, and height. Your method should then calculate the area of the shape depending on whether the shape parameter is
“triangle” or “rectangle”, and should return the area
	 */

    Calculator shape = new Calculator();
    Scanner scan = new Scanner(System.in);

    double height;
    double width;
    double area;
    String shapeName;

    System.out.println("Please input the height of your object: ");
    height = scan.nextDouble();

    System.out.println("Please input the width of your object: ");
    width = scan.nextDouble();

    System.out.println("Please input your shape has (rectangle/triangle/square): ");
    shapeName = scan.next();

    area = shape.calculateArea(width, height, shapeName);

    System.out.println("The area is "+area);
    }
}
