package org.example.oop.homeworks.inheritance;

public class Triangle extends Figure {

    private double base;

    public Triangle() {
        super();
    }

    public Triangle(double base) {
        super();
        this.base = base;
    }

    public Triangle (double length, double width, double base) {
        super(length, width);
        this.base = base;
    }

    @Override
    public double area () {
        return this.base * this.getLength() * 0.5;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.err.println("Me e madhe se 0");
        }
    }
}
