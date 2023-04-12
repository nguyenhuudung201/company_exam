package com.class1;

public class Main {
    public static void main(String[] args) {
        ShapeManagement shapeManagement = new ShapeManagement();
        shapeManagement.addNewShape();
        shapeManagement.displayAll();
       /* Shape shape[]= new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Triangle();

        double total = 0;
        for (Shape item : shape) {
            item.inputData();
            item.getArea();
            item.display();
            total += item.getArea();
        }

        System.out.println("Total Area: " + total);*/
    }
}
