package org.example.oop.homeworks.inheritance;

public class Hexagon extends Figure{

    public Hexagon(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return (3* Math.sqrt(3))*Math.pow(getWidth(),2) * 0.5;
    }

    public double circumference(){
        return 6 * this.getLength();
    }
}
