package com.class1;

import java.util.Scanner;

public class Triangle extends Shape{
   private double side1;
   private double side2;
   private double side3;
   private double Area;
   private double Perimeter;
    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Side1: ");
        side1=input.nextInt();
        System.out.println("Enter Side2: ");
        side2=input.nextInt();
        System.out.println("Enter Side3: ");
        side3 = input.nextInt();
    }

    @Override
    public double getArea() {
        double p =(side1+side2+side3)/2;
        return this.Area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public double getPerimeter() {
        return this.Perimeter=side1+side3+side2;
    }




    @Override
    public void display() {
        System.out.println("Area Triangle: "+Area);
        System.out.println("Perimeter "+Perimeter);
    }
}
