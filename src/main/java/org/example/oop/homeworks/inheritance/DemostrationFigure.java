package org.example.oop.homeworks.inheritance;

public class DemostrationFigure {
    public static void main(String[] args) {

        //Polymorphism
        Figure figure = new Figure(10,12);
        Figure rectangle = new Rectangle(10,12);
        Figure triangle = new Triangle(10,12,5);

        Rectangle rectangle1 = new Rectangle(10,12);
        Triangle triangle1 = new Triangle(10,12,5);

        System.out.println("Figure are is " +figure.area());
        System.out.println("Rectangle area is " +rectangle.area());
        System.out.println("Triangle area is " +triangle.area());
    }
}
