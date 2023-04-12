package com.class1;

import java.util.Scanner;

public class Rectangle extends  Shape  {
    private int Length;
    private int width;
    private double Perimeter;

    public int Area;
    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length ");
        Length=input.nextInt();
        System.out.println("Enter width ");
        width=input.nextInt();
    }

    @Override
    public double getArea() {

        return this.Area=width*Length ;
    }

    @Override
    public double getPerimeter() {
        return this.Perimeter=(width+Length)*2;
    }



    @Override
    public void display() {
        System.out.println("Area: "+this.Area);
        System.out.println("Perimeter "+this.Perimeter);
    }


}
