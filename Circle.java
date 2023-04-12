package com.class1;

import java.util.Scanner;

public class Circle extends Shape {
    private int r;
    private double area;
    private  double Perimeter;
    @Override
    public void inputData() {
        System.out.print("Enter R : ");
        Scanner input = new Scanner(System.in);
        r=input.nextInt();
    }

    @Override
    public double getArea() {

        return this.area = Math.pow(r, 2)*3.14;
    }

    @Override
    public double getPerimeter() {
        return this.Perimeter=r*2*3.14;
    }



    @Override
    public void display() {
        System.out.println("Area Circle: "+area);
        System.out.println("Perimeter: "+Perimeter);
    }


}
