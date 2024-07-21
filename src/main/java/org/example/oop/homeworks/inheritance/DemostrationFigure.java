package org.example.oop.homeworks.inheritance;

public class DemostrationFigure {
    public static void main(String[] args) {

        //Polymorphism
        //error sepse nuk e dime figuren
//                Figure figure = new Figure(10,12);
//                Figure figure1 = new Figure(5,12);
    // jep zero ne cdo rast
//        figure.area();

        Figure rectangle = new Rectangle(10,12);
        Figure triangle = new Triangle(10,12,5);

        Rectangle rectangle1 = new Rectangle(10,12);
        Triangle triangle1 = new Triangle(10,12,5);

//        System.out.println("Figure are is " +figure.area());
//        System.out.println("Rectangle area is " +rectangle.area());
//        System.out.println("Triangle area is " +triangle.area());

        Hexagon hexagon = new Hexagon(5,5);
        System.out.println("Perimteri: " + hexagon.circumference());
        System.out.println("Siperfaqja: " + hexagon.area());
    }
}
