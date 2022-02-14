package com.company;

public class Calculator {

    private double area;

    public double calculateArea(double width, double height, String shape){
        if(shape.equals("rectangle") || shape.equals("square"))
            area = width*height;
        else if(shape.equals("triangle"))
            area = width*height*0.5;
        else {
            System.out.println("I dont know what shape you are thinking of.");
            area = 0;
        }
        return area;
    }



}
