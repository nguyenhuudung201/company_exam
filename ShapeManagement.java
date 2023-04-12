package com.class1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeManagement {
    public   int number;
    List<Shape> list;
    public ShapeManagement() {
        list = new ArrayList<Shape>();
    }
    public void addNewShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1 to choose Triangle ");
        System.out.println("Enter Number 2 to choose Rectangle ");
        System.out.println("Enter Number 3 to choose Circle ");
        System.out.println("Enter Number: ");
        number=scanner.nextInt();
        Shape s = null;
        if (number == 1) {
            s = new Triangle();
            list.add(s);
        } else if (number == 2) {
            s = new Rectangle();
            list.add(s);
        } else if (number == 3) {
            s = new Circle();
            list.add(s);
        } else {
            System.out.println(" Invalid ");
        }
        s.inputData();

    }
    public void displayAll() {
        for(Shape item: list){
            item.getArea();
            item.getPerimeter();
            item.display();
        }
    }


}
