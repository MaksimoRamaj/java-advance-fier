package org.example.oop.homeworks.inheritance;

public class Rectangle extends Figure {

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area (){
        return this.getLength() * this.getWidth();
    }
}
